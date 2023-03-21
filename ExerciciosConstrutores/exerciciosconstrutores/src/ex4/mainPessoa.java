package ex4;

import java.util.Scanner;

public class mainPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
        System.out.println("Qual construtor você deseja utilizar?");
        System.out.println("1 - Nome e idade");
        System.out.println("2 - Apenas idade");
        int opcao = sc.nextInt();
        
        sc.nextLine();
        
        if (opcao == 1) {
            System.out.println("Informe o nome:");
            nome = sc.nextLine();
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            
        } else if (opcao == 2) {
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
            Pessoa pessoa = new Pessoa(idade);
        } else {
            System.out.println("Opção inválida.");
        }
		
		

	}

}
