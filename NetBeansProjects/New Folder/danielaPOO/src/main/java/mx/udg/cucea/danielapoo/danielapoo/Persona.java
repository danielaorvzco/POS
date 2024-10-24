
package mx.udg.cucea.danielapoo.danielapoo;
import java.util.Scanner;

public class Persona {
    
    String nombre;
    int edad;
    Scanner input = new Scanner(System.in);
    
    Persona(){
        System.out.print("Introduce tu nombre: ");
        this.nombre = input.nextLine();
        System.out.print("Introduce tu edad: ");
        this.edad = input.nextInt();
    }
    
    void caminar(){
        System.out.println("Soy " + nombre + " y tengo " + edad + " años y estoy caminando!");
    }
    
    void correr(){
        System.out.println("Soy " + nombre + " y tengo " + edad + " años y estoy corriendo!");
    }
    
    void hablar(){
        System.out.println("Soy " + nombre + " y tengo " + edad + " años y estoy hablando!");
    }
    
    void evaluarEdad(){
        if (edad >=18){
            System.out.println(nombre + " es mayor de edad!");
        }else{
            System.out.println(nombre + " es menor de edad!");
        }
    }
    
}
