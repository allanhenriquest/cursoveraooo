package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class ValorAbsoluto {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		double numero = teclado.nextDouble();
		if (numero < 0)
		 numero = -numero;
		System.out.println("Valor absoluto: " + numero);
		
	}

}
