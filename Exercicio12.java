package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12) Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque 
		e quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia 
		((quantidadem�dia = quantidade m�xima + quantidade m�nima)/2). 
		Se a quantidade em estoque for maior ou igual a quantidade m�dia escrever a mensagem '
		N�o efetuar compra', sen�o escrever a mensagem 'Efetuar compra'.*/

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade atual em estoque do produto: ");
		float quantidadeEstoque = sc.nextFloat();
		
		System.out.println("Digite a quanntidade maxima do estoque: ");
		float maximoEstoque = sc.nextFloat();
		
		System.out.println("Digite a quantidade minima do estoque: ");
		float minimoEstoque = sc.nextFloat();
		
		float quantidadeMedia = (maximoEstoque + minimoEstoque) /2;
		
		if(quantidadeEstoque >= quantidadeMedia) {
			System.out.println("N�o esfetuar a compra");
		}else {
			System.out.println("Efetuar a compra");
		}
		
		sc.close();

	}

}
