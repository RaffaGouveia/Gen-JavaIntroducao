package exerciciosIfElse;
import java.util.Scanner;
public class IfElse4 {

	public static void main(String[] args) {
		String[] caract = new String[3];
		int i;
		Scanner read = new Scanner(System.in);
		for(i=0;i<=2;i++) {
			System.out.println("\nDiga uma caractéristica do animal");
			caract[i] = read.nextLine();
		}
		if(caract[0].equalsIgnoreCase("vertebrado")) {
			if(caract[1].equalsIgnoreCase("ave")) {
				if(caract[2].equalsIgnoreCase("carnívoro")) {
					System.out.println("\nO animal é uma águia!");
				}else {
					System.out.println("\nO animal é uma pomba!");
				}
			}else {
				if(caract[2].equalsIgnoreCase("onívoro")) {
					System.out.println("\nO animal é um humano!");
				}else {
					System.out.println("\nO animal é uma vaca!");
				}
			}
		}if(caract[1].equalsIgnoreCase("inseto")) {
			if(caract[2].equalsIgnoreCase("hematófago")) {
				System.out.println("\nO animal é uma pulga!");
			}else {
				System.out.println("\nO animal é uma lagarta!");
			}
		}else {
			if(caract[2].equalsIgnoreCase("hematófago")) {
				System.out.println("\nO animal é uma sanguessuga!");
			}else {
				System.out.println("\nO animal é uma minhoca!");
			}
		}
	}

}
