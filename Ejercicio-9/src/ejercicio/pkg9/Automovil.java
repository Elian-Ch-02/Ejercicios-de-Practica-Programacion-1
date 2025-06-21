/**
 *
 * @author Elian
 */

package ejercicio.pkg9;



// ====== SEGMENTO 1: ENUMERACIONES ======
// Estas enumeraciones definen los valores constantes que pueden tomar ciertos atributos

enum TipoCombustible{
    GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
}

enum TipoAutomovil{
     CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
}

enum Color{
    BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
}
        
public class Automovil {
    
     // Atributos privados para garantizar el encapsulamiento
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;
    
     // Constructor que inicializa todos los atributos del automóvil
    public Automovil(String marca, int modelo, double motor, 
                     TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil,
                     int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
                     Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0; // Inicia en reposo
    }
    
    // Métodos para acceder a los valores de los atributos privados
     public String getMarca(){
        return marca; }
    public int getModelo(){
        return modelo; }
    public double getMotor() { 
        return motor; }
    public TipoCombustible getTipoCombustible() { 
        return tipoCombustible; }
    public TipoAutomovil getTipoAutomovil() { 
        return tipoAutomovil; }
    public int getNumPuertas() { 
        return numPuertas; }
    public int getCantidadAsientos() { 
        return cantidadAsientos; }
    public int getVelocidadMaxima() { 
        return velocidadMaxima; }
    public Color getColor() { 
        return color; }
    public int getVelocidadActual() { 
        return velocidadActual; }
    
    
    // Métodos para modificar los valores de los atributos privados
     public void setMarca(String marca) {
         this.marca = marca; }
    public void setModelo(int modelo) { 
         this.modelo = modelo; }
    public void setMotor(double motor) { 
         this.motor = motor; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { 
         this.tipoCombustible = tipoCombustible; }
     public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { 
         this.tipoAutomovil = tipoAutomovil; }
    public void setNumeroPuertas(int numeroPuertas) {
         this.numPuertas = numeroPuertas; }
    public void setCantidadAsientos(int cantidadAsientos) { 
         this.cantidadAsientos = cantidadAsientos;  }
    public void setVelocidadMaxima(int velocidadMaxima) { 
         this.velocidadMaxima = velocidadMaxima; }
    public void setColor(Color color) { 
         this.color = color; }
    
    public void setVelocidadActual(int velocidadActual) { 
        if (velocidadActual >= 0 && velocidadActual <= velocidadMaxima) {
            this.velocidadActual = velocidadActual; 
        } else {
            System.out.println("Velocidad no válida. Debe estar entre 0 y " + velocidadMaxima);
        }
    }
    
     // Método para acelerar el automóvil
    public void acelerar(int cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad a acelerar debe ser positiva.");
            return;
        }
        
        int nuevaVelocidad = velocidadActual + cantidad;
        if (nuevaVelocidad > velocidadMaxima) {
            System.out.println("ADVERTENCIA: No se puede superar la velocidad máxima de " 
                             + velocidadMaxima + " km/h");
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual = nuevaVelocidad;
        }
    }

    // Método para desacelerar el automóvil
    public void desacelerar(int cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad a desacelerar debe ser positiva.");
            return;
        }
        
        int nuevaVelocidad = velocidadActual - cantidad;
        if (nuevaVelocidad < 0) {
            System.out.println("ADVERTENCIA: La velocidad no puede ser negativa. " +
                             "Manteniendo velocidad actual.");
        } else {
            velocidadActual = nuevaVelocidad;
        }
    }

    // Método para frenar completamente
    public void frenar() {
        velocidadActual = 0;
        System.out.println("El Automovil se ha detenido completamente.");
    }

    //  MÉTODO PARA CALCULAR TIEMPO ESTIMADO
    public double calcularTiempoEstimado(double distancia) {
        if (velocidadActual == 0) {
            System.out.println("ADVERTENCIA: No se puede calcular el tiempo con velocidad cero.");
            return -1;
        }
        
        if (distancia < 0) {
            System.out.println("La distancia debe ser positiva.");
            return -1;
        }
        
        // Tiempo = Distancia / Velocidad
        return distancia / velocidadActual;
    }
    // MÉTODO PARA MOSTRAR INFORMACIÓN 
    public void mostrarInformacion() {
        System.out.println("\n========== INFORMACION DEL AUTOMOVIL ==========");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo (anioo): " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automovil: " + tipoAutomovil);
        System.out.println("Numero de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("===============================================\n");
    }
    
}
