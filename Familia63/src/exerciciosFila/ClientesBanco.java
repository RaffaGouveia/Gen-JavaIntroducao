package exerciciosFila;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClientesBanco {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner input = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println(" ==========================================================================");
			System.out.println(" ||======================================================================||");
			System.out.println(" ||                                                                      ||");
			System.out.println(" ||                         Banco Rouffos                                ||");
			System.out.println(" ||                                                                      ||");
			System.out.println(" ||======================================================================||");
			System.out.println(" ||                                                                      ||");
			System.out.println(" ||                     Chegada Clientes Banco                           ||");
			System.out.println(" ||                                                                      ||");
			System.out.println(" ||======================================================================||");
			System.out.println(" || (1) Adicionar cliente na fila || (2) Listar todos os clientes        ||");
			System.out.println(" ||===============================||=====================================||");
			System.out.println(" || (3) Retirar cliente da fila   || (0) Sair                            ||");
			System.out.println(" ||======================================================================||");
			System.out.println(" ||                    Entre com a opção desejada                        ||");
			System.out.println(" ||======================================================================||");
			System.out.println(" ==========================================================================");
			try {
				opcao = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Por favor, digite números inteiros! ");
				input.nextLine();
				opcao = 0;
			}
			if (opcao == 0) {
				System.out.println("Banco Rouffos -- Seu FUTURO é aqui!");
				input.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println();
				System.out.println("Qual o nome do cliente?\n\n");
				input.nextLine();
				String cliente = input.nextLine();
				fila.add(cliente);

				break;
			case 2:
				System.out.println();
				System.out.println("Lista de todos os clientes na fila\n\n");
				System.out.println(fila);

				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia no momento!\n\n");
				} else {
					System.out.println("Por favor cliente " + fila.peek() + " se dirija ao caixa.\n\n");
					fila.remove();
				}
				break;
			default:
				System.out.println("A opção escolhida é inválida, por favor, escolha outra opção!\n\n");
			}
		}
	}

}
