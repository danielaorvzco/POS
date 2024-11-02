/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 31/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteUno;

public class Estatico {
    public static final double PI = 3.1416;
    
    public static class ClaseInterna{
        public static int metodoInterno(int a){
            return a;
        }
    }
    
    public static int Suma(int num1, int num2){
        return num1 + num2;
    }
}

