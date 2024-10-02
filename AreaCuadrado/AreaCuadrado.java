import java.util.Scanner;

public class AreaCuadrado{

	public static void main(String[] args){
	
		int area = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el lado del cuadrado: ");
		int lado = input.nextInt();
		//System.out.println("El área del cuadrado es: " + (lado*lado));
		area = (int)(Math.pow(lado, 2));
		System.out.println("El área del cuadrado es: " + area);
	}
}