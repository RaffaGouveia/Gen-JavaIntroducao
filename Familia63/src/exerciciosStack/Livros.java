package exerciciosStack;

import java.util.Scanner;
import java.util.Stack;

public class Livros {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println(" ================================================================================");
			System.out.println(" ||============================================================================||");
			System.out.println(" ||                                                                            ||");
			System.out.println(" ||                                 Biblioteca                                 ||");
			System.out.println(" ||                                                                            ||");
			System.out.println(" ||============================================================================||");
			System.out.println(" || (1) Adicionar um novo livro na pila || (2) Listar todos os livros da pilha ||");
			System.out.println(" ||=====================================||=====================================||");
			System.out.println(" || (3) Retirar um livro da pilha       || (4) Sair                            ||");
			System.out.println(" ||============================================================================||");
			System.out.println(" ||                            Entre com a opção desejada                      ||");
			System.out.println(" ||============================================================================||");
			System.out.println(" ================================================================================");
			int opcao = input.nextInt();
			if (opcao == 0) {
				System.out.println("\nObrigado por utilizar a biblioteca!");
				System.out.println("Volte sempre!!");
				input.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Qual o nome do livro que deseja adicionar? \n\n");
				input.nextLine();
				String livro = input.nextLine();
				livros.push(livro);
				break;
			case 2:
				System.out.println("Lista de todos os livros da pilha: \n\n");
				System.out.println(livros);
				break;
			case 3:
				System.out.println("Retirar um livro da pilha: \n\n");
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia! \n\n");
				} else {
					System.out.println("Aqui está o livro " + livros.peek()+"\n\n");
					livros.pop();
				}
				break;
				default:
					System.out.println("A opção é invalida, por favor digite novamente! \n\n");
			}
		}

	}

}
