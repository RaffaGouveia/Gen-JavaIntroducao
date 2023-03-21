package exerciciosWhile;

import java.util.Scanner;

public class LacoWhile2 {
	public static void main(String[] args) {
		int idade, sexo, categoria;
		int back = 0, frontF = 0, mobM40 = 0, fullF30 = 0;
		char afirmacao;
		Scanner input = new Scanner(System.in);
		System.out
				.println("\n\tEsse é um sistema para identificar e computar colaboradores da área de desenvolvimento");
		System.out.println("\nDeseja inserir os dados de um colaborador? (S/N)");
		afirmacao = input.next().charAt(0);
		while (afirmacao == 'S') {
			System.out.println("\nInforme sua idade: ");
			idade = input.nextInt();
			System.out.println("\nInforme seu sexo:");
			System.out.println("\n(1) Masculino   (2) Feminino");
			System.out.println("\n(3) Outros");
			sexo = input.nextInt();
			System.out.println("\nInforme sua categoria:");
			System.out.println("\n(1) Backend  (2) Frontend");
			System.out.println("\n(3) Mobile   (4) FullStack");
			categoria = input.nextInt();
			System.out.println("\nDeseja inserir dados de um novo colaborador? (S/N)");
			afirmacao = input.next().charAt(0);
			if (categoria == 1) {
				back++;
			} else if (sexo == 2 && categoria == 2) {
				frontF++;
			} else if (sexo == 1 && categoria == 3 && idade > 40) {
				mobM40++;
			} else if (sexo == 2 && categoria == 4 && idade < 30) {
				fullF30++;
			}

		}
		System.out.println("\nO número de pessoas desenvolvedoras backend é: " + back);
		System.out.println("\nO número de mulheres desenvolvedoreas frontend é: " + frontF);
		System.out.println("\nO número de homens desenvolvedores Mobile acima dos 40 anos é: " + mobM40);
		System.out.println("\nO número de mulheres desenvolvedoras Fullstack abaixo dos 30 anos é: " + fullF30);

	}

}
