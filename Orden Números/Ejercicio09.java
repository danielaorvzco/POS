/* 
   Programación Orientada a Objetos
   Actividad 0: 
   Alumno: Daniela Orozco Ledesma
   Fecha: 19 de Septiembre de 2024
*/

public class Ejercicio09 {

	public static void main(String[] args){

		int num1 = 19;
		int num2 = 44;
		int num3 = 22;

		System.out.println("***Números ordenados de mayor a menor***");

		//Estructra para revisar el NUMERO 1
		if (num1 > num2 && num1 >num3){
			if (num2 > num3) {
				System.out.println(" " + num1);
				System.out.println(" " + num2);
				System.out.println(" " + num3);
			} 
			else {
				System.out.println(" " + num1);
				System.out.println(" " + num3);
				System.out.println(" " + num2);
			}
		}

		//Estructura para revisar el NUMERO 2
		if (num2 > num1 && num2 > num3){
			if (num1 > num3) {
				System.out.println(" " + num2);
				System.out.println(" " + num1);
				System.out.println(" " + num3);
			} 
			else {
				System.out.println(" " + num2);
				System.out.println(" " + num3);
				System.out.println(" " + num1);
			}
		}

		//Estructura para revisar el NUMERO 3
		if (num3 > num1 && num3 > num2) {
			if (num1 > num2){
				System.out.println(" " + num3);
				System.out.println(" " + num1);
				System.out.println(" " + num2);
			} 
			else {
				System.out.println(" " + num3);
				System.out.println(" " + num2);
				System.out.println(" " + num1);
			}
		}


	}
}
