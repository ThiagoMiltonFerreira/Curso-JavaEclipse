package classe;

public class DataTeste {

	public static void main(String[] args) {
	    Data nascimento = new Data(19,11,1987);
	    Data DadosNome = new Data("Thiago","Ferreira");
	    Data DadosNomeComThis = new Data();
	    /*nascimento.dia=19;
	    nascimento.mes=11;
	    nascimento.ano=1987;
	    */
	    System.out.println(nascimento.formatar());
	    
	    
	    

	/*Data nascimento = new Data();//O data é REFERENTE A CLASSE DATA(é regra se nao da erro) -> new Data(); ->CONSTRUTOR. ESTOU CRIANDO NOVO OBJETO APARTIR DA OUTRA CLASSE NO CASO A CLASSE DATA
	//nascimento.ano=1996; caso nao esteja encontrado o objeto(.ano) da classse no caso o .ano (variavel que foi criada na outra classe), VERIFIQUE SE A CLASSE DATA ESTA SALVA
	//Data nascimento = new Data(); --> busca todas informaçoes da classe no caso a classe data tudo que estiver la dentro da classe vou conseguir acessar atraves no nome que foi instanciado. atributo (nascimento.ano)
	nascimento.dia = 30;
	nascimento.mes = 8;
	nascimento.ano = 1996;
	//existe 2 mameneiras de  criar o construtor  (Data nascimento = new Data();) - > padrao implicito onde passa o valor atraves da variavel nascimento.dia = 30; e o explicito (Data casamento = new Data(02,7,2018);) passa o valor como parametro e ja vai para variavel que esta dentro da classe data.java na criaçao do objeto Data(int d, int m, int a) {} 
	Data casamento = new Data(02,7,2018);
	System.out.println("Nascimento: "+nascimento.formatar()); //esta funçao formatar foi criada dentro da classe Data.java contendo a formataçao correta do texto.
	System.out.println("Casamento: "+casamento.formatar());
	*/
	}

}
 