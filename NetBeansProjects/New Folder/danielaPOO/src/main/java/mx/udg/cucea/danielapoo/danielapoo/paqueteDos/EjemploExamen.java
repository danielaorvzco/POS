/**
 * Programación Orientada a Objetos
 * Actividad 00: Encapsulamiento
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 31/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteDos;
import mx.udg.cucea.danielapoo.danielapoo.paqueteUno.Examen;

public class EjemploExamen {
    public static void main(String[] args){
        Examen e = new Examen();
        e.setCalificacion(100);
        System.out.println(e.getCalificacion());
    }
}
