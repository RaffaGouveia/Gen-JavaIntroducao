package exerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExisteNoArray {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		Scanner input = new Scanner(System.in);
		int x, j = 0;

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite um número para verificar se existe na lista: ");
		x = input.nextInt();

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.contains(i)) {
				System.out.println("O número " + x + " está na posição " + numeros.indexOf(x));
				j++;
				return;

			}

		}
		if (j == 0) {
			System.out.println("O número não está na lista!");
		}
	}

}
