package br.ufjf.dcc.poo.ex.supermercado;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	// Attributes
	private ArrayList<Item> itens = new ArrayList<Item>(); 
	private String pagamento;
	
	//Constructors
	public Pedido(ArrayList<Item> itens, String pagamento) {
		this.itens = itens;
		this.pagamento = pagamento;
	}
	
	public Pedido(String pagamento) {
	   this.pagamento = pagamento;
	}

	//Getters and Setters	
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	
	//Methods
	
	
	
	

}
