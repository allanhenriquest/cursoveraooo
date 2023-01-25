package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Equação de Segundo Grau
		Scanner teclado = new Scanner(System.in); // leitor de dados do teclado
		float a,b,c,x1,x2,delta;
		
		System.out.println("Informe a: ");
		a = teclado.nextFloat();
		
		System.out.println("Informe b: ");
		b = teclado.nextFloat();
		
		System.out.println("Informe c: ");
		c = teclado.nextFloat();
		
		delta = (float) pow(b, 2) -4*a*c ;
		
		if (delta > 0)
		{
		
		x1 = (-b + (float)sqrt(delta))/2*a;
		
		x2 = (-b - (float)sqrt(delta))/2*a;
		
		System.out.println("Delta: " +  delta);
		System.out.println("Raiz 1: " + x1);
		System.out.println("Raiz 2: " + x2);
		}
		
		if (delta == 0 )
		{
			System.out.println("Delta Igual a:  " +  delta + " Raizes Iguais");
			
			x1 = (-b + (float)sqrt(delta))/2*a;
			
			System.out.println("\n Raizes Iguais: " + x1);
		}
		
		if (delta < 0) {
			System.out.println("Não Existe Raiz Real" );
		}
		

	}

}
