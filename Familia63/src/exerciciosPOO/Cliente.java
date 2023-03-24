package exerciciosPOO;

public class Cliente {

	private String nome;
	private int numero;
	private int senha;
	private String email;
	private String endereco;

	public Cliente(String nome, int numero, int senha, String email, String endereco) {

		this.nome = nome;
		this.numero = numero;
		this.senha = senha;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void visualizar() {

		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Número do cliente: " + this.numero);
		System.out.println("Senha do cliente: " + this.senha);
		System.out.println("Email do cliente: " + this.email);
		System.out.println("Endereço do cliente: " + this.endereco + "\n\n");

	}

}
