package exerciciosVariaveiseOperador;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args)
	{
		float salarioBruto,adicionalNoturno,horasExtras,desconto,salarioLiquido;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o salário bruto mensal:");
		salarioBruto = read.nextFloat();
		
		System.out.println("\nDigite o adicional noturno:");
		adicionalNoturno = read.nextFloat();
		
		System.out.println("\nDigite as horas extras mensais:");
		horasExtras = read.nextFloat();
		
		System.out.println("\nDigite o desconto de colaborador mensal:");
		desconto = read.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - desconto;
		
		System.out.println("\nO salário líquido é de: "+salarioLiquido);
		
		

	}

}
