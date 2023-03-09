package aulaoo;

import java.util.Scanner;

public class Diciplina {

	public static void main(String[] args) {
		Professor p = new Professor();
		Laboratorio l = new Laboratorio();
		
		System.out.println("Digite o nome do prof: ");
		Scanner scan = new Scanner(System.in);
		p.nome = scan.nextLine();
		
		System.out.println("Digite o laboratorio: ");
		l.local = scan.nextLine();
		
		System.out.println("o nome do prof e: " + p.nome);
		System.out.println("o local da aula e: " + l.local);

	}

}
