package aula28_03;

public class main2 {

	public static void main(String[] args) {
		//exemplo2: divisao por zero
		try {
			int a = 10;
			int b = 0;
			
			System.out.println(a/b);
		}catch(Exception e){
			System.out.println("erro");
		}
		
		
	}

}
