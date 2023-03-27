package exerciciosHerança;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	private int senha;
	private String email;

	public Cliente(String nome, String endereco, String telefone, int senha, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return senha;
	}

	public void setIdade(int senha) {
		this.senha = senha;
	}

	public String getemail() {
		return email;
	}

	public void setAltura(String email) {
		this.email = email;
	}

	public void visualizar() {
		System.out.println(" A pessoa de nome: "+nome+"\n Tem idade:"+senha+"\n Reside em: "+endereco+"\n Com o telefone para contato: "+telefone+"\n Email de contato: "+email);
	}
}
