package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9) A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 
		horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. Escreva um algoritmo que 
		leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser 
		acrescido das horas extras, caso tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas).*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantas horas trabalhadas nos m�s");
        int horasTrabalhadas=sc.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada $");
        float valorHora=sc.nextFloat();
        float salarioTotal; 
        
        if (horasTrabalhadas>160) {
			salarioTotal=(horasTrabalhadas*valorHora)+((horasTrabalhadas-160)*valorHora)*50/100; 
        	System.out.println("O Sal�rio total do funcionario �: " +salarioTotal);
		} else {

			sc.close();
		}

	}

}
