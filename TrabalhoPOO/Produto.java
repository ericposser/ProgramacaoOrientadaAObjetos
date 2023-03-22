package exPOO;

public class Produto {
	public int codigo;
	public String descricao;
	public float precocusto;
	public float precovenda;
	public int estoque;
	
	
	public Produto(int codigo, String descricao, float precocusto, float precovenda, int estoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.precocusto = precocusto;
		this.precovenda = precovenda;
		this.estoque = estoque;
	}

	public void vendeProduto(int itens) {
		estoque -= itens;
	}
	
	public void baixaEstoque(int itens, int motivo) {
		estoque -= itens;
		
		if(motivo == 1) {
			System.out.println("motivo: roubo");
		}
		
		if(motivo == 2) {
			System.out.println("motivo: perda/quebra");
		}
		
		if(motivo == 3) {
			System.out.println("motivo: outro");
		}
	}
	
	public void entraEstoque(int itens) {
		estoque += itens;
	}
	
	public int retoraEstoque() {
		return estoque;
	}
	
	
	
}

