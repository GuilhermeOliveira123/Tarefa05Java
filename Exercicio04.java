package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/* 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e
		escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
		Escrever também a média calcula*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int primeiranota = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		int segundanota = sc.nextInt();
		int notamedia = (primeiranota+segundanota)/2;
			if(notamedia>=6) {
				System.out.println("Aluno aprovado. ");
			}else {
				System.out.println("O aluno está reprovado. ");
			}
			
		sc.close();
		

	}

}
