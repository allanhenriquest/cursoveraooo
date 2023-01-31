package br.ufjf.dcc.poo.ex.notas;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i < 3; i++)
		{
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(teclado.nextLine());
			
			System.out.println("Digite a idade da pessoa: ");
			p.setIdade(Integer.parseInt(teclado.nextLine()));
			
			System.out.println("Digite o sexo da pessoa: ");
			p.setSexo(teclado.nextLine());
			
			pessoas.add(p);
		}
		
		for (Pessoa p: pessoas) {
			System.out.println("O nome da pessoa é: " + p.getNome());
			System.out.println("A idade da pessoa é: " + p.getIdade());
			System.out.println("O sexo da pessoa é: " + p.getSexo());
			
		}

	}

}
