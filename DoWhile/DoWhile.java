/* 
   Programación Orientada a Objetos
   Actividad 00: Estructura WHILE
   Alumno: Daniela Orozco Ledesma
   Fecha: 24 de Septiembre de 2024
*/

import java.util.Scanner;

public class DoWhile{

	public static void main(String[] args){

		int count = 1;
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese número de la tabla que desea obtener: ");
			int tabla = input.nextInt();
			System.out.println("--------------------");
			System.out.println("TABLA DEL " + tabla);
			System.out.println("--------------------");

		
		do{
			System.out.println(tabla + " x " + count + " = " + (tabla * count));
			count ++;
		}while(count <= 10);
	}
}