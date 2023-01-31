package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int flag = 0;
		int soma = 0;
		int counter = 0;	
		
		while (flag != -1) {
			
	    System.out.println("Informe o número: ");
	    flag = teclado.nextInt();
	    if (flag == -1) {
	    	break;
	    }
	    soma += flag; 
	    counter++;
	    
		}
		
		float resultado = (float) soma/counter;
		System.out.println("Media: " + resultado);
	}

}
