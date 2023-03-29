package aula28_03;

public class Principal {

	public static void main(String[] args) {
		//exemplo 1: tentando acessar um elemento fora do indice de um array
		
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[3]); //ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: infice fora do array");
		}

	}

}
