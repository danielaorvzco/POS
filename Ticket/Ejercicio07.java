/* 
   Programación Orientada a Objetos
   Actividad 07: Ticket
   Alumno: Daniela Orozco Ledesma
   Fecha: 10 de Septiembre de 2024
*/

public class Ejercicio07 {

	public static void main(String[] args){

		int subtotal = 450;
		float propina = 0.15f;
		float iva = 0.16f;
		float total;

		propina = subtotal * propina;
		iva = subtotal * iva;
		total = subtotal + propina + iva;

		System.out.println("El subtotal es: " + subtotal);
		System.out.println("La propina del 15% es: " + propina);
		System.out.println("El total de IVA es: " + iva);
		System.out.println("El total a pagar es: " + total);
	}

}