package ex3;

import java.util.Scanner;

public class mainConta {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente(0);
		
		novaConta.definirSaldoInicial(1000);
		
		System.out.println("saldo = " + novaConta.saldo);
		
		novaConta.sacar(500);
		
		novaConta.depositar(50);
		
		System.out.println("saldo = " + novaConta.saldo);
		
		boolean sacado = novaConta.sacar(600);
		
		if(sacado == true) {
			System.out.println("saldo = " + novaConta.saldo);
		}else {
			System.out.println("dinheiro insuficiente");
		}
		
	}

}
