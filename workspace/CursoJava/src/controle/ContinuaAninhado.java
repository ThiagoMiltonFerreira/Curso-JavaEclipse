package controle;

public class ContinuaAninhado {

	public static void main(String[] args) {
		for(int i=0; i<5;i++) //volta pra ca (sai do for)
		{
			for(int j=0; j<5;j++)// primeiro for 
			{
				if(j==1) {
					j+=2;
				
					continue; //volta para o primeiro for
					
				}
				if(j==2)
				{
					break; // sai do for
				}
				System.out.println(i +" "+j);
			}
		}
		
		System.out.println("FIM..");

	}

}
