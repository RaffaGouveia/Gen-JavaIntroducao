package exerciciosVetor;

import java.util.Scanner;

public class RolagemDado {
	static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		int tamanho = tamanhoNumeros();
		int rolagemDado[] = lerRolagemDado(tamanho);
		int somaRolagem = somaRolagem(rolagemDado);
		int maiorLancamento = maiorLancamento(rolagemDado);
		mediaRolagem(somaRolagem, rolagemDado);
		contagemMaior(maiorLancamento, rolagemDado);
	}

	public static int tamanhoNumeros() {
		int x;

		System.out.println("Qual o tamanho do que deve ser verificado? ");
		x = input.nextInt();

		return x;
	}

	public static int[] lerRolagemDado(int tamanho) {
		int rolagemDado[] = new int[tamanho];

		for (int i = 0; i < rolagemDado.length; i++) {
			System.out.println("Digite a " + (i + 1) + "° rolagem");
			rolagemDado[i] = input.nextInt();
			while (rolagemDado[i] < 1 || rolagemDado[i] > 6) {
				System.out.println("Rolagem digitada incorreta. Por favor entre com uma nova rolagem:");
				rolagemDado[i] = input.nextInt();

			}
		}

		return rolagemDado;
	}

	public static int somaRolagem(int[] rolagemDado) {
		int somaRolagem = 0;

		for (int i = 0; i < rolagemDado.length; i++) {
			somaRolagem += rolagemDado[i];

		}
		return somaRolagem;
	}

	public static void mediaRolagem(int somaRolagem, int[] rolagemDado) {

		int media;

		media = somaRolagem / rolagemDado.length;

		System.out.println("A média dos números lançados é: " + media);
	}

	public static int maiorLancamento(int[] rolagemDado) {
		int maior = 0;

		for (int i = 0; i < rolagemDado.length; i++) {
			if (maior < rolagemDado[i]) {
				maior = rolagemDado[i];
			}
		}
		return maior;
	}

	public static void contagemMaior(int maiorLancamento, int[] rolagemDado) {
		int contadorMaior = 0;

		for (int i = 0; i < rolagemDado.length; i++) {
			if (rolagemDado[i] == maiorLancamento) {
				contadorMaior++;
			}
		}
		System.out.println("A quantidade de vezes que o maior número saiu é: " + contadorMaior);
	}
}