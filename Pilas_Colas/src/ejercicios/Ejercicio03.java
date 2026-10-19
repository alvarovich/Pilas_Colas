package ejercicios;

import estructuras.Cola;
import estructuras.Pila;
import java.util.Scanner;

/**
 * Ejercicio 03: comprueba si una palabra o frase es palíndroma usando a la vez
 * una PILA (lectura inversa) y una COLA (lectura directa).
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra o frase: ");
        String original = sc.nextLine();

        // Normalización: minúsculas y sin espacios
        String texto = original.toLowerCase().replace(" ", "");

        Pila<Character> pila = new Pila<>();
        Cola<Character> cola = new Cola<>();

        // Cada carácter se inserta en ambas estructuras
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            pila.push(c);    // La pila devolverá el texto al revés
            cola.encolar(c); // La cola devolverá el texto en su orden original
        }

        // Se comparan los elementos correspondientes al sacarlos de ambas
        boolean esPalindromo = true;
        while (!pila.isEmpty() && esPalindromo) {
            char inversa = pila.pop();
            char directa = cola.desencolar();
            if (inversa != directa) {
                esPalindromo = false; // Basta una diferencia para descartarlo
            }
        }

        if (esPalindromo) {
            System.out.println("\"" + original + "\" ES un palíndromo.");
        } else {
            System.out.println("\"" + original + "\" NO es un palíndromo.");
        }
        sc.close();
    }
}