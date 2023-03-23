package exerciciosArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cores {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList();
		Scanner input = new Scanner(System.in);
		int x;
		do {
			System.out.println("---------------------------------------------");
			System.out.println("\t\t-Menu de Cores-");
			System.out.println("\t(1) Deseja adicionar uma cor?");
			System.out.println("\t(2) Deseja ver as cores da lista?");
			System.out.println("\t(3) Deseja ver as cores em ordem crescente?");
			System.out.println("\t(0) Deseja sair do menu?");
			System.out.println("\tDigite a opção desejada: ");
			x = input.nextInt();

			switch (x) {
			case 1:
				input.nextLine();
				System.out.println("\tDigite a cor que deseja adicionar ao menu:");
				String cor = input.nextLine();
				cores.add(cor);
				break;
			case 2:
				input.nextLine();
				System.out.println("\tCores no menu:");
				System.out.println(cores);
				break;
			case 3:
				input.nextLine();
				System.out.println("\tCores do menu em ordem crescente:");
				Collections.sort(cores);
				System.out.println(cores);
				break;
			case 0:
				System.out.println("\tObrigado por utilizar o menu de cores..!!");
				System.out.println("\tVolte sempre!!");
			default:
				System.out.println("Número inválido, por favor digite novamente!");

			}

		} while (x != 0);

	}

}
