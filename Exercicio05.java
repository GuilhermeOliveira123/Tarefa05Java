package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
		 * (n�o � necess�rio considerar o m�s em que a pessoa nasceu).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ano Atual");
		System.out.println("Ano nascimento");
		int anoatual = sc.nextInt();
		int anonascimento = sc.nextInt();
		int voto =anoatual-anonascimento;
		if (voto>18) {
			System.out.println("Voc� pode votar");
		}else
			System.out.println("Voc� n�o pode votar");
		
		sc.close();
	}

}
