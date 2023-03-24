package exerciciosPOO;

public class Funcionario {
	private String nome;
	private int id;
	private String funcao;
	private float salario;
	private String cargo;

	public Funcionario(String nome, int id, String funcao, float salario, String cargo) {
		this.nome = nome;
		this.id = id;
		this.funcao = funcao;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void visualizar() {

		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("ID do funcionário: " + this.id);
		System.out.println("Função que o funcionário exerce: " + this.funcao);
		System.out.println("Salario do funcionário: " + this.salario);
		System.out.println("Cargo do funcionário: " + this.cargo + "\n\n");
	}
}
