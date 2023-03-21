package exerciciosMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Media {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float[][] nota = lerNotas();
		float[] soma = somarNotas(nota);
		exibirMedia(soma);
	}

	public static float[][] lerNotas() {
		float[][] notas = new float[10][4];
		for (int l = 0; l < 10; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Digite as notas");
				notas[l][c] = input.nextFloat();
			}
		}
		return notas;
	}

	public static float[] somarNotas(float[][] nota) {
		float somaNota[] = new float[10];
		float sum = 0;
		for (int l = 0; l < 10; l++) {
			for (int c = 0; c < 4; c++) {
				sum += nota[l][c];
			}
			somaNota[l] = sum;
			sum = 0;
		}
		return somaNota;
	}

	public static void exibirMedia(float[] soma) {
		float media;
		float[] medias = new float[soma.length];
		for (int i = 0; i < soma.length; i++) {
			media = soma[i] / 4;
			medias[i] = media;
		}
		System.out.println("As médias são:" + Arrays.toString(medias));
	}
}
