
package mx.udg.cucea.danielapoo.ejercicios02;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Arreglo {
    Scanner input = new Scanner(System.in);
    int array[] = {5,4,3,2,1};
    int contador = 2;
    int posicion;
    
    Arreglo(){
        try{
            System.out.print("Ingresa la posicion de la que deseas conocer su valor: ");
            posicion = input.nextInt();
            System.out.println("El valor es: " + array[posicion-1]);
        }catch(InputMismatchException e){
            System.out.println("Solo puedes ingresar la posicion en numero entero!!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion esta fuera del rango del arreglo. Ingresa una posicion entre el rango 1 - 5");
        }finally{
            System.out.println("Fin del intento");
        }
    }
}
