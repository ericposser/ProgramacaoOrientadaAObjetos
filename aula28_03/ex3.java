package aula28_03;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		try {
			String st;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a string:");
			st = sc.nextLine();
			
			double d = Double.valueOf(st).doubleValue();
		} catch (Exception e) {
			System.out.println("ERRO");
		}
		

	}

}
