package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/* 11) Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e escrever o saldo atual 
		(saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem 
		'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da Conta: ");
		float contaCliente = sc.nextFloat();
		
		System.out.println("Digite o Saldo da Conta - " + contaCliente + " : " );
		float saldoEmConta = sc.nextFloat();
		
		System.out.println("Digite seu Debito: ");
		float debitoDaConta = sc.nextFloat();
		
		System.out.println("Digite seu Credito Disponivel: ");
		float creditoEmConta = sc.nextFloat();
		
		float saldoAtual = (saldoEmConta - debitoDaConta) + creditoEmConta;
		
		System.out.println("Cliente : " + contaCliente);
		System.out.println("Saldo da Conta : R$" + saldoEmConta);
		System.out.println("Debito da Conta: R$" + debitoDaConta);
		
		if (saldoAtual >= 0) {
			System.out.println("O Saldo da Conta " + contaCliente + " E Positivo.");
		}else {
			System.out.println("O Saldo da Conta " + contaCliente + " E Negativo");
		}
		
		sc.close();

	}

}
