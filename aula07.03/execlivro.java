package aulaoo;

import java.util.Scanner;

public class execlivro {

	public static void main(String[] args) {
		Livro l = new Livro();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o titulo: ");
		l.titulo = scan.nextLine();
		
		System.out.println("Digite o autor: ");
		l.autor = scan.nextLine();
		
		System.out.println("Digite o ano: ");
		l.ano = scan.nextInt();
		scan.nextLine();
		
		System.out.println("titulo: " + l.titulo + "autor: " + l.autor + "ano: " + l.ano);

	}

}
