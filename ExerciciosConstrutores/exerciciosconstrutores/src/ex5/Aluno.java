package ex5;

public class Aluno {
	public String nome;
	public String datanasci;
	public String matricula;
	public String anoingressou;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		
		System.out.println("nome: " + nome + " matricula: " + matricula);
	}

	public Aluno(String datanasci) {
		this.datanasci = datanasci;
		
		System.out.println("data de nascimento: " + datanasci);
	}

	public Aluno(String nome, String datanasci, String anoingressou) {
		this.nome = nome;
		this.datanasci = datanasci;
		this.anoingressou = anoingressou;
		
		System.out.println("nome: " + nome + " data de nascimento: " + datanasci + " ano que ingressou na faculdade: " + anoingressou);
	}
	
	
	
	
	
}
