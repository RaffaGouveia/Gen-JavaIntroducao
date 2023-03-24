package exerciciosPOO;

public class TesteGame {

	public static void main(String[] args) {

		Produto game1 = new Produto("Resident Evil IV", (float) 204.0, "XBox One/PS4", "+18", "Survival Horror");
		game1.visualizar();

		Produto game2 = new Produto("God of War", (float) 139.0, "PC/PS4/PS5", "+18", "Ação/Aventura");
		game2.visualizar();
	}

}
