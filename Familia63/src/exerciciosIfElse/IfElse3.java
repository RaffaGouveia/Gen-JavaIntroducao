package exerciciosIfElse;

import java.util.Scanner;

public class IfElse3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doou;

		Scanner read = new Scanner(System.in);

		System.out.println("\nQual o seu nome? ");
		nome = read.nextLine();
		System.out.println("\nQual a sua idade?");
		idade = read.nextInt();
		System.out.println("\nJá fez alguma doação?");
		doou = read.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println("\nO doador(a) " + nome + " está apto a doar sangue");
		} else if (idade >= 60 && idade <= 69 && doou == true) {
			System.out.println("\nO doador(a) " + nome + " está apto a doar sangue");
		} else {
			System.out.println("\nO doador(a) " + nome + " não está apto a doar sangue");
		}

	}
}
