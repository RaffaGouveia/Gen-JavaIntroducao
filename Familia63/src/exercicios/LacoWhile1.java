package exercicios;

import java.util.Scanner;

public class LacoWhile1 {

	public static void main(String[] args) {
		int idade, v1 = 0, v2 = 0;
		Scanner input = new Scanner(System.in);

		System.out.println(
				"\nDigite a idade de várias pessoas e contar quantas tem menos de 21 e quantas tem mais de 50 anos");
		idade = input.nextInt();

		while (idade >= 0) {
			if (idade < 21 && idade >= 0) {
				v1++;
			} else if (idade > 50) {
				v2++;
			}
			System.out.println("\nDigite um nova idade:");
			idade = input.nextInt();

		}
		System.out.println("\nO número de pessoas com idade menor que 21 anos é: " + v1);
		System.out.println("\nO número de pessoas com idade maior que 50 anos é: " + v2);
	}

}
