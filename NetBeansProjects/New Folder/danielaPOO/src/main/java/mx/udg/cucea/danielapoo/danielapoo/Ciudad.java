/**
 * Programación Orientada a Objetos
 * Actividad 12: Introducción a las CLASES / Constructor
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 15/10/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo;
import java.util.Scanner;

public class Ciudad {
    String nombre;
    int grados;
    Scanner input = new Scanner(System.in);
    
    Ciudad(){
        System.out.print("\nIntroduce el nombre de la ciudad: ");
        this.nombre = input.nextLine();
        System.out.print("Introduce la temperatura de la ciudad: ");
        this.grados = input.nextInt();
    }
    
    void nombreCiudad(){
        System.out.println("**Nombre de la ciudad: " + nombre);
    }
    
    void temperaturaCiudad(){
        System.out.println("**La temperatura de la ciudad: " + grados);
    }
    
    void mensaje(){
        if (grados > 25){
            System.out.println("**Temperatura de la ciudad es calida!");
        }else if (grados <= 15){
            System.out.println("**La temperatura de la ciudad es fría!");
        }else{
            System.out.println("**La temperatura de la ciudad es normal!");
        }
    }
}
