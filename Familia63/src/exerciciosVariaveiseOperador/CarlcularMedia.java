package exerciciosVariaveiseOperador;

import java.util.Scanner;

public class CarlcularMedia {

	public static void main(String[] args)
	{
		float[] nota = new float[4];
		float media;
		int i;
		Scanner read = new Scanner(System.in);
				
		for(i = 0; i <= 3; i++)
		{
			System.out.println("Digite as notas: ");
			nota[i] = read.nextFloat();
		}
		media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
		System.out.printf("\nA média aritmética é: %.2f",media);
	}
	
	
}
