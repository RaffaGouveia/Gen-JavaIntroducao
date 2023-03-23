package exerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor que deseja adicionar a lista:");
			String cor = input.nextLine();
			cores.add(cor);

		}
		
		System.out.println("Todas as cores da lista: "+cores);
		
		Collections.sort(cores);
		System.out.println("Cores da lista após ordenadas em crescente: "+cores);
		

	}

}
