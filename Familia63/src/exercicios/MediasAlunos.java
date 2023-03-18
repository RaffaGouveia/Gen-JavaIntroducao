package exercicios;

import java.util.Scanner;

public class MediasAlunos {
	static Scanner input = new Scanner(System.in);

	public static void main(String args) {

	}

	public static float[][] entrarComAsNotas() {
		float[][] notas = new float[10][4];
		for (int l = 0; l <= 9; l++) {
			for (int c = 0; c <= 3; c++) {
				System.out.println("\nEntre com as notas: ");
				notas[l][c] = input.nextFloat();
			}
			
		}
		return notas;
	}
	public static float
}
