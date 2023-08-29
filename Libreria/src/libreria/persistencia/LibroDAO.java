package libreria.persistencia;
import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {
    
    public Libro buscarPorIsbn(Long isbn) throws Exception {
        try {
            if(isbn == null){
                throw new Exception("No se ha ingresado ningun valor de busqueda.");
            }
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn")
                    .setParameter("isbn", isbn).getSingleResult();
            desconectar();
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public Libro buscarPorTitulo(String nombre) throws Exception{
        try {
            if(nombre == null){
                throw new Exception("Debe indicar un nombre a buscar");
            }
        } catch (Exception e) {
        }
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib "
                + "WHERE lib.titulo LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorAutor(Integer id){
        try {
            if(id == null){
                throw new Exception("Debe indicar el ID del autor a buscar");
            }
        } catch (Exception e) {
        }
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib "
                + "JOIN lib.autor au "
                + "WHERE au.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorEditorial(Integer id){
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib "
                + "JOIN Editorial ed "
                + "WHERE ed.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return libro;
    }
    
    @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    @Override
    public void editar(Libro libro){
        super.editar(libro);
    }
    
    @Override
    public void eliminar(Libro libro){
        try {
            if(libro == null){
                throw new Exception("Debe indicar el ISBN para eliminar");
            }
        } catch (Exception e) {
        }
        super.eliminar(libro);
    }
    
    public ArrayList<Libro> listarLibrosDadosDeAlta(){
        ArrayList<Libro> librosArray = null;
        
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.alta = TRUE").getResultList();
            librosArray = new ArrayList(libros);
            desconectar();
        } catch (Exception e) {
        }
        
        return librosArray;
    }
}
