
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdoptaService {
    ArrayList<Persona> adoptantes = new ArrayList<>();
    ArrayList<Perro> perros = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crear(){
        String adopto;
        for (int i = 0; i < 10; i++) {
            // Creamos 10 personas
            adoptantes.add(new Persona("Persona", "P", i, null, null));
        }
        
        //CREAMOS PERROS y los añadimos al arreglo
        perros.add(new Perro("Emma", "Pitbull", 4 , 1.30));
        perros.add(new Perro("Lola", "Caniche", 7 , 0.90));
        perros.add(new Perro("Porqueria", "Callejero", 5 , 1.20));
        perros.add(new Perro("Briana", "Callejero", 7 , 1.30));
        perros.add(new Perro("Paco", "Pitbull", 1 , 0.15));
        
        
        for (int i = 0; i < 5; i++) {
            Boolean valid = true;
            System.out.println("Perros disponibles: ");
            for (Perro aux : perros) {
                System.out.println(aux.getNombre());
            }
            System.out.println("\n");
            
            // Se coloca dentro de un while hasta que se realize la adopción
            while(valid){
                System.out.println(adoptantes.get(i).toString());
                System.out.println("Indique el nombre de la mascota que desea adoptar.");
                adopto = leer.next();
                boolean valid2 = true;
                Iterator<Perro> it = perros.iterator();
                
                while (it.hasNext()) {
                    Perro adoptado = it.next();
                    if (adoptado.getNombre().equalsIgnoreCase(adopto)){
                        System.out.println("Felicidades! adoptaste a " + adopto);
                        adoptantes.get(i).setPerro(adoptado);
                        it.remove();
                        valid = false;
                        valid2 = false;
                        break;
                    }
                }
                // Validamos en caso de que no se haya adoptado
                if (valid2) {
                    System.out.println("El nombre que ingresó no se encuentra disponible.");
                }
            }
        }
    }
    
}
