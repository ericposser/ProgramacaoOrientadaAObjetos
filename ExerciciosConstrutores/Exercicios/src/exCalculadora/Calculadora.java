package exCalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RealizaConta rc = new RealizaConta();
		
		System.out.println("digite o valor 1: ");
		rc.v1 = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("digite o valor 2: ");
		rc.v2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("soma: " + rc.Soma());
		System.out.println("subtracao: " + rc.Subtracao());
		System.out.println("multiplicacao: " + rc.multiplicacao());
		System.out.println("divisao: " + rc.divisao());
		
	}

}
