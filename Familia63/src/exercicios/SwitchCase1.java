package exercicios;
import java.util.Scanner;
public class SwitchCase1 {

	public static void main(String[] args) {
		int item,quantia;
		double preco,valorTotal;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n\tLista de produtos ");
		System.out.println("\n(1) Cachorro Quente   (2) X-Salada");
		System.out.println("\n(3) X-Bacon           (4) Bauru");
		System.out.println("\n(5) Refrigerante      (6) Suco de Laranja");
		System.out.println("\nQual o item comprado? ");
		item = read.nextInt();
		System.out.println("\nQual a quantidade comprada? ");
		quantia = read.nextInt();
		
		switch(item){
			case 1:
				preco = 10.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto Cachorro Quente tem um valor total de: "+valorTotal);
				break;
			case 2:
				preco = 15.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto X-Salada tem um valor total de: "+valorTotal);
				break;
			case 3:
				preco = 18.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto X-Bacon tem um valor total de: "+valorTotal);
				break;
			case 4:
				preco = 12.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto Bauru tem um valor total de: "+valorTotal);
				break;
			case 5:
				preco = 8.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto Refrigerante tem um valor total de: "+valorTotal);
				break;
			case 6:
				preco = 13.00;
				valorTotal = preco * quantia;
				System.out.println("\nA quantia "+quantia+"do produto Suco de Laranja tem um valor total de: "+valorTotal);
				break;
				default: 
					System.out.println("\nDigite um item válido");
		}

	}

}
