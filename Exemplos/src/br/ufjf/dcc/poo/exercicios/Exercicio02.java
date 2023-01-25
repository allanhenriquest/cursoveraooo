package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); // leitor de dados do teclado
		float largura_terreno, profundidade_terreno, largura_casa, profundidade_casa; //dados de entrada
		float area_terreno;
		float area_casa;
		float area_livre;
		System.out.println("Informe largura_terreno ");
		largura_terreno = teclado.nextFloat();
		System.out.println("Informe profundidade_terreno ");
		profundidade_terreno = teclado.nextFloat();
		System.out.println("Informe largura_casa ");
		largura_casa = teclado.nextFloat();
		System.out.println("Informe profundidade_casa ");
		profundidade_casa = teclado.nextFloat();
		area_casa = largura_casa * profundidade_casa;
		area_terreno = largura_terreno * profundidade_terreno;
		area_livre = area_terreno - area_casa;
		
		System.out.println("Área Livre: " + (area_livre / area_terreno)*100 + "%");
	}

}
