/* Progrmación Orientada a Objetos
   Actividad 01: Hello World!
   Alumno: Daniela Orozco Ledesma
   Fecha: 29 de Agosto de 2024
*/

public class Promedio{

	public static void main(String[] args){
		
		int matemáticas = 5;
		int espanol = 10;
		int historia = 8;
		int ingles = 9;
		double prom;
		prom = (matemáticas + espanol + historia + ingles) /4;
		System.out.println("El promedio es: " + prom);
	}
}