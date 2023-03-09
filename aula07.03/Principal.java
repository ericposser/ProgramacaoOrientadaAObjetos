package aulaoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		System.out.println("Digite o nome do p1: ");
		Scanner scan = new Scanner(System.in);
		p1.nome = scan.nextLine();
		
		System.out.println("Digite a idade do p1: ");
		p1.idade = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Digite o nome do p2: ");
		p2.nome = scan.nextLine();
		
		System.out.println("Digite a idade do p2: ");
		p2.idade = scan.nextInt();
		
		System.out.println("nome da p1: " + p1.nome + "idade: " + p1.idade);
		System.out.println("nome da p2: " + p2.nome + "idade do p2: " + p2.idade);
		
	}

}
