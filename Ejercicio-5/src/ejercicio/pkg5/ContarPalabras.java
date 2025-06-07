/**
 * @author Elian
 */
package ejercicio.pkg5;

import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String input = entrada.nextLine();
        
        // Usar trim() para eliminar espacios al inicio y final
        input = input.trim();
        
        // Si la cadena está vacía, el conteo es 0
        if (input.length() == 0) {
            System.out.println("Cantidad de palabras: 0");
            entrada.close();
            return;
        }
        
        // Contar palabras usando solo charAt() y length()
        int wordCount = 1; // Iniciar en 1 porque el primer caracter ya implica una palabra
        boolean isSpace = false;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (!isSpace) {
                    wordCount++;
                    isSpace = true;
                }
            } else {
                isSpace = false;
            }
        }
        
        System.out.println("Cantidad de palabras: " + wordCount);
        
        
    }
}