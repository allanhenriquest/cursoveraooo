package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); // leitor de dados do teclado
		int altura, base; //dados de entrada
		float area; //dados de saida
		System.out.println("Informe a altura: ");
		altura = teclado.nextInt();
		System.out.println("Informe a base: ");
		base = teclado.nextInt();
		area = 0.5f* altura * base;
		System.out.println("Área: " + area);
	}

}
