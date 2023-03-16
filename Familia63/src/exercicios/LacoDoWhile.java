package exercicios;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		int num, sumPositivo = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\nDigite números para que os positivos sejam somados,até que digite zero!");

		do {
			System.out.println("\nDigite o número: ");
			num = input.nextInt();
			if (num >= 0) {
				sumPositivo += num;
			}

		} while (num != 0);
		System.out.println("A soma dos números positivos é: " + sumPositivo);
	}
}
