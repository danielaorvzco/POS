import java.util.Scanner;

public class Primo{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int primo = 0;
		int suma = 0;
		System.out.print("Ingresa el número: " );
		int numero = input.nextInt();
		if(numero > 1){
			for(int i = 2; i <= numero; i++){
				suma = numero % i;
				if(suma == 0){
					primo = primo + 1;
				}
			}
			if(primo == 1){
				System.out.println(numero + " es número PRIMO");
			}else{
				System.out.println(numero + " no es número primo");
			}
		}else{
			System.out.println("Número no valido, ingrese otro");
		}
	}
}