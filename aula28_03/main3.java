package aula28_03;

public class main3 {

	public static void main(String[] args) {
		//exempl 3: tentando converter uma String em um numero
		try {
			String numero = "abc";
			int valor = Integer.parseInt(numero);
		}catch(Exception e){
			System.out.println("erro");
		}
		 

	}

}
