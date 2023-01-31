package br.ufjf.dcc.poo.ex.media;
import java.util.ArrayList;
import java.util.Scanner;

import br.ufjf.dcc.poo.ex.notas.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i < 3; i++)
		{
			Aluno a = new Aluno();
			
		
			System.out.println("Digite o nome do aluno: ");
		    a.setNome(teclado.nextLine());			
			
			System.out.println("Digite a matricula do aluno: ");
			a.setMatricula(teclado.nextLine());
			
			System.out.println("A nota do aluno na primeira prova: ");
			a.setProvaUm(teclado.nextFloat());
			
			System.out.println("A nota do aluno na segunda prova: ");
			a.setProvaDois(teclado.nextFloat());
			
			System.out.println("A nota do aluno no trabalho ");
			a.setTrabalho(teclado.nextFloat());
			
			alunos.add(a);
		}
		
		for (Aluno a: alunos) {
			System.out.println("Situação do Aluno: ");
			a.provaFinal();	
			
		}

	}

}
