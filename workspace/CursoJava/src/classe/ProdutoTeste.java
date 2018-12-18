package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Caneta preta",50);
		Produto.desconto=0.20;
		System.out.println(produto1.precoComDesconto());

	}

}
