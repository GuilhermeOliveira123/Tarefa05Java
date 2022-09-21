package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
		 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% 
		 * sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário fixo");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o valor de vendas efetuado pelo usuário :");
		float valoresVendas = sc.nextFloat();
		
		if (valoresVendas <1501) {
			float salarioFinal = valoresVendas / 100 * 3 + salarioFixo;
			System.out.println("O salario final corresponde a : R$" + salarioFinal);
		}else {
			float salarioFinal02 = (valoresVendas - 1500) * 5 / 100 + (1500 * 3 / 100) + salarioFixo;
			System.out.println("O salario final do vendedor corresponde a : " + salarioFinal02);
		}
		
		sc.close();

	}

}
