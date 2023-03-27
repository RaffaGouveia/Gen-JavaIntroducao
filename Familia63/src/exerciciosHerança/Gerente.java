package exerciciosHerança;

public class Gerente extends Funcionario{
	
	private int unidade;

	public Gerente(String nome, int id, String funcao, float salario, String cargo,int unidade) {
		super(nome, id, funcao, salario, cargo);
		this.unidade = unidade;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Unidade de gerênmcia: "+unidade);
	}
}
