package br.ufjf.dcc.poo.ex.media;

public class Aluno {
	
	private String nome;
	private String matricula;
	private float provaUm;
	private float provaDois;
	private float trabalho;
	
	public Aluno(String nome, String matricula, float provaUm, float provaDois, float trabalho) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.provaUm = provaUm;
		this.provaDois = provaDois;
		this.trabalho = trabalho;
	}

	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getProvaUm() {
		return provaUm;
	}

	public void setProvaUm(float provaUm) {
		this.provaUm = provaUm;
	}

	public float getProvaDois() {
		return provaDois;
	}

	public void setProvaDois(float provaDois) {
		this.provaDois = provaDois;
	}

	public float getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}
	
	public float media() {
		float dividendo = this.provaUm*2.5f + this.provaDois*2.5f + this.trabalho*2 ;
		float divisor = 2.5f+2.5f+2f;
		float nota = dividendo / divisor;
		return nota;
	
	}
	
	public void provaFinal() {
		float nota = this.media();
		
		if (nota >= 4 && nota < 6) {
		  System.out.println(this.nome + "Terá q fazer prova final");
		}
		if ( nota < 4 ) {
			System.out.println(this.nome + "Está Reprovado");
		}
		if (nota >= 6) {
			System.out.println(this.nome + "Está Aprovado");
		}
	}
	
	

}
