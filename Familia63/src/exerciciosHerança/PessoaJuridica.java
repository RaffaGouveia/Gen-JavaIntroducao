package exerciciosHerança;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String telefone, int senha, String email,String cnpj) {
		super(nome, endereco, telefone, senha, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void validarCnpj() {
		if(getCnpj().length() != 14) {
			System.out.println(" O CNPJ é inválido!");
		}else {
			System.out.println(" O CNPJ é válido!");
		}
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" Com CPNJ: "+cnpj+"\n");
	}
}
