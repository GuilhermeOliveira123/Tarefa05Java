package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//6) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles.*/
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		int valor02 = sc.nextInt();

		if (valor01 > valor02) {
			System.out.println("O maior Valor � : "+valor01);
		}else {
			System.out.println("O maior valor � : "+valor02);
		}
		
		sc.close();
		

	}

}
