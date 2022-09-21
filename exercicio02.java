package exercicio05tarefaflamingo;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		/*2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		
		int numero=sc.nextInt();
		
		if (numero>=0) {
			System.out.println("Positivo");
		}else {
			{
				System.out.println("Negativo");
			}
		}
			
		sc.close();

	}

}
