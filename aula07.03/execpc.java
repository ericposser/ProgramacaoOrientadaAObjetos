package aulaoo;

import java.util.Scanner;

public class execpc {

	public static void main(String[] args) {
		Pc pc1 = new Pc();
		Pc pc2 = new Pc();
		
		Scanner scan = new Scanner(System.in);
		
		pc1.marca = "dell";
		pc1.modelo = "nitro";
		pc1.tipo = "not";
		pc1.preco = 2000;
		
		System.out.println("marca: ");
		pc2.marca = scan.nextLine();
		
		System.out.println("modelo: ");
		pc2.modelo = scan.nextLine();
		
		System.out.println("tipo: ");
		pc2.tipo = scan.nextLine();
		
		System.out.println("preco: ");
		pc2.preco = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("marca 2: " + pc2.marca + "modelo  2: " + pc2.modelo + "tipo 2" + pc2.tipo + "preco 2: " + pc2.preco);
		System.out.println("marca 1: " + pc1.marca + "modelo  1: " + pc1.modelo + "tipo 1" + pc1.tipo + "preco 1: " + pc1.preco);

	}	

}
