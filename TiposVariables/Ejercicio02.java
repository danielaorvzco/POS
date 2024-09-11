/* 
   Programación Orientada a Objetos
   Actividad 02: Tipos de datos
   Alumno: Daniela Orozco Ledesma
   Fecha: 03 de Septiembre de 2024
*/

public class Ejercicio02 {
	
	public static void main(String[] args){

		//VARIABLES
		//Variables con tipo de dato Byte
		byte valor = 11;
		System.out.println("Tipo de dato Byte: " + valor);

		//Enteros
		int edad = 21;
 		System.out.println("Tipo de dato Int: " + edad);

		//Flotante
		float peso = 55.55f;
 		System.out.println("Tipo de dato Float: " + peso);

		//Doble
		double cantidad = 88.8;
 		System.out.println("Tipo de dato Double: " + cantidad);

		//Caracter
		char miPrimeraLetra = 'D';
 		System.out.println("Tipo de dato Caracter: " + miPrimeraLetra);

		//Booleano
		boolean casado = false;
 		System.out.println("Estoy casado?: " + casado);
		boolean soltero = true;
 		System.out.println("Estoy soltero?: " + soltero);

		//Reasignar valor a variable
		edad = 22;
 		System.out.println("Edad: " + edad);

		//CONSTANTES
		final double PI = 3.1416;
 		System.out.println("Valor de PI: " + PI);

		//Arrays
		int[] edades = new int[5];
	}
}