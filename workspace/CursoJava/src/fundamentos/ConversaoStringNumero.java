package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		//JOptionPane.showInputDialog("Qual � a nota1?");
		//JOptionPane.showMessageDialog("qual � a nota? ");
		
		String resposta1 = JOptionPane.showInputDialog("QUAL E A NOTA 1? ");
		String resposta2 = JOptionPane.showInputDialog("QUAL E A NOTA 2? ");
		
		//System.out.println(resposta1+resposta2);
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
	    double total = nota1+nota2;
	    System.out.println(total/2);
	

	}

}
