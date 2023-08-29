package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

public class Menu {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       private final EditorialServicio edServ = new EditorialServicio();
       private final LibroServicio libServ = new LibroServicio();
       private final AutorServicio autServ = new AutorServicio();
       private final ClienteServicio clientServ = new ClienteServicio();
       private final PrestamoServicio prestServ = new PrestamoServicio();
       
       public Menu(){
           edServ.setServicios(libServ, autServ);
           libServ.setServicios(autServ, edServ);
           edServ.setServicios(libServ, autServ);
           prestServ.setServicios(autServ, libServ,clientServ);
       }
       
       public void ejecucion() throws Exception{
           Boolean salir = true;
           int opMenu;
           int opSubMenu;
           
           while(salir){
               System.out.println("\n"+"MENU");
               System.out.println("1.Crear");
               System.out.println("2.Dar de alta/baja");
               System.out.println("3.Busqueda de autor");
               System.out.println("4.Busqueda de libro");
               System.out.println("5.Modificar libros");
               System.out.println("6.Mostrar libros");
               System.out.println("7.Eliminar libro");
               System.out.println("8.Prestamo de libro");
               System.out.println("9.Mostrar los prestamos realizados");
               System.out.println("10.SALIR");
               
               
               opMenu = leer.nextInt();
               
               switch(opMenu){
                   case 1: //CREAR
                       System.out.println("1.Crear LIBRO / 2.Crear AUTOR / 3.Crear EDITORIAL / 4.CLIENTE");
                       opSubMenu = leer.nextInt();
                       switch(opSubMenu){
                           case 1:
                               libServ.crearLibro();
                               break;
                           case 2:
                               autServ.crearAutor();
                               break;
                           case 3:
                               edServ.crearEditorial();
                               break;
                           case 4:
                               clientServ.crearCliente();
                               break;
                           default:
                               System.out.println("Opcion invalida");
                       }
                       break;
                   case 2://DAR DE ALTA/BAJA
                       System.out.println("Desea alterar: 1.LIBRO / 2.AUTOR / 3.EDITORIAL");
                       opSubMenu = leer.nextInt();
                       switch(opSubMenu){
                           case 1:
                               libServ.darDeBajaLibro();
                               break;
                           case 2:
                               autServ.darDeBajaAutor();
                               break;
                           case 3:
                               edServ.darBajaEditorial();
                               break;
                           default:
                               System.out.println("Opcion invalida");
                               break;
                       }
                       break;
                   case 3://BUSQUEDA DE AUTOR
                       Autor autor = autServ.buscarAutor();
                       System.out.println(autor.toString());
                       break;
                   case 4://BUSQUEDA DE LIBRO
                       Libro lib = libServ.buscarLibro();
                       System.out.println("Libro: " + lib.toString());
                       break;
                   case 5://MODIFICAR LIBRO
                       libServ.modificarLibro();
                       break;
                   case 6://Listar libros
                       libServ.listarLibrosDadosDeAlta();
                       break;
                   case 7://ELIMINAR LIBRO
                       libServ.eliminarLibro();
                       break;
                   case 8://PRESTAMO DE LIBRO
                       System.out.println("Desea: 1.PEDIR LIBRO / 2.DEVOLUCION DE LIBRO");
                       opSubMenu = leer.nextInt();
                       switch(opSubMenu){
                           case 1://PEDIR
                               System.out.println("Usted ya posee una cuenta creada? 1.SI / 2.NO");
                               int resp = leer.nextInt();
                               switch(resp){
                                   case 1:
                                       prestServ.generarPrestamo();
                                       break;
                                   case 2:
                                       clientServ.crearCliente();
                                       prestServ.generarPrestamo();
                                       break;
                                   default:
                                       System.out.println("Opcion invalida");
                                       break;
                               }
                               break;
                           case 2://DEVOLUCION
                               prestServ.devolucionLibro();
                               break;
                           default:
                               System.out.println("Opcion invalida");
                               break;
                       }
                       break;
                   case 9://MOSTRAR PRESTAMOS
                       prestServ.listarPrestamos();
                       break;
                   case 10:
                       salir = false;
                       break;
                   default:
                       System.out.println("Opcion invalida.");
                       break;
               }
           }
       }
}
