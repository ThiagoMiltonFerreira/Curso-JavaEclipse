package api;

public class ExplorandoString {
	public static void main(String[] args) {
		/**String nome = new String("Thiago");
		nome = "Thi"+"Ago";
		
		
		//alguns metodos
		System.out.println(nome.toUpperCase()); // coloca tudo maiusculo
		System.out.println(nome.length()); // qts caracteres a tem a string
		System.out.println(nome.substring(0, 3)); // pega somente os 3 primeiros caracteres
		System.out.println(nome.indexOf('h')); // percorre a variavel e verifica onde esta o caractere d
		System.out.println(nome.charAt(3)); // qual letra esta na posicao 3
		System.out.println(nome.equalsIgnoreCase("thiago")); //verifica a se o texto e igual ignorando maiusculo ou minusculo
		System.out.println(nome.startsWith("Thi")); //verifica se este trecho e igual da String
		System.out.println(nome.isEmpty()); // verifica se esta vazio
		System.out.println(nome.concat(" é legal!").concat("!")); // .concat concatena dois textos
		**/
		
		//Usar o stringbuilder para loop concaternar... nao gasta memoria
		StringBuilder sb = new StringBuilder();
		sb.append("João");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		System.out.println(sb.toString());
		
		
	}

}
