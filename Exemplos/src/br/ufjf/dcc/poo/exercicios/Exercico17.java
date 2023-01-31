package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercico17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int flag = 0;
		int counter = 0;	
		
		while (flag != -1) {
			
	    System.out.println("Informe o número: ");
	    flag = teclado.nextInt();
	    if (flag == -1) {
	    	break;
	    }
	    
	    if (flag%2 != 0 )
	    {
	    counter++;
	    }
	    
		}
		
		
		System.out.println("Total Impar: " + counter);
	}

	}

