package ex3;

public class ContaCorrente {
public float saldo;
	
	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}

	public void definirSaldoInicial(float saldoInicial) {
		saldo = saldoInicial;
	}
	
	public void depositar(float valor) {
		saldo += valor;
	}
	
	public boolean sacar(float valor) {
		if(saldo > valor) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
}
