package exerciciosIfElse;

import java.util.Scanner;

public class ElseIf1 {
	public static void main(String[] args) {
		int[] num = new int[3];
		int res, i;
		Scanner read = new Scanner(System.in);

		for (i = 0; i <= 2; i++) {
			System.out.println("\nDigite um número: ");
			num[i] = read.nextInt();
		}
		res = num[0] + num[1];
		if (res > num[2]) {
			System.out.println("\nA soma dos dois primeiros númeors: (" + num[0] + " + " + num[1] + ")"
					+ " é maior que o terceiro número: " + num[2]);
		} else if (res < num[2]) {
			System.out.println("\nA soma dos dois primeiros númeors: (" + num[0] + " + " + num[1] + ")"
					+ " é menor que o terceiro número: " + num[2]);
		} else {
			System.out.println("\nA soma dos dois primeiros númeors: (" + num[0] + " + " + num[1] + ")"
					+ " é igual ao o terceiro número: " + num[2]);
		}

	}
}
