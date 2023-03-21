package exMoto;

import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		String modeloMoto1, modeloMoto2, marcaMoto1, marcaMoto2;
		int cilindradas1, cilindradas2;
		String modeloCarro, marcaCarro;
		
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro();
		Moto m1 = new Moto();
		Moto m2 = new Moto();
		
		//carro
		System.out.println("digite a marca do carro: ");
		marcaCarro = sc.nextLine();
		
		System.out.println("digite o modelo do carro: ");
		modeloCarro = sc.nextLine();
		
		c.atribuirCarro(marcaCarro, modeloCarro);
		
		//moto 1
		System.out.println("digite a marca da moto 1: ");
		marcaMoto1 = sc.nextLine();
		
		System.out.println("digite o modelo da moto 1: ");
		modeloMoto1 = sc.nextLine();
		
		System.out.println("digite as cilindradas da moto 1: ");
		cilindradas1 = sc.nextInt();
		
		sc.nextLine();
		
		m1.atribuirMoto(marcaMoto1, modeloMoto1, cilindradas1);
		
		//moto 2
		System.out.println("digite a marca da moto 2: ");
		marcaMoto2 = sc.nextLine();
		
		System.out.println("digite o modelo da moto 2: ");
		modeloMoto2 = sc.nextLine();
		
		System.out.println("digite as cilindradas da moto 2: ");
		cilindradas2 = sc.nextInt();
		
		m2.atribuirMoto(marcaMoto2, modeloMoto2, cilindradas2);
		
		System.out.println("valores carro: " + c.retornaMarca() + " " + c.retornaModelo());
		
		System.out.println("valores moto 1: " + m1.retornaMarca() + " " + m1.retornaModelo() + " " + m1.retornaCilindradas());
		
		System.out.println("valores moto 2: " + m2.retornaMarca() + " " + m2.retornaModelo() + " " + m2.retornaCilindradas());
		
		

	}

}
