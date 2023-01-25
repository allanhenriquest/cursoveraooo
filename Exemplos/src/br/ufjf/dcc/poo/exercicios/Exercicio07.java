package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;


public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int theNumber =  (int)  ( 0 + Math.random() * 1000 );
		System.out.println("Informe sua aposta: ");
		int theGuess = teclado.nextInt();
		
		
		while (theGuess != theNumber) {
			
			if( theGuess < theNumber ) {
				System.out.println("Errou. O seu número é menor do que o escolhido.Informe sua aposta: ");
				theGuess = teclado.nextInt();
				
			} else if ( theGuess > theNumber)
				
			{
				System.out.println("Errou. O seu número é maior do que o escolhido.Informe sua aposta: ");
				theGuess = teclado.nextInt();
			}		
       
	     }
	System.out.println("Parabéns! Você ganhou! ");
    }

}
