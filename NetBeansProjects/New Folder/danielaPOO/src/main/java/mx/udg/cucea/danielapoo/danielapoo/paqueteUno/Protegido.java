/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 29/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteUno;

public class Protegido {
    protected String nombre;
    
    protected void foo(){
        System.out.println("Soy " + nombre + " y soy un metodo Protegido!");
    }
}
