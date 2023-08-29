package libreria.persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Prestamo;

public class PrestamoDAO extends DAO<Prestamo>{
    
    public Prestamo buscarPrestamoID(Integer id){
        try {
            if (id == null) {
            throw new Exception("No se ha ingresado ningun valor de busqueda");
            }
        } catch (Exception e) {
        }
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT pres FROM Prestamo pres "
                + "WHERE pres.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        
        return prestamo;
    }
    
    public Prestamo buscarPrestamoPorCliente(long dni){
        Long DNI = dni; // Para utilizar el metodo ToString e IsEmpty
        
        try {
            if (Long.toString(DNI).isEmpty()) {
            throw new Exception("No se ha ingresado ningun valor de busqueda");
            }
        } catch (Exception e) {
        }
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT pres FROM Prestamo pres JOIN Cliente cl "
                + "WHERE cl.documento = :dni").setParameter("dni", dni).getSingleResult();
        desconectar();
        
        return prestamo;
    }
    
    public ArrayList<Prestamo> listarPrestamos(){
        
        ArrayList<Prestamo> prestamos = null;
        
        try {
            conectar();
            List<Prestamo> prestam = em.createQuery("SELECT prest FROM Prestamo prest").getResultList();
            prestamos = new ArrayList(prestam);
            desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return prestamos;
    }
    
    @Override
    public void guardar(Prestamo prestamo){
        super.guardar(prestamo);
    }
    
    @Override
    public void editar(Prestamo prestamo){
       super.editar(prestamo);
    }
    
    @Override
    public void eliminar(Prestamo prestamo){
        super.eliminar(prestamo);
    }
}
