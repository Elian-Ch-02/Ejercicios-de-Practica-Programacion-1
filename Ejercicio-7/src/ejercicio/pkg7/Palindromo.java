/**
 *
 * @author Elian
 */

package ejercicio.pkg7;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir la palabra
        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();

        // Convertir a minúsculas para evitar problemas con mayúsculas
        palabra = palabra.toLowerCase();

        // Verificar si es palíndromo
        boolean esPalindromo = true;
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        // Mostrar el resultado
        if (esPalindromo) {
            System.out.println("La palabra \"" + palabra + "\" es un palindromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palindromo.");
        }

        entrada.close();
    }
}
