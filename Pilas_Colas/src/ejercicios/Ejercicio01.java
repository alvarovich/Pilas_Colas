package ejercicios;

import estructuras.Pila;
import java.util.Scanner;

/**
 * Ejercicio 01: invierte un texto usando exclusivamente operaciones de PILA
 * (push, pop e isEmpty). No se recorre el texto hacia atrás ni se usan
 * utilidades como StringBuilder.reverse().
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        Pila<Character> pila = new Pila<>();

        // 1) Se apila cada carácter en el orden normal de lectura
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        // 2) Se desapila mientras haya elementos: salen en orden inverso
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        System.out.println("Texto invertido: " + invertido);
        sc.close();
    }
}