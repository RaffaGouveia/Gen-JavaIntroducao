package exerciciosCollectionSet;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;

public class Teste {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet();
		Scanner input = new Scanner(System.in);
		int num;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° número(não devem ser repetidos): ");
			num = input.nextInt();
			if (numeros.contains(num)) {
				i--;
				System.out.println("O número já existe na lista, por favor digite um novo número ");

			} else {
				numeros.add(num);
			}
			System.out.println(numeros);
		}

		Iterator<Integer> inumeros = numeros.iterator();
		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}

	}

}
