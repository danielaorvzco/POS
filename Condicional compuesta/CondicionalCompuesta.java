/* 
   Programación Orientada a Objetos
   Actividad : Condicional Compuesta
   Alumno: Daniela Orozco Ledesma
   Fecha: 12 de Septiembre de 2024
*/

public class CondicionalCompuesta {

	public static void main(String[] args) {

		int operacion = 5;
		double num1 = 5;
		double num2 = 4;
		double resultado = 0;

		if(operacion == 1){
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es: " + resultado);
		}
		else if (operacion == 2){
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es: " + resultado);
		}
		else if (operacion == 3){
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicación es: " + resultado);
		}
		else if (operacion == 4){
			resultado = num1 / num2;
			System.out.println("El resultado de la división es: " + resultado);
		}
		else{
			System.out.println("No existe esa OPERACIÓN!!!");
			}
	}
}