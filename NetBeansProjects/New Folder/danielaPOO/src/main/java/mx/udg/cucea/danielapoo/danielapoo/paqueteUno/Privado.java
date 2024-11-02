/**
 * Programación Orientada a Objetos
 * Actividad 00: Modificadores
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 24/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteUno;
import java.util.Scanner;

public class Privado {
    public static void main(String[] args){
        EjemploPrivado e = new EjemploPrivado();
        //e.nombre = "Daniela;
        //e.foo();
        
        //EjemploDefecto d = new EjemploDefecto();
    }
}


class EjemploPrivado{
    private String nombre;
    private String numero;
    public Scanner input = new Scanner(System.in);
    
    EjemploPrivado(){
        System.out.print("Introduce un numero: ");
        numero = input.nextLine();
        
        if(esNumero(numero)){
            double nuevoValor = Double.parseDouble(numero);
            nuevoValor = nuevoValor * 2;
            System.out.println("Has introducido un numero " + nuevoValor);
        }else{
            System.out.println("ERROR!!! Solo se permiten valores numericos");
        }
    }
    
    private boolean esNumero(String str){
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}