package exDiciplina;

public class Diciplina {
	public String nome;
	public int horario;
	public String nomeProf;
	
	public void atribuir(String nomeD, int horarioD, String nomeProfD) {
		nome = nomeD;
		horario = horarioD;
		nomeProf = nomeProfD;
	}
	
	public String retornaNome() {
		return nome;
	}
	
	public int retornaHorario() {
		return horario;
	}
	
	public String retornaNomeProf() {
		return nomeProf;
	}
	
	
}
