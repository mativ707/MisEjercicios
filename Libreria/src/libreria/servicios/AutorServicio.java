package libreria.servicios;
import java.util.ArrayList;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final AutorDAO dao;
    private LibroServicio libroServ;
    private EditorialServicio editorialServ;
    
    public AutorServicio() {
        this.dao = new AutorDAO();
    }    
    
    public void setServicios(LibroServicio libroServ, EditorialServicio editorialServ){
        this.editorialServ = editorialServ;
        this.libroServ = libroServ;
    }
    
    public Autor buscarAutor() throws Exception{
        Autor autor = null;
        try {
            System.out.println("Desea buscar autor por: 1.NOMBRE 2.ID");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                    System.out.println("Ingrese el nombre del autor: ");
                    String nombre = leer.next();
                    autor = dao.buscarPorNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el ID del autor: ");
                    Integer id = leer.nextInt();
                    autor = dao.buscarPorId(id);
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } catch (Exception e) {
            throw e;
        }
        return autor;
    }
    
    public void crearAutor() throws Exception{
        Autor autor = new Autor();
        ArrayList<Autor> autores = dao.listarAutores();
        try {
            System.out.println("Ingrese el nombre del Autor: ");
            autor.setNombre(leer.next());
            //Corroboramos datos duplicados
            for (Autor aux : autores) {
                if(aux.getNombre().equalsIgnoreCase(autor.getNombre())){
                    throw new Exception("El autor ya se encuentra en la BD");
                }
            }
            if(autor.getNombre() == null){
                throw new Exception("Debe indicar un nombre para el Autor");
            }
            autor.setAlta(Boolean.TRUE);
            dao.guardar(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
            
    }
    
    public void darDeBajaAutor() throws Exception{
        try {
            System.out.println("Ingrese el ID del autor que desea dar de baja/alta: ");
            Integer id = leer.nextInt();
            Autor autor = dao.buscarPorId(id);
            System.out.println("Desea darle: 1.ALTA 2.BAJA");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                    autor.setAlta(Boolean.TRUE);
                    dao.editar(autor);
                    System.out.println("Se dio de alta correctamente! " + autor.toString());
                    break;
                case 2:
                    autor.setAlta(Boolean.FALSE);
                    dao.editar(autor);
                    System.out.println("Se dio de baja correctamente! " + autor.toString());
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    }
