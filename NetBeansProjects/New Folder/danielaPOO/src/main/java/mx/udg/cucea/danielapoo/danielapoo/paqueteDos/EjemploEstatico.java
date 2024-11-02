/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 31/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteDos;
import mx.udg.cucea.danielapoo.danielapoo.paqueteUno.Estatico;

public class EjemploEstatico {
    public static void main(String[] args){
        
        //Ejemplo creando objeto (Instanciando)
        Estatico e = new Estatico();
        System.out.println("Valor de PI: " + e.PI);
        System.out.println("El resultado de la suma es: " + e.Suma(5, 9));
        
        //Ejemlo sin instancias (Agregar static a los metodos y variables)
        System.out.println("\nValor de PI: " + Estatico.PI);
        System.out.println("El resultado de la suma es: " + Estatico.Suma(6, 5));
        System.out.println("Potencia del primer numero: " + Math.pow(2, 2));
        
        Estatico.ClaseInterna ej2 = new Estatico.ClaseInterna();
        //Sin static en el metodo
        System.out.println("\nEl numero es: " + ej2.metodoInterno(8)); 
        
        //Static en clase y metodo
        System.out.println("El numero es: " + Estatico.ClaseInterna.metodoInterno(9));
    }
}
