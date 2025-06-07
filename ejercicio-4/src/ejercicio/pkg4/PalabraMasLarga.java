/**
 * @author Elian
 */
package ejercicio.pkg4;

import java.util.Scanner;

public class PalabraMasLarga {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palabras = new String[5];
        String longestWord = "";
        int maxLength = 0;
        
        // Solicitar 5 palabras al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = entrada.nextLine();
            
            // Verificar si la palabra actual es la más larga
            if (palabras[i].length() > maxLength) {
                maxLength = palabras[i].length();
                longestWord = palabras[i];
            }
        }
        
        // Mostrar la palabra más larga
        System.out.println("La palabra mas larga es: " + longestWord + " (longitud: " + maxLength + ")");
        
        
    }
}