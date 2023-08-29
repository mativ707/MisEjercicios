package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

public class ClienteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ClienteDAO dao;

    public ClienteServicio() {
        this.dao = new ClienteDAO();
    }
    
    public Cliente buscarClientePorDNI(){
        Cliente cliente = null;
        try {
            System.out.println("Ingrese el DNI del cliente que desea buscar: ");
            long DNI = leer.nextLong();
            cliente = dao.buscarClientePorDNI(DNI);
            
            if(cliente == null){
                throw new Exception("El cliente no se ha encontrado en la BD");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return cliente;
    }
    
    public void crearCliente() throws Exception{
        //Creamos cliente
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el N° de documento del cliente: ");
        long documento = leer.nextLong();
        ArrayList<Cliente> clientes = listarClientes();
        //Aqui buscamos si el DNI ya existe
        cliente.setDocumento(documento);
        try {
            
            for (Cliente aux : clientes) {
                if(aux.getDocumento() == cliente.getDocumento()){
                    throw new Exception("El DNI ya se encuentra asociado a otra cuenta");
                }  
            }
            
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = leer.next();
            cliente.setNombre(nombre);
            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = leer.next();
            cliente.setApellido(apellido);
            System.out.println("Ingrese el numero de telefono del cliente: ");
            String num = leer.next();
            cliente.setTelefono(num);
            dao.guardar(cliente);
            System.out.println("Se guardo el cliente correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // DE ESTA FORMA NO SE PARA EL PROGRAMA
        }
        
    }
    
    public ArrayList<Cliente> listarClientes(){
        List<Cliente> clienteList = dao.listarClientes();
        ArrayList<Cliente> clientesArray = new ArrayList<>(clienteList);
        return clientesArray;
    }
}
