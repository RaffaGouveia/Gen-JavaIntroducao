package exercicios;

import java.util.Scanner;

public class IfElse2 {
	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner(System.in);

		System.out.println("\nDigite um número: ");
		num = read.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.println("\nO número " + num + " é par e positivo!");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("\nO número " + num + " é ímpar e positivo!");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println("\nO número " + num + " é par e negativo!");
		} else if (num % 2 != 0 && num < 0) {
			System.out.println("\nO número " + num + " é ímpar e negativo!");
		} else {
			System.out.println("\nO número " + num + " é zero!");
		}
	}
}
