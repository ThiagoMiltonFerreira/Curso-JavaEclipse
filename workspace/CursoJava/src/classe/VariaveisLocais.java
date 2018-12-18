package classe;

public class VariaveisLocais {


	
	int a = 2;
	
	void test1() {  // metodo
		int a1 = 2; // visivel somente dentro do metodo
		System.out.println(a);
		System.out.println(a1);
	
		
		
		if(a1 >3) {
			int a2 = 3; // esta variavel pertence somente ao bloco de codigo nao consigo chamar ela fora do do bloco if
		}
		
		
		
		if(a1 >3) {
			int a3 = 3;
		}
		
		
	
			//System.out.println(a2);
	}
	
	
}
