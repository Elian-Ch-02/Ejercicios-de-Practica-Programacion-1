/**
 *
 * @author Elian
 */
package ejercicio.pkg6;

import java.util.Scanner;

public class RectanguloAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, altura;
        
        // Solicitar base (validar que sea positivo)
        do {
            System.out.print("Ingrese la base del rectangulo (entero positivo): ");
            base = entrada.nextInt();
        } while (base <= 0);
        
        // Solicitar altura (validar que sea positivo)
        do {
            System.out.print("Ingrese la altura del rectangulo (entero positivo): ");
            altura = entrada.nextInt();
        } while (altura <= 0);
        
        // Dibujar rectángulo con relleno
        System.out.println("\nRectangulo con relleno:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Dibujar rectángulo sin relleno
        System.out.println("\nRectangulo sin relleno:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                // Primera y última fila: todos asteriscos
                if (i == 0 || i == altura - 1) {
                    System.out.print("*");
                } 
                // Otras filas: asterisco solo al inicio y al final
                else {
                    if (j == 0 || j == base - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
       
    }
}

