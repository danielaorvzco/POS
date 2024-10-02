import java.util.Scanner;

public class DiezNumero{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int suma;
		int count = 0;
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;

		System.out.print("Ingresa el primer número: ");
		num1 = input.nextInt();
		System.out.print("Ingresa el segundo número: ");
		num2 = input.nextInt();
		System.out.print("Ingresa el tercer número: ");
		num3 = input.nextInt();
		System.out.print("Ingresa el cuarto número: ");
		num4 = input.nextInt();
		System.out.print("Ingresa el quinto número: ");
		num5 = input.nextInt();
		System.out.print("Ingresa el sexto número: ");
		num6 = input.nextInt();
		System.out.print("Ingresa el séptimo número: ");
		num7 = input.nextInt();
		System.out.print("Ingresa el octavo número: ");
		num8 = input.nextInt();
		System.out.print("Ingresa el noveno número: ");
		num9 = input.nextInt();
		System.out.print("Ingresa el noveno número: ");
		num10 = input.nextInt();

		if(num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6 &&
			num1>num7 && num1>num8 && num1>num9 && num1>num10){
			System.out.println("El número mayor es: " + num1);
		}
		if(num2>num1 && num2>num3 && num2>num4 && num2>num5 && num2>num6 &&
			num2>num7 && num2>num8 && num2>num9 && num2>num10){
			System.out.println("El número mayor es: " + num2);
		}
		if(num3>num1 && num3>num2 && num3>num4 && num3>num5 && num3>num6 &&
			num3>num7 && num3>num8 && num3>num9 && num3>num10){
			System.out.println("El número mayor es: " + num3);
		}
		if(num4>num1 && num4>num2 && num4>num3 && num4>num5 && num4>num6 &&
			num4>num7 && num4>num8 && num4>num9 && num4>num10){
			System.out.println("El número mayor es: " + num4);
		}
		suma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + 			num10;
		System.out.println("La suma de los números es : " + suma);
		System.out.println("El promedio es: " + (suma/10));
	}
}