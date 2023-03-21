package exerciciosDoWhile;

import java.util.Scanner;

public class LacoDoWhile2 {
	public static void main(String[] args) {
		int num, num3 = 0;
		float media = 0;
		Scanner input = new Scanner(System.in);

		System.out.println(
				"\nDigite números para saber a média da soma dos números divísiveis por 3,até que o número 0 seja digitado!");

		do {
			System.out.println("\nDigite um número");
			num = input.nextInt();
			if (num % 3 == 0) {
				media += num;
				num3++;

			}

		} while (num != 0);
		media /= num3;
		System.out.printf("\nA média dos números divididos por 3 é %.1f: ", media);
	}

}
