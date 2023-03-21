package exerciciosVetor;

import java.util.Scanner;

public class MaiorPontuacao {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int tamanho = tamanhoNumeros();
		int numero[] = lerNumeros(tamanho);
		verificarMaior(numero);
	}

	public static int tamanhoNumeros() {
		int x;

		System.out.println("Qual o tamanho do que deve ser verificado? ");
		x = input.nextInt();

		return x;
	}

	public static int[] lerNumeros(int tamanho) {
		int numeros[] = new int[tamanho];

		System.out.println("Digite o 1° número: ");
		numeros[0] = input.nextInt();
		for (int i = 1; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "° número");
			numeros[i] = input.nextInt();
		}

		return numeros;
	}

	public static void verificarMaior(int numero[]) {
		int maiorValor = 0;

		for (int i = 0; i < numero.length; i++) {
			if (maiorValor < numero[i]) {
				maiorValor = numero[i];
			}
		}
		System.out.println("O maior número digitado foi: " + maiorValor);
	}
}
