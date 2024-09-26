/* 
   Programación Orientada a Objetos
   Actividad 09: Estructura SWITCH
   Alumno: Daniela Orozco Ledesma
   Fecha: 19 de Septiembre de 2024
*/

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args){

		Scanner imput = new Scanner(System.in);
	
		/*System.out.print("Introduce tu nombre: ");
		String nombre = imput.nextLine();
		System.out.println("Tu nombre es: " + nombre);*/

		System.out.println("---------------------------");
		System.out.println("SUMA...................[1]");
		System.out.println("RESTA..................[2]");
		System.out.println("MULTIPLICACIÓN.........[3]");
		System.out.println("---------------------------");
		System.out.print("Introduce valor 1: ");
		double valor1 = imput.nextDouble();
		System.out.print("Introduce valor 2: ");
		double valor2 = imput.nextDouble();
		System.out.print("Introduce una operación que quieres realizar: ");
		int operacion = imput.nextInt();
		System.out.println(" ");

		switch(operacion){
			case 1:
				System.out.println("El resultado de la suma es: " + (valor1 + valor2));
			break;

			case 2: 
				System.out.println("El resultado de la resta es: " + (valor1 - valor2));
			break;

			case 3:
				System.out.println("El resultado de la multiplicación es: " + (valor1 * valor2));
			break;

			default:
				System.out.println("Esa OPERACIÓN NO EXISTE!!!!");
			break;
		}
		/*double numero2 = imput.nextDouble();
		boolean resultado = imput.nextBoolean();
		char letra = imput.nextChar();
		*/
	}

}