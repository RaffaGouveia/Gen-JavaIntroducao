package exerciciosPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Juliana Lopes", 3349, "Desenvolve programas e soluciona problemas",
				(float) 3000.0, "Desenvolvedor Java Jr");
		f1.visualizar();

		Funcionario f2 = new Funcionario("Lucas Vinicius", 2583, "Supervisiona e orienta desenvolvedores",
				(float) 4600.0, "Supervisor de Desenvolvimento");
		f2.visualizar();
	}

}
