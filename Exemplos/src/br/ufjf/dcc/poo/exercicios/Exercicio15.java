package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int inicio, fim;
		
		System.out.println("Informe o número inicial: ");
		inicio = teclado.nextInt();
		
		System.out.println("Informe o número final: ");
		fim = teclado.nextInt();
			
		
	    for (int i = inicio; i < fim; i++)
		System.out.println(i + " ");
	}

}

