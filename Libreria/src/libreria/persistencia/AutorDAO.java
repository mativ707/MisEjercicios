package libreria.persistencia;
import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Autor;
public class AutorDAO extends DAO<Autor>{
    
    public Autor buscarPorId(Integer id) throws Exception{
        try {
            if(id == null){
                throw new Exception("Debe indicar el ID a buscar");
            }
        } catch (Exception e) {
        }
        conectar(); // Se crea el EntityManagerFactory
        Autor autor = (Autor) em.createQuery("SELECT au FROM Autor au "
                + "WHERE au.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre){
        try {
            if(nombre == null){
                throw new Exception("Debe indicar un nombre a buscar");
            }
        } catch (Exception e) {
        }
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT au FROM Autor au "
                + "WHERE au.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
    
    @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
    
    @Override
    public void editar(Autor autor){
        super.editar(autor);
    }
    
    public void eliminar(Integer id) throws Exception{
        try {
            if(id == null){
                throw new Exception("Debe indicar el ID para eliminar");
            }
        } catch (Exception e) {
        }
       Autor autor = buscarPorId(id);
       super.eliminar(autor);
    }
    
    public ArrayList<Autor> listarAutores(){
        conectar();
        List<Autor> autores = em.createQuery("SELECT au FROM Autor au ").getResultList();
        ArrayList<Autor> autoresArray = new ArrayList(autores);
        desconectar();
        return autoresArray;
    }
}
