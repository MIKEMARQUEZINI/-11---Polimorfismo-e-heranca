package POO;

public class PessoaJuridica extends ClientePOO{
	
	private String cnpj;
	private int capitalsocial=100;
	private String razaoSocial;
	
	public PessoaJuridica(String name, String dataNasc, int idade, double altura, String comida, String cnpj,
			int capitalsocial, String razaoSocial) {
		super(name, dataNasc, idade, altura, comida);
		this.cnpj = cnpj;
		this.capitalsocial = capitalsocial;
		this.razaoSocial = razaoSocial;
	}
	

	public PessoaJuridica(String name, String dataNasc, int idade, double altura, String comida, String cnpj,
			String razaoSocial) {
		super(name, dataNasc, idade, altura, comida);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public int getCapitalsocial() {
		return capitalsocial;
	}




	public void setCapitalsocial(int capitalsocial) {
		this.capitalsocial = capitalsocial;
	}




	public String getRazaoSocial() {
		return razaoSocial;
	}




	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}






	public void imprimirInfo() {
		System.out.println("\nRazao Social: "+razaoSocial+"\nCNPJ: "+cnpj+"\nCapital Social: "+capitalsocial);
		
	}
	

}
