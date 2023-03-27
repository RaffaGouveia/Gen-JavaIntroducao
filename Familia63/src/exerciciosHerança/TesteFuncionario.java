package exerciciosHerança;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Juliana Lopes", 3349, "Desenvolve programas e soluciona problemas",
				(float) 3000.0, "Desenvolvedor Java Jr");
		f1.visualizar();

		Funcionario f2 = new Funcionario("Lucas Vinicius", 2583, "Supervisiona e orienta desenvolvedores",
				(float) 4600.0, "Supervisor de Desenvolvimento");
		f2.visualizar();
		
		Vendedor rafael = new Vendedor("Rafael Gouveia",2586,"Vende e orienta clientes sobre produtos",(float) 2000.0,"Vendedor",(float) 150.0);
		rafael.visualizar();
		
		Vendedor joao = new Vendedor("João Gabriel",1586,"Vende e orienta clientes sobre produtos",(float) 2000.0,"Vendedor",(float) 500.0);
		joao.visualizar();
		
		Gerente adriane = new Gerente("Adriane Lima", 2500,"Gerencia a loja e vendedores",(float) 3500.0,"Gerente", 105);
		adriane.visualizar();
		
		Gerente jefferson = new Gerente("Jefferson Andrade", 1500,"Gerencia a loja e vendedores",(float) 3500.0,"Gerente", 97);
		jefferson.visualizar();
		
	}

}
