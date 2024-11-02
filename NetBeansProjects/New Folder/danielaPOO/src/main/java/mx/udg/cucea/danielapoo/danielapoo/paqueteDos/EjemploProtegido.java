/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 29/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteDos;
import mx.udg.cucea.danielapoo.danielapoo.paqueteUno.Protegido;

public class EjemploProtegido extends Protegido {
    public static void main(String[] args){
        EjemploProtegido p = new EjemploProtegido();
        p.nombre = "Daniela";
        p.foo();
    }
}
