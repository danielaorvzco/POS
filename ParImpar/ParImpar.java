import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		int numero = input.nextInt();
		if (numero % 2 == 0){
			System.out.println("El número " + numero + " es PAR");
		}else{
			System.out.println("El número " + numero + " es IMPAR");
		}

	}		
}