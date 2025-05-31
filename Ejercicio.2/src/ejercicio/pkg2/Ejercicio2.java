
package ejercicio.pkg2;
/**
 * @author Elian
 */

import java.util.Scanner;

public class Ejercicio2 {

    
    
    public static void main(String[] args) {
     
       Scanner entrada = new Scanner (System.in);
       
        System.out.println("Ingrese el presio del articulo");
        double precio = entrada.nextDouble();
     
        double IVA = 0.13 ; 
        
        System.out.println("El precio del preducto es de " + precio );
        
        double total;
        
        total = precio * IVA ;
        
            System.out.println("El IVA agregado es de " + total);
            
                 total =  (precio * IVA) + precio ;
        
            System.out.println("El precio total del producto es de " + total);
                   
                   
         }
    
}
