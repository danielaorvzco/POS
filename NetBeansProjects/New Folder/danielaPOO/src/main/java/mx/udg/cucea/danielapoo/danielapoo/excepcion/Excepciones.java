/**
 * Programación Orientada a Objetos
 * Actividad 00: Excepciones
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 05/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.excepcion;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones {
    public static void main(String[] args){
        //Crear objeto
        EjemploExcepciones e = new EjemploExcepciones();
    }
}

class EjemploExcepciones{
    Scanner input = new Scanner(System.in);
    
    public EjemploExcepciones(){
        try{
            System.out.print("Ingresa el numerador: ");
            int numerador = input.nextInt();
            System.out.print("Ingresa el denominador: ");
            int denominador = input.nextInt();
            
            //Realizar la operacion
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Error: No puedes dividir por 0!");
        }catch(InputMismatchException e){
            System.out.println("Error: Solamente puedes ingresar numeros enteros!");
        }catch(Exception e){
            //Captura cualquier tipo de excepcion
            System.out.println("Ocurrio un error inesperado! " + e.getMessage());
        }finally{
            System.out.println("El bloque finally se ejecutara SIEMPRE");
            input.close();
        }
        
        //Revisar si el Scanner SI cerró
        try{
            System.out.println("Tratando de usar el Scanner: " + input.nextLine());
        }catch(IllegalStateException e){
            System.out.println("El Scanner fue cerrado!");
        }finally{
            System.out.println("Para que no se te olvide, este bloque se ejecutara SIEMPRE!");
        }
    }
}
