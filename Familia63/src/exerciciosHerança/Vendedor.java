package exerciciosHerança;

public class Vendedor extends Funcionario{
	
	private float comissaoVendas;

	public Vendedor(String nome, int id, String funcao, float salario, String cargo,float comissaoVendas) {
		super(nome, id, funcao, salario, cargo);
		this.comissaoVendas = comissaoVendas;
	}

	public float getComissaoVendas() {
		return comissaoVendas;
	}

	public void setComissaoVendas(float comissaoVendas) {
		this.comissaoVendas = comissaoVendas;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão de vendas do funcionário: "+comissaoVendas);
	}
}
