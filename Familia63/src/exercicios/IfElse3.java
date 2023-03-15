package exercicios;
import java.util.Scanner;
public class IfElse3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner read = new Scanner(System.in);
				
		System.out.println("\nQual o seu nome? ");
		nome = read.nextLine();
		System.out.println("\nQual a sua idade?");
		idade = read.nextInt();
		System.out.println("\nÉ sua primeira doação?");
		primeiraDoacao = read.nextBoolean();
		
		if(idade >= 18 || idade <= 59) 
		{
			System.out.println("\nO doador(a) "+nome+" está apto a doar sangue");
		}
		else if(!primeiraDoacao &&(idade >= 60 || idade <= 69)) {
			System.out.println("\nO doador(a) "+nome+" está apto a doar sangue");
		}
		else {
			System.out.println("\nO doador(a) "+nome+" não está apto a doar sangue");
		}
		
	}
}
