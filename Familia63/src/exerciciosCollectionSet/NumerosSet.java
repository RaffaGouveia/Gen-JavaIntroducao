package exerciciosCollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumerosSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			int x = input.nextInt();
			numeros.add(x);
		}
		System.out.println(numeros);
		Iterator<Integer> inumeros = numeros.iterator();
		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
	}

}
