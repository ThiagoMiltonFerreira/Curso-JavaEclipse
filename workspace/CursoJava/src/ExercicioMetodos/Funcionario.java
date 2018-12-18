package ExercicioMetodos;

public class Funcionario {

	String nome;
	String funcao;
	double salario;
	
	public String funcionario() {
		
		System.out.println(nome);
		
		return nome;
	}

	Funcionario(String nomeFuncionario1,String funcao1,double salario1){
	 nome=nomeFuncionario1;
	 funcao=funcao1;
	 salario=salario1;
	 
	}
	
	Funcionario(){
		System.out.println("padrao!");
	}
	
	void imprime(){
		System.out.println(nome+" "+funcao+" "+salario);
	}
	/*void imprimeFuncionario() {
		System.out.println(nome);
	}
	*/

	
}
