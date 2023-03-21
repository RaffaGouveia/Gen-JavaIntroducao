package exerciciosVetor;

import java.util.Scanner;

public class ArrayVetor2 {

	public static void main(String[] args) {
		int numero[] = new int[10];
		int i, encontro, cont = 0;
		Scanner input = new Scanner(System.in);

		for (i = 0; i <= 9; i++) {
			System.out.println("Defina um número: ");

		}
		System.out.println("\nDigite um número a ser encontrado");
		encontro = input.nextInt();
		for (i = 0; i <= 9; i++) {
			if (numero[i] == encontro) {
				System.out.println("\nO número digitado " + numero[i] + " está na posição " + (i + 1));
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("\nO número não está no array!");
		}
	}

}
