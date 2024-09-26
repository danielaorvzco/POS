/* 
   Programación Orientada a Objetos
   Actividad 00: 
   Alumno: Daniela Orozco Ledesma
   Fecha: 24 de Septiembre de 2024
*/

import java.util.Scanner;

public class RepetirPrograma{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int respuesta = 0;
		do{
			System.out.print("Inserta el número del cual deseas saber su tabla: ");
			int tabla = input.nextInt();
			System.out.println("--------------------");
			System.out.println("TABLA DEL " + tabla);
			System.out.println("--------------------");
			int count = 1;
			while (count <= 10){
				System.out.println(tabla + " x " + count + " = " + (tabla * count));
				count ++;			
			}
			System.out.println(" ");
			System.out.println("Deseas obtener la tabla de otro número");
			System.out.println("SI ---> (1)");
			System.out.println("NO ---> (2)");
			System.out.print("Opción: ");
			respuesta = input.nextInt();
		}while(respuesta == 1);
	}

}