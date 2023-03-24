package exerciciosPOO;

public class TesteClientes {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rafael Gouveia", 99999999, 13, "example@mail.com", "456");
		c1.visualizar();

		Cliente c2 = new Cliente("Vinicius Silva", 999999995, 14, "example2@mail.com", "700");
		c2.visualizar();
	}
}
