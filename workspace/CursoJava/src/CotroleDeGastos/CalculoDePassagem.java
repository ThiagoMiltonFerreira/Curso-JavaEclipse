package CotroleDeGastos;

import javax.swing.*;

public class CalculoDePassagem {
	public static void main(String[] args) {

		for (boolean cont = true; cont = true;) {
			String SalarioTotal = JOptionPane.showInputDialog("Salario Base.");
			double Desconto = (Double.parseDouble(SalarioTotal) * 6) / 100;
			JOptionPane.showMessageDialog(null, "Seu Valor de desconto com base no calculo de 6% �: ".toUpperCase()
					+ String.valueOf(Desconto) + " Com Base no salario de ".toLowerCase() + SalarioTotal + " REAIS."); // Messagem
																														// na
																														// tela
																														// diferente
																														// do
																														// outro
																														// inputDialod

			String[] options = { "Nao", "Sim" };
			int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja Sair ?", "Sair",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, options[0]);
			if (resposta == 0) {

				JOptionPane.showMessageDialog(null, "Encerrando..");
				cont = false;
				System.exit(0);

			}
			if (resposta == 1) {
				JOptionPane.showMessageDialog(null, "Voltando");

			}
		}
	}
}

		
	
		
		 /* 	
   Object[] opcoes = {"Um","Dois","Tres","Quatro"};
	Object res = JOptionPane.showInputDialog(null, "Escolha um item" , "Selecao de itens" ,
					JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");
	
		   String entrada;
		      int num;
		      entrada = JOptionPane.showInputDialog( " Digite um numero inteiro " );
		      num = Integer.parseInt( entrada ); // aqui ele converte a String
		      num = num * 5;
		      JOptionPane.showMessageDialog( null,
		         " Numero multiplicado por 5 e = " + num,
		         " Resultado da operacao ",
		         JOptionPane.INFORMATION_MESSAGE );
		      System.exit( 0 );
		  */    
		      
	
	
	
	
