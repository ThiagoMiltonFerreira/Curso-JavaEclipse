package controle;

public class Continue {

	public static void main(String[] args) {
		for(int i=0; i<5;i++) //volta pra ca
		{
			if(i==2)
			{
				//break;// sai do for
				continue; //interompe a repeti�ao e volta no inicio do for 
				         // ja o Break para a repeti�ao e sai do for
				           
			}
			System.out.println(i);
		}
		System.out.println("Fim");

	}

}
