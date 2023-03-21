package exerciciosMatriz;

import java.util.Scanner;

public class ArrayMatriz1 {

	public static void main(String[] args) {
		int[][] numero = new int[3][3] ;
		int[] diagP = new int[3];
		int[] diagS = new int[3];
		int l, c, somaDiagP = 0, somaDiagS = 0;
		Scanner input = new Scanner(System.in);

		for (l = 0; l <= 2; l++) {
			for (c = 0; c <= 2; c++) {
				System.out.println("Digite um número: ");
				numero[l][c] = input.nextInt();
				if (l == c) {
					diagP[l] = numero[l][c];
					somaDiagP += numero[l][c];

				}

			}

		}
		for (l = 0; l <= 2; l++) {
			for (c = 0; c <= 2; c++) {
				if ((l == 0 && c == 2) || (l == 1 && c == 1) || (l == 2 && c == 0)) {
					diagS[l] = numero[l][c];
					somaDiagS += numero[l][c];
				}
			}
		}
		System.out
				.println("\nOs números na linha diagonal principal são " + diagP[0] + " " + diagP[1] + " " + diagP[2]);
		System.out
				.println("\nOs números na linha diagonal secundária são " + diagS[0] + " " + diagS[1] + " " + diagS[2]);
		System.out.println("\nA soma dos números na linha diagonal principal é " + somaDiagP);
		System.out.println("\nA soma dos números na linha diagonal secundária é " + somaDiagS);

	}

}
