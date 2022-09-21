package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
		 * (não é necessário considerar o mês em que a pessoa nasceu).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ano Atual");
		System.out.println("Ano nascimento");
		int anoatual = sc.nextInt();
		int anonascimento = sc.nextInt();
		int voto =anoatual-anonascimento;
		if (voto>18) {
			System.out.println("Você pode votar");
		}else
			System.out.println("Você não pode votar");
		
		sc.close();
	}

}
