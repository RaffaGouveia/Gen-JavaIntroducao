package exerciciosVariaveiseOperador;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args)
	{
		float salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual é o salário atual? ");
		salario = leia.nextFloat();
		System.out.println("\nQual é o abono?");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
				
				System.out.println("\nO novo salário é de: "+novoSalario);

	}

}
