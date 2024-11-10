/**
 * Programación Orientada a Objetos
 * Actividad 15: Polimorfismo
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 09/11/2024
 */
package mx.udg.cucea.danielapoo.ejercicio15;

public class Ejercicio15 {

    public static void main(String[] args) {
        //Objeto CIRCULO
        Circulo cir1 = new Circulo(3, "Azul");
        cir1.calcularArea();
        
        //Objeto CUADRADO
        Cuadrado cua1 = new Cuadrado(78 , "Rojo");
        cua1.calcularArea();
        
        //Objeto RECTANGULO
        Rectangulo rec1 = new Rectangulo(8, 10, "Verde");
        rec1.calcularArea();
        
        //Objeto TRIANGULO
        Triangulo tri1 = new Triangulo(5, 7, "Amarillo");
        tri1.calcularArea();
    }
}

//CLASE PADRE *FIGURA*
class Figura{
    private String color;
    
    Figura(String color){
        this.color = color;             
    }  

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    //Metodo para calcular el area para polimorfismo 
    void calcularArea(){
        System.out.print("El area del ");
    }
}

//Clase CIRCULO
class Circulo extends Figura{
    static final double PI = 3.1416;
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    void calcularArea() {
        super.calcularArea(); 
        System.out.println("circulo es: " + PI*(Math.pow(radio, 2))); 
    }
}

//Clase CUADRADO
class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        super.calcularArea();
        System.out.println("cuadrado es: " + lado*lado);
    }
}

//Clase RECTANGULO
class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        super.calcularArea();
        System.out.println("rectangulo es: " + base * altura);
    } 
}

//Clase TRIANGULO
class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        super.calcularArea(); 
        System.out.println("triangulo es: " + ((base*altura)/2));
    }
}