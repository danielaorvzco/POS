 /**
 * Programación Orientada a Objetos
 * Actividad 00: Abstracción
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 12/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.abstraccion;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
        System.out.println("°°° TRIANGULO °°°");
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
