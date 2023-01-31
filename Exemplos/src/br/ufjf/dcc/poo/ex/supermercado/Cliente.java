package br.ufjf.dcc.poo.ex.supermercado;

public class Cliente {
	
	private String Nome;
	private String CPF;
	private String email;
	private String senha;
	
	public Cliente() { }
		
	public Cliente(String nome, String CPF, String email, String senha) {
		this.Nome = nome;
		this.setCPF(CPF);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setNome(String nome){
		this.Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	    

}
