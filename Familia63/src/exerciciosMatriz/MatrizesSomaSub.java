package exerciciosMatriz;

import java.util.Scanner;

public class MatrizesSomaSub {
	static Scanner input = new Scanner(System.in);
	int i,j;
	public static void main(String[] args) {
		int linha = tamanhoLinha();
		int coluna = tamanhoColuna();
		int[][] n1 = matrizN1(tamanhoLinha(), tamanhoColuna());
		int[][] n2 = matrizN1(tamanhoLinha(), tamanhoColuna());

	}

	public static int tamanhoMatriz() {
		int i,j;

		System.out.println("Qual o tamanho do que deve ser verificado? [1] [0] ");
		i = input.nextInt();
		j = input.nextInt();

		return i;
	}

	public static int tamanhoColuna() {
		int j;
		System.out.println("Qual o tamanho do que deve ser verificado? [1] [0] ");
		j = input.nextInt();

		return j;
	}

	public static int[][] matrizN1(int i, int j) {
		int[][] n1 = new int[i][j];

		for (int l = 0; l < i; l++) {
			for (int c = 0; l < j; c++) {
				System.out.println("Digite um número para a matriz [" + l + "]" + "[" + c + "]");
				n1[l][c] = input.nextInt();
			}
		}
		return n1;
	}

	public static int[][] matrizN2(int i, int j) {
		int[][] n2 = new int[i][j];

		for (int l = 0; l < i; l++) {
			for (int c = 0; l < j; c++) {
				System.out.println("Digite um número para a matriz [" + l + "]" + "[" + c + "]");
				n2[l][c] = input.nextInt();
			}
		}
		return n2;
	}

	
}
