package exercicio05tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10) Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
		 * Sabendo-se que ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% 
		 * sobre o que ultrapassar este valor, calcular e escrever o seu sal�rio total.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu sal�rio fixo");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o valor de vendas efetuado pelo usu�rio :");
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
