
package ejercicio.pkg9;

/**
 *
 * @author Elian
 */
public class Ejercicio9 {

   
    public static void main(String[] args) {
        System.out.println("=== INICIO DE LA CLASE AUTOMOVIL ===\n");
        
        // 1. Crear una instancia de la clase Automovil con valores realistas
        Automovil miAuto;
        miAuto = new Automovil(
                "Toyota",                    // marca
                2023,                        // modelo
                2.0,                         // motor en litros
                TipoCombustible.GASOLINA,    // tipo de combustible
                TipoAutomovil.COMPACTO,      // tipo de automóvil
                4,                           // número de puertas
                5,                           // cantidad de asientos
                180,                         // velocidad máxima
                Color.AZUL                   // color
        );

        // Mostrar información inicial
        miAuto.mostrarInformacion();

        // 2. Establecer la velocidad inicial a 100 km/h
        System.out.println("2. Estableciendo velocidad inicial a 100 km/h...");
        miAuto.setVelocidadActual(100);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h\n");

        // 3. Aumentar la velocidad en 20 km/h con el método acelerar
        System.out.println("3. Acelerando 20 km/h...");
        miAuto.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h\n");

        // 4. Reducir la velocidad en 50 km/h con desacelerar
        System.out.println("4. Desacelerando 50 km/h...");
        miAuto.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h\n");

        // 5. Detener completamente el vehículo con frenar
        System.out.println("5. Frenando completamente...");
        miAuto.frenar();
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h\n");

        // Demostración adicional del método calcularTiempoEstimado
        System.out.println("=== DEMOSTRACION ADICIONAL ===");
        miAuto.setVelocidadActual(80);
        System.out.println("Estableciendo velocidad a 80 km/h para calcular tiempo...");
        double tiempo = miAuto.calcularTiempoEstimado(160);
        if (tiempo > 0) {
            System.out.println("Tiempo estimado para recorrer 160 km: " + tiempo + " horas");
        }
        
        // Intentar calcular tiempo con velocidad cero
        miAuto.frenar();
        miAuto.calcularTiempoEstimado(100);
    }
    
}
