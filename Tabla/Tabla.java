import java.util.Scanner;

public class Tabla{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int count = 1;
		System.out.print("Ingresa el número ha conocer su tabla: ");
		int numero = input.nextInt();
		while(count <= 10){
			System.out.println(numero + " x " + count + " = " + (numero*count));
			count ++;
		}
	}

}