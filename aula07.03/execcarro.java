package aulaoo;

import java.util.Scanner;

public class execcarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("marca: ");
		c1.marca = scan.nextLine();
		
		System.out.println("modelo: ");
		c1.modelo = scan.nextLine();
		
		System.out.println("ano: ");
		c1.fabricacao = scan.nextInt();
		scan.nextLine();
		
		System.out.println("marca 2: ");
		c2.marca = scan.nextLine();
		
		System.out.println("modelo 2: ");
		c2.modelo = scan.nextLine();
		
		System.out.println("ano 2: ");
		c2.fabricacao = scan.nextInt();
		scan.nextLine();
		
		System.out.println("marca 1: " + c1.marca + "modelo 1: " + c1.modelo + "ano 1: " + c1.fabricacao);
		System.out.println("marca 2: " + c2.marca + "modelo 2: " + c2.modelo + "ano 2: " + c2.fabricacao);

	}

}
