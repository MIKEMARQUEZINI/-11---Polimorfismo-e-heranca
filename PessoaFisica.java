package POO;

public class PessoaFisica extends ClientePOO{
	
	private String cpf;

	public PessoaFisica(String name, String dataNasc, int idade, double altura, String comida, String cpf) {
		super(name, dataNasc, idade, altura, comida);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: "+getName()+"\nCPF: "+cpf+"\nIdade: "+getIdade());
	}

}
