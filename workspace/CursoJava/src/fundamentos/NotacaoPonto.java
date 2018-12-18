package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia ?".toUpperCase().replace("?"," Bia" ).toUpperCase().concat("!");
		//.toUpperCase();    --> COLOCA LETRA MAIUSCULA
		//.replace("?"," Bia" );   ---> SUBSTITUI ONDE ESTA ? NO TEXTO POR BIA
		//.toUpperCase().concat("!"); ---> CONCATENA A ! JUNTO AO TEXTO
		System.out.println(s);

		
	}

}
