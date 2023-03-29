package aula28_03;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ex4 {

	public static void main(String[] args) {
		// caso a frase esteja nula e se tente usar o método toUpperCase() na mesma será lançada uma exceção de NullPointerException.
		
		String frase = null;
		  String novaFrase = null;
		  try
		  {
		    novaFrase = frase.toUpperCase();
		  }
		  catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
		  {
		    
		    frase = "Frase vazia";
		    novaFrase = frase.toUpperCase();
		  }
		  System.out.println("Frase antiga: "+frase);
		  System.out.println("Frase nova: "+novaFrase);
	
		
		//InputMismatchException ocorre quando a entrada de dado não condiz com o tipo esperado, 
		//espera-se que se entre com inteiros, se digitar um caractere, lança a exceção.
		 Scanner ler = new Scanner(System.in);
	        int numero = 0;

	        do {

	            try {
	                System.out.print("Digite um numero: ");
	                numero = ler.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
	            }
	            ler.nextLine();

	        } while (numero == 0);

	        System.out.println(numero);
	
	
	}
}
