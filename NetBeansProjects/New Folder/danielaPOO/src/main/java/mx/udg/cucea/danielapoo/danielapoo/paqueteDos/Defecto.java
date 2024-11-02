/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 24/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteDos;

public class Defecto {
    public static void main(String[] args){
        EjemploDefecto e = new EjemploDefecto();
        e.nombre = "Daniela";
        e.foo();
    }
}

class EjemploDefecto{
    String nombre;
    
    void foo(){
        System.out.println("Soy " +  nombre + " y soy un metodo por defecto!!");
    }
}
