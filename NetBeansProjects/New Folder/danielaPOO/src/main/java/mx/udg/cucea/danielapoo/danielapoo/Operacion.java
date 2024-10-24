 /**
 * Programación Orientada a Objetos
 * Actividad 13: Herencia
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 22/10/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo;
import java.util.Scanner;

public class Operacion {
    int valor1, valor2, resultado;
    Scanner input = new Scanner(System.in);
    
    void cargar1(){
        System.out.print("\nIngresa el valoro numero 1: ");
        valor1 = input.nextInt();
    }
    
     void cargar2(){
        System.out.print("Ingresa el valoro numero 2: ");
        valor2 = input.nextInt();
    }
     
    void mostrarResultado(){
        System.out.println("El resultado de la operación es: " + resultado);
    }
}

class Suma extends Operacion{
    void Sumar(){
        resultado = valor1 + valor2;
    }
}

class Resta extends Operacion{
    void Restar(){
        resultado = valor1 - valor2;
    }
}
