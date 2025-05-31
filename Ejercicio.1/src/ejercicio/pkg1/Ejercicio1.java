
package ejercicio.pkg1;

import java.util.Scanner;
        
/**
 * @author Elian
 */
public class Ejercicio1 {

    public static void main(String[] args) {
   
    Scanner entrada = new Scanner (System.in);    
    
        System.out.println("Indique el numero que de sea dividir Entre 2");
        int Num = entrada.nextInt();
        
     if (Num % 2 == 0) {
            System.out.println("El numero " + Num + " es divisible en 2.");
        } else {
            System.out.println("El numero " + Num + " no es divisible en 2.");
        }
    }
    
}
