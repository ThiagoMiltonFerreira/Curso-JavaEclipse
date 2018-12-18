package fundamentos;

public class ObjetosPrimitivos {
	public static void main(String[] args) {
		//Integer a = Integer.valueOf(10);
		//System.out.println(a.toString().length());
		
		//Boolean bo = Boolean.valueOf(true); //cria o objeto tipo boolean com nome de bo  - diferença entre variavel e objeto e que a primeira letra e maiuscula para objeto
		//DEFINIR UM VALOR AO OBJETO COLOCAR .valueOf E PASSAR O VALOR COMO PARAMETRO
		//Character c = Character.valueOf('a'); 
		Integer b = Integer.valueOf(11);
		Integer a = Integer.valueOf(11);
		
		System.out.println(a.equals(b));//a.equals(bo) AQUI VAMOS COMPRAR O OBJETO( A )COM O OBJETO ( B ) O RETORNO SERA VERDADEIRO OU FALSO
		
		if(b.equals(a)==true) // se o resultado do equals for true 
		{
			System.out.println("compraracao entre objeto A e B. "+b.equals(a));
		}
		
		if(b==a) // b.equals(a) compara o valor primitivo do objeto (11) diferente do .equals que compra restosta do objeto true/false
		{
			System.out.println("É igual.".toUpperCase()+b);
		}else
		{
			System.out.println("É diferente.");
		}		
	}
}
