package aula28_03;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		try {
			int valor;
			System.out.println("digite um valor inteiro: ");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextInt();
			
			System.out.println("raiz de: " + valor + " eh " + Math.sqrt(valor));
			
		} catch (Exception e) {
			System.out.println("erro: valor digitado nao e inteiro");
		}

	}

}
