package exerciciosVetor;

import java.util.Arrays;
import java.util.Scanner;

public class ArraryVetor3<Array> {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero[] = lerNumeros();
		exibirElementosIndiceImpar(numero);
		exibirNumerosPares(numero);
		int sum = exibirSoma(numero);
		exibirMedia(numero, sum);
	}

	public static int[] lerNumeros() {

		int[] numero = new int[10];
		for (int i = 0; i <= 9; i++) {
			System.out.println("\nDigite um número: ");
			numero[i] = input.nextInt();
		}
		return numero;
	}

	public static void exibirElementosIndiceImpar(int[] numero) {
		int indiceImpar[] = new int[numero.length];
		for (int i = 0; i <= numero.length; i++) {
			if (i % 2 == 1) {
				indiceImpar[i] = numero[i];
			}
		}
		System.out.println("\nOs números nos índices pares são" + Arrays.toString(indiceImpar));
	}

	public static void exibirNumerosPares(int[] numero) {
		int numPar[] = new int[numero.length];
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				numPar[i] = numero[i];
			}
		}
		System.out.println("\nOs números pares são: " + Arrays.toString(numPar));
	}

	public static int exibirSoma(int[] numero) {
		int sum = 0;
		for (int i = 0; i < numero.length; i++) {
			sum += numero[i];

		}
		System.out.println("\nA soma de todos os números é: " + sum);
		return sum;
	}

	public static void exibirMedia(int[] numero, int exibirSoma) {
		float media;
		media = exibirSoma / numero.length;
		System.out.printf("\nA média de todos os números é: %f", media);
	}
}