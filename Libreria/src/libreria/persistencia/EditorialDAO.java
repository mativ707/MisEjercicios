package libreria.persistencia;
import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {
    
    public Editorial buscarPorId(Integer id) throws Exception {
        try {
            if(id == null){
                throw new Exception("Debe indicar el ID a buscar");
            }
        } catch (Exception e) {
        }
        conectar(); //Se crea el EntityManagerFactory
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e "
                + "WHERE e.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }
    
    @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    
    @Override
    public void editar(Editorial editorial){
        super.editar(editorial);
    }
    
    public void eliminar(Integer id) throws Exception{
        try {
            if(id == null){
                throw new Exception("Debe indicar el ID para eliminar");
            }
        } catch (Exception e) {
        }
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public ArrayList<Editorial> listarEditoriales(){
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT ed FROM Editorial ed ").getResultList();
        ArrayList<Editorial> editorialesArray = new ArrayList(editoriales);
        desconectar();
        return editorialesArray;
    }
}
