package exerciciosPOO;

public class Produto {
	private String nome;
	private float preco;
	private String console;
	private String idadeP;
	private String genero;

	public Produto(String nome, float preco, String console, String idadeP, String tipo) {

		this.nome = nome;
		this.preco = preco;
		this.console = console;
		this.idadeP = idadeP;
		this.genero = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float preco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getIdadeP() {
		return idadeP;
	}

	public void setIdadeP(String idadeP) {
		this.idadeP = idadeP;
	}

	public String getGenero() {
		return genero;
	}

	public void setTipo(String genero) {
		this.genero = genero;
	}

	public void visualizar() {

		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
		System.out.println("Console em que o produto roda: " + this.console);
		System.out.println("Idade permitida para o produto: " + this.idadeP);
		System.out.println("Gênero do produto: " + this.genero + "\n\n");

	}
}
