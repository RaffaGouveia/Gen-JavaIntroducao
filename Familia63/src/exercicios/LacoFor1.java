package exercicios;

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {
		int num1, num2, i, contador = 0;

		Scanner input = new Scanner(System.in);

		System.out.println(
				"\nDigite números para verificar os números no intervalo entre eles que sejam divisiveis por 3 ou 5");
		System.out.println("\nO primeiro número deve ser menor que o segundo número");
		System.out.println("\nDigite o primeiro número: ");
		num1 = input.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2 = input.nextInt();

		if (num1 < num2) {
			for (i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					contador++;
					System.out.println("\nO número " + i + " é divísivel por 3 e 5!");
				} else if (contador == 0) {
					System.out.println("\nNo intervalo não há números divisíveis por 3 e 5");
				}

			}

		} else {
			System.out.println("Intervalo inválido!");
		}
	}
}