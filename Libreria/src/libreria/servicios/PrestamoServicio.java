package libreria.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.LibroDAO;
import libreria.persistencia.PrestamoDAO;

public class PrestamoServicio {
    private final PrestamoDAO dao;
    private final LibroDAO libroDAO;
    private AutorServicio autorServ;
    private LibroServicio libroServ;
    private ClienteServicio clienteServ;
    
    Scanner leer = new Scanner(System.in);
    
    public PrestamoServicio() {
        this.dao = new PrestamoDAO();
        this.libroDAO = new LibroDAO();
    }
    
    public void setServicios(AutorServicio autorServ, LibroServicio libroServ, ClienteServicio clienteServ){
        this.autorServ = autorServ;
        this.libroServ = libroServ;
        this.clienteServ = clienteServ;
    }
    
    public void generarPrestamo(){
        Prestamo pres = new Prestamo();
        Libro libro;
        Cliente cliente;
        try {
            System.out.println("Ingrese la fecha en la que retiró el libro: ");
            System.out.println("DAY: ");
            int dia = leer.nextInt();
            System.out.println("MONTH: ");
            int mes = leer.nextInt();
            System.out.println("YEAR: ");
            int year = leer.nextInt();
            Date fechaPrest = new Date(year - 1900, mes - 1, dia);
            //VALIDAMOS LA FECHA
            boolean validez = validarFechaPrestamo(fechaPrest);
            if(!validez){
                throw new Exception("La fecha introducida es anterior a la fecha actual");
            }
            pres.setFechaPrestamo(fechaPrest);
            System.out.println("Se guardo la fecha de prestamo correctamente!");
            cliente = clienteServ.buscarClientePorDNI();
            pres.setCliente(cliente);
            System.out.println("Se asocio correctamente el cliente!" +"\n"+ 
                    "Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            
            libro = libroServ.buscarLibro();
            System.out.println("Se ha encontrado el libro! " + libro.getTitulo());
            //Comprobamos los ejemplares.
            if(libro.getEjemplaresRestantes()>= 1){
                System.out.println("Entrando a if");
                //Restamos el ejemplar prestado
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()- 1);
                System.out.println("Se modifico ejem rest");
                //Sumamos el ejemplar restado correspondiente
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                System.out.println("Se modifico ejem prest");
                System.out.println("Ejemplares restantes: " + libro.getEjemplaresRestantes());
                libroDAO.editar(libro);
                pres.setLibro(libro);
            }else{
                throw new Exception("La cantidad de ejemplares de este libro no son suficientes para realizar"
                        + " un prestamo");
            }
            
            System.out.println("Se asocio correctamente el libro " + libro.getTitulo());
            dao.guardar(pres);
            System.out.println("Se agendo el prestamo del libro correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public boolean validarFechaPrestamo(Date fecha){
        Date fechaActual = new Date();
        boolean validez = false;
        
        if(fechaActual.before(fecha)|| fechaActual.equals(fecha) || fechaActual.after(fecha)){
            validez = true;
        } 
        
        return validez;
    }
    
    public void devolucionLibro(){
        Prestamo prestamo;
        Date fechaDevolucion;
        try {
            System.out.println("Ingrese el DNI del cliente: ");
            long dni = leer.nextLong();
            prestamo = dao.buscarPrestamoPorCliente(dni);
            if(prestamo == null){
                throw new Exception("No se ha encontrado ningun prestamo asociado a este DNI");
            }
            System.out.println("Prestamo encontrado!");
            System.out.println(prestamo.toString());
            System.out.println("Ingrese la fecha de devolucion: ");
            System.out.println("DAY: ");
            int dia = leer.nextInt();
            System.out.println("MONTH: ");
            int mes = leer.nextInt();
            System.out.println("YEAR: ");
            int year = leer.nextInt();
            fechaDevolucion = new Date(year - 1900, mes - 1, dia);
            if(prestamo.getFechaPrestamo().before(fechaDevolucion)){
                throw new Exception("La fecha de devolucion es anterior a la fecha de prestamo");
            }
            if(prestamo.getLibro().getEjemplaresRestantes() < prestamo.getLibro().getEjemplares()){
                prestamo.setFechaDevolucion(fechaDevolucion);
                dao.editar(prestamo);
            }else{
                throw new Exception("No se pueden devolver mas ejemplares de los que ya existen.");
            }
            System.out.println("Se agrego la fecha de devolucion correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void listarPrestamos(){
        try {
            ArrayList<Prestamo> listaPrestamos = dao.listarPrestamos();
            System.out.println("Lista de prestamos: ");
            
            for (Prestamo aux : listaPrestamos) {
                System.out.println(aux);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
