package ejercicios;

import estructuras.Cola;
import java.util.Scanner;

/**
 * Ejercicio 02: simulación de una fila de clientes atendidos por orden
 * de llegada (FIFO) mediante una COLA y un menú por consola.
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola<String> cola = new Cola<>();
        int opcion = 0;

        do {
            // Menú principal
            System.out.println("\n--- FILA DE CLIENTES ---");
            System.out.println("1) Llegada");
            System.out.println("2) Atender");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Salir");
            System.out.print("Opción: ");

            // Se lee como texto para evitar errores si no se escribe un número
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0; // Opción inválida, se mostrará el aviso
            }

            switch (opcion) {
                case 1:
                    // Llegada: se encola el nombre del cliente
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                    } else {
                        cola.encolar(nombre);
                        System.out.println(nombre + " se ha añadido a la cola.");
                    }
                    break;
                case 2:
                    // Atención: se desencola y se muestra el cliente atendido
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes que atender.");
                    } else {
                        System.out.println("Atendiendo a: " + cola.desencolar());
                    }
                    break;
                case 3:
                    // Estado actual de la cola
                    cola.mostrar();
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}