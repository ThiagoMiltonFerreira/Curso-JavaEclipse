package ControleDeEstoque;

import java.util.Scanner;

public class Produtos {
	
	Produtos(){
		boolean rodando=true;
		String produto = "3";
		boolean bloqueiaEntradaProduto=false;
		int qtdDeLinhasDaMatriz=3;
		int qtdDeColunaNaMatriz=4;
		Scanner leitura=new Scanner(System.in);
		
		
		
		String CodBarrasProdutosEnome[][] = {{"7890218233597","SDS 3k",produto,"350"},{"7891","Hark power","5","340"},{"7892","Cabo Y blidado Stetsom","4","30"}};
		for(int i=0;rodando==true;i++)
		{
		System.out.println("Codigo de barras:");
		String EntradacodigoDeBarras=leitura.next();
		System.out.println("Codigo de barras | Produto | Qtd | Valor");
		for(int contLinha=0;contLinha<qtdDeLinhasDaMatriz;contLinha++)
			{
				
				for(int contColuna=0;contColuna<qtdDeColunaNaMatriz;contColuna++)
				{

					if(Integer.parseInt(CodBarrasProdutosEnome[contLinha][0].substring(0, 4))==Integer.parseInt(EntradacodigoDeBarras.substring(0, 4)))
					{
					
						
						//System.out.println("nova qtd produto vendido "+produto);
						
						if(contColuna==qtdDeColunaNaMatriz-1)
						{						
							System.out.println(CodBarrasProdutosEnome[contLinha][contColuna]+" ");
							System.out.println("Liberar venda estoque digite 0 ou 1:");
							 int liberarProdutoEstoque = leitura.nextInt();
							 if(liberarProdutoEstoque==0)
							 {
								
								
								
								 SubtraiProdutoVendido produtoVendido = new SubtraiProdutoVendido(Integer.parseInt(CodBarrasProdutosEnome[contLinha][2]));
								 produto=String.valueOf(produtoVendido.calculoProduto);
								 System.out.println(produtoVendido.calculoProduto);
								 bloqueiaEntradaProduto=true;
								 //contaProduto=produtoVendido.calculoProduto;
								 //System.out.println(contaProduto);
							 }
							
						}
						else
						{
							System.out.print(CodBarrasProdutosEnome[contLinha][contColuna]+" ");
						}
					}
				
			}
		}

	}
}
}


	
	

