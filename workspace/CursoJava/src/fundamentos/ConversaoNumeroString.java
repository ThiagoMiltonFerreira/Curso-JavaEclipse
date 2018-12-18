package fundamentos;



public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = Integer.valueOf(10000);
		System.out.println("LInha 10 : "+num1.toString()); //Objeto integer para string
	

		int num2 = 1000000;
		String num3 = new String("3");
		System.out.println("LInha 13 : "+(double)num2);//VARIAVEL integer para string
		System.out.println("LInha 15 : "+(float)num2);
		System.out.println("LInha 16 : "+(int)num2);
		System.out.println("LInha 17 : " +Integer.parseInt(num3)+(float)num2);
		System.out.println("LInha 18 : "+num3.toString());

		
	
		
		
	}

}
