package ex5;

import java.util.Scanner;

public class mainAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, datanasci, matricula, anoingressou;
		int op;
		
		System.out.println("selecione o contrutor que deseja utilizar\n");
		System.out.println("1 - nome, matricula");
		System.out.println("2 - data de nascimento");
		System.out.println("3 - nome, data de nascimento, ano que ingressou");
		op = sc.nextInt();
		
		sc.nextLine();
		
		if(op == 1) {
			System.out.println("digite o nome: ");
			nome = sc.nextLine();
			System.out.println("digite a matricula: ");
			matricula = sc.nextLine();
			Aluno a = new Aluno(nome, matricula);
		}
		else if(op == 2) {
			System.out.println("digite a data de nascimento: ");
			datanasci = sc.nextLine();
			
			Aluno a = new Aluno(datanasci);
		}
		else if(op == 3) {
			System.out.println("digite o nome: ");
			nome = sc.nextLine();
			System.out.println("digite a data de nascimento: ");
			datanasci = sc.nextLine();
			System.out.println("digite o ano que ingressou: ");
			anoingressou = sc.nextLine();
			
			Aluno a = new Aluno(nome, datanasci, anoingressou);
		}
		else {
			System.out.println("opcao invalida");
		}

	}

}
