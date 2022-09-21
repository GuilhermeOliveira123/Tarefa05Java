package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 
		horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que 
		leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser 
		acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantas horas trabalhadas nos mês");
        int horasTrabalhadas=sc.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada $");
        float valorHora=sc.nextFloat();
        float salarioTotal; 
        
        if (horasTrabalhadas>160) {
			salarioTotal=(horasTrabalhadas*valorHora)+((horasTrabalhadas-160)*valorHora)*50/100; 
        	System.out.println("O Salário total do funcionario é: " +salarioTotal);
		} else {

			sc.close();
		}

	}

}
