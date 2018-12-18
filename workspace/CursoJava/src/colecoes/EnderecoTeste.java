package colecoes;

public class EnderecoTeste {

	public static void main(String[] args) {
		
		//COMPARACAO  ENTRE OBJETOS    ****** .EQUALS
		Endereco endereco1 = new Endereco("Rua loop infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua loop infinito", 1, "Sala 1001");
		
		
		System.out.println(endereco1==endereco2);
		System.out.println(endereco1.equals(endereco2)); //preciso importar o iquals no na classe alt+shift+s   -> gerate rashcod and equals

	}

}
