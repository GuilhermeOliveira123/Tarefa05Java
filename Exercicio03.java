package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. 
		 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maças compradas :");
		double macascompradas = sc.nextFloat();
		if (macascompradas<12) {
			double calculomacas= macascompradas*1.30;
			System.out.println("O valor a ser pago será " +calculomacas);
		}else if (macascompradas>=12) {
			double calculomacas=macascompradas*1.00;
			System.out.println("O valor a ser pago será "+calculomacas);
			sc.close();
		}
			
	}

}
