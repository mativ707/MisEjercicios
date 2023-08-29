package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

public class ClienteDAO extends DAO<Cliente>{
    
    public Cliente buscarClientePorID(Integer id){
        try {
            if(id == null){
                throw new Exception("No se ha ingresado ningun valor de busqueda");
            }
            
        } catch (Exception e) {
        }
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT cl FROM Cliente cl "
                + "WHERE cl.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return cliente;
    }
    
    public Cliente buscarClientePorDNI(long dni){
        Long DNI = dni;//Le damos Long con mayus para usar el metodo ToSTRING
        try {
            if(Long.toString(DNI).isEmpty()){
                throw new Exception("No se ha ingresado ningun valor de busqueda");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT cl FROM Cliente cl "
                + "WHERE cl.documento = :dni").setParameter("dni", dni).getSingleResult();
        desconectar();
        
        return cliente;
    }
    
    @Override
    public void guardar(Cliente cliente){
        super.guardar(cliente);
    }
    
    @Override
    public void editar(Cliente cliente){
        super.editar(cliente);
    }
    
    @Override
    public void eliminar(Cliente cliente){
        super.eliminar(cliente);
    }
    
    public List<Cliente> listarClientes(){
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT cl FROM Cliente cl").getResultList();
        desconectar();
        
        return clientes;
    }
}
