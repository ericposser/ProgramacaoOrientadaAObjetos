package exDiciplina;

import java.util.Scanner;

public class mainDiciplina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Diciplina d = new Diciplina();
		
		String nomeDiciplina, nomeProfDiciplina;
		int cargaHoraria;
		
		System.out.println("Digite o nome da dici: ");
		nomeDiciplina = sc.nextLine();
		
		System.out.println("Digite o nome do prof da dici: ");
		nomeProfDiciplina = sc.nextLine();
		
		System.out.println("Digite a carga horaria da dici: ");
		cargaHoraria = sc.nextInt();
		sc.nextLine();
		
		d.atribuir(nomeDiciplina, cargaHoraria, nomeProfDiciplina);
		
		System.out.println("valores: " + d.nome + " " + d.nomeProf + " " + d.horario);

	}

}
