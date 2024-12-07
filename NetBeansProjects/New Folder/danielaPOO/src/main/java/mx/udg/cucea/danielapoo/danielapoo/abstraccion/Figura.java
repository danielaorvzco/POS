 /**
 * Programación Orientada a Objetos
 * Actividad 00: Abstracción
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 12/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.abstraccion;

public abstract class Figura {
    
    private String color;

    public Figura(String color) {
        this.color = color;
        System.out.println("");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
}
