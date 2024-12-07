 /**
 * Programación Orientada a Objetos
 * Actividad 00: Abstracción
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 12/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.abstraccion;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
        System.out.println("°°° CIRCULO °°°");
    }

    @Override
    public double calcularArea() {
        //return (3.1416 * (Math.pow(radio, 2)));
        return Math.PI * Math.pow(radio, 2);
    }
}
