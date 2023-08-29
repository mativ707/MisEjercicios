package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // Hay que generar el constructor
    private final LibroDAO dao;
    private AutorServicio autorServ;
    private EditorialServicio editorialServ;
    //Aqui
    public LibroServicio() {
        this.dao = new LibroDAO();
    }
    
    public void setServicios(AutorServicio autorServ, EditorialServicio editorialServ){
        this.autorServ = autorServ;
        this.editorialServ = editorialServ;
    }
    
    public Libro buscarLibro(){
        Libro libro = new Libro();
        try {
            System.out.println("Desea buscar libro por: 1.ISBN / 2.AUTOR / 3.EDITORIAL");
            int resp = leer.nextInt();  
            switch(resp){
                case 1:
                    System.out.println("Ingrese el ISBN que desea buscar: ");
                    Long isbn = leer.nextLong();
                    libro = dao.buscarPorIsbn(isbn);
                    break;
                case 2:
                    System.out.println("Ingrese el ID del autor del libro: ");
                    Integer autor = leer.nextInt();
                    libro = dao.buscarPorAutor(autor);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la editorial del libro: ");
                    Integer editorial = leer.nextInt();
                    libro = dao.buscarPorEditorial(editorial);
                    break;
                default:
                    System.out.println("La opcion no es valida.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return libro;
    }
    
    public void crearLibro() throws Exception{
        Libro libro = new Libro();
        ArrayList<Libro> libros = dao.listarLibrosDadosDeAlta();
        try {
            System.out.println("Ingrese el titulo del libro: ");
            libro.setTitulo(leer.next());
            for (Libro aux : libros) {
                if(aux.getTitulo().equalsIgnoreCase(libro.getTitulo())){
                    throw new Exception("El libro ya se encuentra en la BD");
                }
            }
            System.out.println("Ingrese el year del libro: ");
            libro.setAnio(leer.nextInt());
            System.out.println("Ingrese el N° de ejemplares: ");
            libro.setEjemplares(leer.nextInt());
            libro.setEjemplaresRestantes(libro.getEjemplares());
            libro.setEjemplaresPrestados(0);
            System.out.println("Se le va a asignar un autor...");
            libro.setAutor(autorServ.buscarAutor());//Usamos el metodo para asignar autor
            System.out.println("Se le va a asignar una editorial...");
            libro.setEditorial(editorialServ.buscarEditorial()); 
            libro.setAlta(Boolean.TRUE);
            dao.guardar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void darDeBajaLibro() throws Exception{
        try {
            System.out.println("Ingrese el ISBN del libro que desea dar de baja/alta: ");
            Long isbn = leer.nextLong();
            Libro libro = dao.buscarPorIsbn(isbn);
            if(libro == null){
                throw new Exception("El libro que busca no se encuentra en la BD");
            }
            System.out.println("Desea darle: 1.ALTA 2.BAJA");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                    libro.setAlta(Boolean.TRUE);
                    dao.editar(libro);
                    System.out.println("Se dio de alta correctamente! " + libro.toString());
                    break;
                case 2:
                    libro.setAlta(Boolean.FALSE);
                    dao.editar(libro);
                    System.out.println("Se dio de baja correctamente! " + libro.toString());
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void modificarLibro() throws Exception{
        try {
            System.out.println("Ingrese el titulo del libro que desea modificar: ");
            String nombre = leer.next();
            Libro lib = dao.buscarPorTitulo(nombre);
            if(lib == null){
                throw new Exception("El libro no fue encontrado");
            }
            System.out.println("Libro encontrado!: " + lib.toString());
            System.out.println("Ingrese el nuevo Titulo: ");
            lib.setTitulo(leer.next());
            System.out.println("Ingrese el nuevo anio del libro: ");
            lib.setAnio(leer.nextInt());
            System.out.println("Ingrese el nuevo N° de ejemplares: ");
            lib.setEjemplares(leer.nextInt());
            lib.setEjemplaresRestantes(lib.getEjemplares());
            lib.setEjemplaresPrestados(0);
            System.out.println("Se le va a asignar un autor...");
            lib.setAutor(autorServ.buscarAutor());//Usamos el metodo para asignar autor
            System.out.println("Se le va a asignar una editorial...");
            lib.setEditorial(editorialServ.buscarEditorial()); 
            
            System.out.println("LIBRO MODIFICADO: " + lib.toString());
            dao.editar(lib);
            System.out.println("Se guardo correctamente!");
        } catch (Exception e) {
            throw new Exception("Algo salió mal modificando el libro");
        }
    }
    
    public void listarLibrosDadosDeAlta(){
        List<Libro> librosList = dao.listarLibrosDadosDeAlta();
        System.out.println("La lista de libros es: ");
        
        ArrayList<Libro> libros = new ArrayList(librosList);
        
        for (Libro aux : libros) {
            System.out.println(aux.toString());
        }
        
    }
    
    public void eliminarLibro() throws Exception{
        System.out.println("Ingrese el ISBN del libro que desea eliminar: ");
        Long isbn = leer.nextLong();
        Libro libro = dao.buscarPorIsbn(isbn);
        dao.eliminar(libro);
        
    }
}
