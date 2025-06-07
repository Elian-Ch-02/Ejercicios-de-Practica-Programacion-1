/**
 * @author Elian
 */

package ejercicio.pkg8;


import java.util.Scanner;

public class TrianguloRectangulo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar la altura del triángulo
        System.out.print("Ingrese la altura del triangulo: ");
        int altura = entrada.nextInt();
        
        // Validar que la altura sea un número positivo
        if (altura <= 0) {
            System.out.println("La altura debe ser un numero positivo.");
            return;
        }
        
        // Dibujar triángulo con relleno
        System.out.println("\nTriangulo con relleno:");
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Dibujar triángulo sin relleno
        System.out.println("\nTriangulo sin relleno:");
        for (int i = 1; i <= altura; i++) {
            if (i == 1 || i == altura) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }
                if (i > 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}