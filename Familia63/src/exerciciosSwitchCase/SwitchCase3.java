package exerciciosSwitchCase;
import java.util.Scanner;
public class SwitchCase3 {

	public static void main(String[] args) {
		float[] numero = new float[2];
		float res;
		int codigo,i;
		Scanner read = new Scanner(System.in);
		
		for(i=0;i<=1;i++) {
			System.out.println("\nDigite o número:");
			numero[i] = read.nextFloat();			
		}
		System.out.println("\n\tOperadores Matemáticos:");
		System.out.println("\n(1) Soma            (2)Subtração");
		System.out.println("\n(3) Multiplicação   (4) Divisão");
		System.out.println("\nDigite o número correspondente a operação desejada:");
		codigo = read.nextInt();
		
		switch(codigo) {
		case 1:
			res = numero[0] + numero[1];
			System.out.println("O resultado da conta "+numero[0]+" + "+numero[1]+" é igual a :"+res);
			break;
		case 2:
			res = numero[0] - numero[1];
			System.out.println("O resultado da conta "+numero[0]+" - "+numero[1]+" é igual a :"+res);
			break;
		case 3:
			res = numero[0] * numero[1];
			System.out.println("O resultado da conta "+numero[0]+" X "+numero[1]+" é igual a :"+res);
			break;
		case 4:
			res = numero[0] / numero[1];
			System.out.println("O resultado da conta "+numero[0]+" / "+numero[1]+" é igual a :"+res);
			break;
			default:
			System.out.println("\nO número digitado não corresponde a nenhuma operação");
		}
	}

}
