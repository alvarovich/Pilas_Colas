package ejercicios;

import estructuras.Pila;
import java.util.Scanner;

/**
 * Ejercicio 04: convierte un entero decimal positivo a binario usando una PILA.
 * Se apilan los restos de dividir entre 2 y al desapilarlos se obtiene el binario.
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un entero decimal positivo: ");

        int numero;
        try {
            numero = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida: debe ser un número entero.");
            sc.close();
            return;
        }

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            sc.close();
            return;
        }

        Pila<Integer> pila = new Pila<>();
        int original = numero;

        if (numero == 0) {
            pila.push(0); // Caso especial: el bucle no se ejecutaría con 0
        }

        // Divisiones sucesivas entre 2: cada resto se apila
        while (numero > 0) {
            pila.push(numero % 2);
            numero = numero / 2;
        }

        // Al desapilar, los restos salen del último al primero = binario correcto
        String binario = "";
        while (!pila.isEmpty()) {
            binario += pila.pop();
        }

        System.out.println(original + " en binario es: " + binario);
        sc.close();
    }
}
