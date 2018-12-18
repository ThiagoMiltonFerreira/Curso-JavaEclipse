package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 5; // variavel global todo o sistema se usar a varivel vai alterar ela variavel unica da classepara passa valor para ela uso -> Produto.desconto = 10
	
	
	Produto(String nome, double preco ){
		this.nome = nome;      //quando coloca o this. refere a variavel de instacia () ou seja a varivel externa
		this.preco = preco;

	}
	
	double precoComDesconto() {
		return preco * desconto;
		
	}

}
