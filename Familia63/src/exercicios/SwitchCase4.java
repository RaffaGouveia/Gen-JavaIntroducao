package exercicios;
import java.util.Scanner;
public class SwitchCase4 {

	public static void main(String[] args) {
		float saldo = (float) 1000.00,saque,deposito,saldoNovo;
		int codigo;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n\tSistema Bancário:");
		System.out.println("\n(1) Saldo   (2) Saque");
		System.out.println("\n(3) Depósito");
		System.out.println("Escolha a operação desejada: ");
		codigo = read.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("\nA operação escolhida foi saldo!");
			System.out.println(("\nO seu saldo é de: "+saldo));
			break;
		case 2:
			System.out.println("\nA operação escolhida foi saque!");
			System.out.println("Digite o valor a ser sacado: ");
			saque = read.nextFloat();
			saldoNovo = saldo - saque;
			if(saldoNovo < 0) {
				System.out.println("\nDinheiro em conta indisponível!");
			}else {
				System.out.println("\nSeu novo saldo é de: "+saldoNovo);
			}
			break;
		case 3:
			System.out.println("\nA operação escolhida foi depósito!");
			System.out.println("\nDigite o valor a ser depositado: ");
			deposito = read.nextFloat();
			saldoNovo = saldo + deposito;
			System.out.println("\nSeu novo saldo é de: "+saldoNovo);
			break;
			default:
				System.out.println("\nA operação escolhida é inválida!");
		}
		
		
		
		
	}

}
