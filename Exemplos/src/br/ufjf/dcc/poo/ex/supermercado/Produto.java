package br.ufjf.dcc.poo.ex.supermercado;

public class Produto {

	//Atributos
	private String nome;
	private float preco;
	private int qntEstoque;
	

	//Construtores
	public Produto() {}
	
	public Produto( String nome, float preco, int qntEstoque ) {
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}
    
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}
	
	
	// Metodos
	public void baixaNoEstoque(int num) {
		if ((this.qntEstoque - num) > 0) {
			this.setQntEstoque(this.qntEstoque - num);
		}else {
			System.out.println("Não é possível realizar a compra. Estoque Insuficiente");
		}
		
	}
	
	
}
