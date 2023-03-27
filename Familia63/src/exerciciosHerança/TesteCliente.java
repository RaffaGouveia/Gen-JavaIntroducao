package exerciciosHerança;

public class TesteCliente {

	public static void main(String[] args) {
		
		PessoaFisica rafael = new PessoaFisica("Rafael", "Rua dos Anjos", "(11)94002-8922", 123, "example@gmail.com", "45678912351");
		rafael.visualizar();
		
		PessoaFisica lucas = new PessoaFisica("Lucas", "Avenida das Flores","(41)4865-1235", 145,"lucasflores@gmail.com","48631495031");
		lucas.visualizar();
		
		PessoaJuridica adriane = new PessoaJuridica("Adriane","Jabuticabal","(85)5891-7862",136,"example1%gmail.com","18234578126355");
		adriane.visualizar();
		
		PessoaJuridica mariane = new PessoaJuridica("Mariane","Sapopemba","(11)4835-7923",205,"example2@gmail.com","42643188900017");
		mariane.visualizar();
	}

}
