package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// 7) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente.*/
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o segundo Valor: ");
		int valor02 = sc.nextInt();

		if (valor01 > valor02) {
			System.out.println("A ordem Crescente dos numero �: " + valor02 + (",") + valor01);
		} else {
			System.out.println("A ordem Crescente dos numero �: " + valor01 + (",") + valor02);
		}

		sc.close();

	}

}
