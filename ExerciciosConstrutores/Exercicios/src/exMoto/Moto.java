package exMoto;

public class Moto {
	public String modelo;
	public String marca;
	public int cilindradas;
	
	public void atribuirMoto(String modeloMoto, String marcaMoto, int cilindradasMoto) {
		modelo = modeloMoto;
		marca = marcaMoto;
		cilindradas = cilindradasMoto;
				
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public int retornaCilindradas() {
		return cilindradas;
	}
}
