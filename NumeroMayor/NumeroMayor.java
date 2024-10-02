import java.util.Scanner;

public class NumeroMayor{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int numero1 = input.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int numero2 = input.nextInt();
		if (numero1 > numero2){
			System.out.println(numero1 + " es mayor que " + numero2);
		}else{
			System.out.println(numero2 + " es mayor que " + numero1);
		}
	}
}