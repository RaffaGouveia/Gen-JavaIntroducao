package exerciciosFor;

import java.util.Scanner;

public class LacoFor2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int i, numPar = 0, numImpar = 0, contador = 1;
		Scanner input = new Scanner(System.in);

		System.out.println("\nEscreva 10 números para mostrar quantos números pares e quantos impares digitou!");

		for (i = 0; i <= 9; i++) {
			System.out.println("Digite o " + contador++ + "°" + " número:");
			num[i] = input.nextInt();
			if (num[i] % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}

		}
		System.out.println("\nA quantidade de números pares digitada foi: " + numPar);
		System.out.println("\nA quantidade de números impares digitada foi: " + numImpar);
	}

}
