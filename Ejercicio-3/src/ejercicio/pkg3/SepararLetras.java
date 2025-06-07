/**
 * @author Elian
 */
package ejercicio.pkg3;

import java.util.Scanner;

public class SepararLetras {

    public static void main(String[] args) {
        
            // Crear objeto Scanner para leer desde consola
        try (Scanner entrada = new Scanner(System.in)) {
            
            // Solicitar palabra al usuario
            System.out.println("Ingrese una palabra: ");
            String palabra = entrada.nextLine();
            
            // Imprimir las letras separadas por espacio
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < palabra.length(); i++) {
                resultado.append(palabra.charAt(i));
                if (i < palabra.length() - 1) {
                    resultado.append(" ");
                }
            }   
            System.out.println("Resultado: " + resultado.toString());
        }
    }
}

