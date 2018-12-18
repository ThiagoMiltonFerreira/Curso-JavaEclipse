package classe;

public class Data {

	int dia; //Parametro dia
	int mes; //Parametro mes
	int ano; //Parametro ano
	
	public Data() {
		//this(1,1,2018);
		this("THIAGO1","FERREIRA - this()");
		//this(1,1,2018);
		
	}
	Data(int dia, int mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	Data(String nome,String sobremone)
	{
		System.out.println(nome+" "+sobremone);
	}
	
	String formatar() {
		return String.format(dia+"/"+mes+"/"+ano);
	}

	
	/*Data(){
		
		
	}

	Data(int d, int m, int a) { //se passar o valor como parametrona criaçao do objeto (esta em DataTeste.java) precisa de criar a variavel que vai receber estes valores
		dia=d; // aqui estou passado o valor recebido para variavel dia criada em cima fora do bloco da classe que sera usada para formatar
		mes=m;
		ano=a;
	}

	String formatar() {
		//esta funçao retorna para o formatar o modelo abaixo de data dia/mes/ano....
		return String.format(dia+"/"+mes+"/"+ano); //ultiliza a variavel dia, mes e ano criada fora de todo bloco que recebeu o valor de DATA que doi enviado na classe DATATESTE
		
	}
	*/
}
