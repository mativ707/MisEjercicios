package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final EditorialDAO dao;
    private LibroServicio libroServ;
    private AutorServicio autorServ;
    
    public EditorialServicio() {
        this.dao = new EditorialDAO();
    }
    
    public void setServicios(LibroServicio libroServ, AutorServicio autorServ){
        this.autorServ = autorServ;
        this.libroServ = libroServ;
    }
    
    public Editorial buscarEditorial() throws Exception{
        Editorial editorial = null;
        try {
            System.out.println("Ingrese el ID de la editorial que desea buscar: ");
            Integer id = leer.nextInt();
            editorial = dao.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
        
        return editorial;
    }
    
    public void crearEditorial(){
        Editorial editorial = new Editorial();
        ArrayList<Editorial> editoriales = dao.listarEditoriales();
        try {
            System.out.println("Ingrese el nombre de la Editorial: ");
            editorial.setNombre(leer.next());
            for (Editorial aux : editoriales) {
                if(aux.getNombre().equalsIgnoreCase(editorial.getNombre())){
                    throw new Exception("La editorial ya se encuentra en la BD");
                }
            }
            editorial.setAlta(Boolean.TRUE);
            dao.guardar(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    
    public void darBajaEditorial() throws Exception{
        try {
            System.out.println("Ingrese el ID de la editorial que desea dar de baja/alta: ");
            Integer id = leer.nextInt();
            Editorial editorial = dao.buscarPorId(id);
            System.out.println("Desea darle: 1.ALTA 2.BAJA");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                    editorial.setAlta(Boolean.TRUE);
                    dao.editar(editorial);
                    System.out.println("Se dio de alta correctamente! " + editorial.toString());
                    break;
                case 2:
                    editorial.setAlta(Boolean.FALSE);
                    dao.editar(editorial);
                    System.out.println("Se dio de baja correctamente! " + editorial.toString());
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
