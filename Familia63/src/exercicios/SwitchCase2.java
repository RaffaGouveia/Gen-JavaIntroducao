package exercicios;
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		String nome;
		int codigo,ajuste;
		float salario,novoSalario;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual o seu nome? ");
		nome = read.nextLine();
		System.out.println("\n\tTabela de códigos de colaborador ");
		System.out.println("\n(1) Gerente      (2) Vendedor");
		System.out.println("\n(3) Supervisor   (4) Motorista");
		System.out.println("\n(5) Estoquista   (6) Tecnico de TI");
		System.out.println("\nQual o seu código de colaborador? ");
		codigo = read.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
		case 2:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
		case 3:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
		case 4:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
		case 5:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
		case 6:
			System.out.println("\nQual o sálario do colaborador escolhido? ");
			salario = read.nextFloat();
			System.out.println("Digite o valor do ajuste: ");
			ajuste = read.nextInt();
			novoSalario = salario + ((salario * ajuste)/100);
			System.out.println("\nO novo sálario é:"+novoSalario);
			break;
			default:
				System.out.println("\nO número digitado é inválido");
		}
	}

}
