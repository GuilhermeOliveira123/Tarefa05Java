package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/* 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual 
		(saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 
		'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'*/
		
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
