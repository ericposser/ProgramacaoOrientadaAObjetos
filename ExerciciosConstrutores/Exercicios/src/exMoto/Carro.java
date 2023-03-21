package exMoto;

public class Carro {
	public String marca;
	public String modelo;
	
	public void atribuirCarro(String marcaCarro, String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	public String retornaMarca(){
		return marca;
	}
	public String retornaModelo() {
		return modelo;
	}
}
