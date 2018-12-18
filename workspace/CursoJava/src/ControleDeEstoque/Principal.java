package ControleDeEstoque;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
	
		@SuppressWarnings("resource")
		Scanner leitura=new Scanner(System.in);
	
		
		Crud crud = new Crud();
		System.out.println("Digite 1 para INSERIR / 2 para VER TODOS PRODUTOS / 3 PARA DELETAR / 4 Para Atualizar produto ja cadastrado .");
		int inserirOuVerificar = leitura.nextInt();
		crud.selectComWhere(String.valueOf(inserirOuVerificar));
		if(inserirOuVerificar==1) {	
			System.out.println("Nome do produto:");
			String nomeDoProduto = leitura.next().toUpperCase();
		    System.out.println("Codigo de barras:");
		    String codDeBarras = leitura.next();
		    crud.selectComWhere(codDeBarras);
		    //System.out.println(crud.selectComWhere(null)); pega valor do return
		    System.out.println("Quantidade:");
		    String qtdProdutosEstoque = leitura.next();
			crud.insere(nomeDoProduto,codDeBarras,qtdProdutosEstoque);		
		}
		else if(inserirOuVerificar==2)
		{		
		crud.select();
		}
		else if(inserirOuVerificar==3) {
			System.out.println("Digite o codigo de barras do produto para excluir.");
			String CodDeBarrasExcluir = leitura.next();
			crud.excluir(CodDeBarrasExcluir);
		}
		else if(inserirOuVerificar==4)
		{ 
			System.out.println("Altera�ao de produtos.");
		    System.out.println("Codigo de barras:");
			String codDeBarras = leitura.next();
			crud.selectComWhere(codDeBarras);
			System.out.println("Nome do produto:");
			String nomeDoProduto = leitura.next().toUpperCase();
		    System.out.println("Quantidade:");
		    String qtdProdutosEstoque = leitura.next();
		  	crud.alterar(codDeBarras,qtdProdutosEstoque , nomeDoProduto);
		}
		else if (inserirOuVerificar==5)
		{
			System.out.println("Gerar promo��o para todos produtos em estoque!!!!");
			System.out.println("Ativar para todos produtos? 0/1 ");
			int EntradaAtivar = leitura.nextInt();
			boolean ativar;
			if (EntradaAtivar==0)
			{
				ativar = true;
				System.out.print("Valor em % ");
				int valorDescontoGeralPorcentagem = leitura.nextInt();
				crud.alterarPromocaoGeral(ativar, valorDescontoGeralPorcentagem);
				
			}
			else
			{
				ativar = false;
				
			}		
		}else
		{
			System.out.println("Verifique a op�ao desejada!!");
		}
		
		}
	}



