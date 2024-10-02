import java.util.Scanner;

public class AreaRectangulo{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa la altura: ");
		int altura = input.nextInt();
		System.out.print("Ingresa la base: ");
		int base = input.nextInt();
		System.out.println("El área del rectángulo es: " + (base*altura));
	}
}