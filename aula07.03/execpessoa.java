package aulaoo;

import java.util.Scanner;

public class execpessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		p.nome = scan.nextLine();
		
		System.out.println("Digite a idade: ");
		p.idade = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Digite o genero: ");
		p.genero = scan.nextLine();
		
		System.out.println("nome: " + p.nome + "idade: " + p.idade + "genero: " + p.genero);

	}

}
