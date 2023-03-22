package exPOO;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, estoque, itens, motivo;
		String descrisao;
		float precocusto, precovenda;
		
		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Digite a descrisao do produto: ");
		descrisao = sc.nextLine();
		
		System.out.println("Digite o preco de custo: ");
		precocusto = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Diite o preco de venda: ");
		precovenda = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Digite o estoque: ");
		estoque = sc.nextInt();
		
		sc.nextLine();
		
		Produto p = new Produto(codigo, descrisao, precocusto, precovenda, estoque);
		
		do {
			
			System.out.println("1 - Venda do produto");
			System.out.println("2 - Entra estoque");
			System.out.println("3 - Baixa estoque");
			System.out.println("4 - Retorna estoque");
			System.out.println("0 - Sair");
			
			System.out.println("Digite a opcao");
			op = sc.nextInt();
			sc.nextLine();
			
			if(op == 1) {
				System.out.println("quantidade de itens vendidos: ");
				itens = sc.nextInt();
				
				p.vendeProduto(itens);
			}
			
			if(op == 2) {
				System.out.println("quantidade de itens que entraram em estoque: ");
				itens = sc.nextInt();
				
				p.entraEstoque(itens);
			}
			
			if(op == 3) {
				System.out.println("Quantidade de itens perdidos: ");
				itens = sc.nextInt();
				
				System.out.println("motivo: 1 - roubo 2 - perda/quebra 3 - outro");
				motivo = sc.nextInt();
				
				p.baixaEstoque(itens, motivo);
				
			}
			
			if(op == 4) {
				System.out.println("estoque: " + p.retoraEstoque());
			}
			
			if(op == 0) {
				System.out.println("codigo: " + codigo);
				System.out.println("descrisao: " + descrisao);
				System.out.println("preco de custo: " + precocusto);
				System.out.println("preco de venda: " + precovenda);
				System.out.println("estoque: " + estoque);
			}
			
		}while(true);
		
		
	}

}
