package exerciciosVetor;

import java.util.Scanner;

public class ArrayVetor1 {

	public static void main(String[] args) {
		int numero[] = new int[] { 2, 5, 1, 3, 4, 9, 7, 9, 10, 6 };
		int posicao, x;
		Scanner input = new Scanner(System.in);
		System.out.println("\nDigite a posição que deseja visualizar: ");
		posicao = input.nextInt();
		for (x = 0; x <= 9; x++) {
			if (posicao > numero.length || posicao < 0) {
				System.out.println("\nA posição não existe!");
				return;
			}else if(posicao == x) {
			System.out.println("\nO número " + numero[posicao] + " está na posição " + posicao++);
			}
		}
	}
}
