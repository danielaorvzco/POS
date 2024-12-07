 /**
 * Programación Orientada a Objetos
 * Actividad 00: Abstracción
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 12/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.abstraccion;

public class Abstraccion {
    
    public static void imprimirFigura(Figura figura){
        System.out.println("El color de la figra es: " + figura.getColor() + "\nEl área es: " + figura.calcularArea());
    }
    
    public static void main(String[] args) {
        /*Figura f = new Figura("Verde") NO SE PUEDE INSTANCIAR CLASE ABSTRACTA*/
        
        /*Figura f = new Cuadrado(3, "Azul");
        Circulo c = new Circulo(2.4, "Rojo"); INSTANCIAR NORMAL*/
        
        Abstraccion rec = new Abstraccion();
        rec.imprimirFigura (new Rectangulo(4, 6, "Morado"));
        
        Abstraccion e = new Abstraccion();
        e.imprimirFigura(new Cuadrado(3, "Azul"));
        
        imprimirFigura(new Circulo(5.5, "Rojo"));
        imprimirFigura(new Triangulo(6, 9, "Amarillo"));
    }   
}
