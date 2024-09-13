/* 
   Programación Orientada a Objetos
   Actividad 08: Licencia de conducir.
   Alumno: Daniela Orozco Ledesma
   Fecha: 12 de Septiembre de 2024
*/

public class Ejercicio08 {

	public static void main(String[] args){

		int edad = 20;
		int calif = 7;
		
		System.out.println("Edad del solicitante: " + edad);
		if(edad >= 18){
			System.out.println("Cumples con la mayoría de edad");
			System.out.println("Califiación del examen: " + calif);
			if(calif >= 8){
				System.out.println("Calificación aprobatoria!!!");
			}else{
				System.out.println("***Calificación desaprobatoria***");
				}
		}else{
			System.out.println("No cumples con la edad mínima para presentar el examen");
			}
	}

}