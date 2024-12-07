 /**
 * Programación Orientada a Objetos
 * Actividad 00: Abstracción
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 12/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.abstraccion;

public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
        System.out.println("°°°° CUADRADO °°°");
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }    
}
