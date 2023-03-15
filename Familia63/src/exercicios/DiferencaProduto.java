package exercicios;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args)
	{
		float[] numero = new float[4];
		float produto;
		int i;
		
		Scanner read = new Scanner(System.in);
		
		for(i = 0; i <= 3; i++)
		{
			System.out.println("\nDigite os números:");
			numero[i] = read.nextFloat();
		}
		produto = (numero[0] * numero[1]) - (numero[2] * numero[3]);
		System.out.println("A diferença entre os produtos é de: "+produto);
	}

}
