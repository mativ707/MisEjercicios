/*
 * BlackMadia#1443
 */

package Ej5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un país (o 'salir' para terminar): ");
            String pais = scanner.nextLine();

            if (pais.equals("salir")) {
                break;
            }

            paises.add(pais);
            System.out.println("País guardado.");
        }

        System.out.println("Países guardados:");
        paises.forEach((pais) -> {
            System.out.println(pais);
        });

        TreeSet<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("Países ordenados alfabéticamente:");
        paisesOrdenados.forEach((pais) -> {
            System.out.println(pais);
        });

        System.out.println("Ingrese un país para eliminar:");
        String paisEliminar = scanner.nextLine();

        if (paises.contains(paisEliminar)) {
            paises.remove(paisEliminar);
            System.out.println("País eliminado. Países restantes:");
            paises.forEach((pais) -> {
                System.out.println(pais);
            });
        } else {
            System.out.println("El país no se encuentra en la lista.");
        }
    }
}