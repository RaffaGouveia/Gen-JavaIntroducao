package exerciciosHerança;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String nome, String endereco, String telefone, int senha, String email, String cpf) {
		super(nome, endereco, telefone, senha, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void validarCpf() {
		if (getCpf().length() != 11) {
			System.err.println(" O CPF é inválido!");
		} else {
			System.out.println(" O CPF é válido");
		}
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" Com CPF:" + cpf+"\n");
	}
}
