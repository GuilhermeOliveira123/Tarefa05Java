package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1)Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
			contr�rio escrever N�O � MAIOR QUE 10!.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		
		int numero=sc.nextInt();
		
		if (numero>10) {
			System.out.println("O numero digitado � maior que 10");
		} else {
			System.out.println("O numero digitado n�o � maior que 10 ");
		}
		
		sc.close();

	}

}
