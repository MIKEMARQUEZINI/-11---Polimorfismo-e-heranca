package POO;

public class TesteClient {

	public static void main(String[] args) {
		
ClientePOO client = new ClientePOO("Mike","11/03/1993",30,1.78,"Hamburguer");
		
		//Impressão classe + objeto
		
		client.imprimirInfo();
		
		//Mudar alimento//
		
		client.setComida("Pizza");
		client.imprimirInfo();
		
		//Mudar altura//
		
		client.setAltura(1.80);
		client.imprimirInfo();
		
		System.out.println("\nParabens Mike acaba de fazer aniversario!");
		
		client.setIdade(31);
		client.imprimirInfo();
		

		ClientePOO pf = new PessoaFisica("Mike","yy/yy/yyyy",30,1.78,"Hamburguer","123.345.567-89");
		pf.imprimirInfo();
		
		ClientePOO pf1 = new PessoaFisica("Ronaldo","xx/xx/xxxx",23,1.58,"Pizza","123.345.567-89");
		pf1.imprimirInfo();
		
		ClientePOO pj = new PessoaJuridica("Mike","11/03/1993",30,1.78,"Hamburguer","Hamburgão Delicia LTDA","12.334.556/0001-99");
		pj.imprimirInfo();
		
		ClientePOO pj1 = new PessoaJuridica("Ronaldo","Ronaldo",30,1.78,"Pizza","KIsuco Refresca Verão LTDA","12.334.556/0001-99");
		pj1.imprimirInfo();
	}

}