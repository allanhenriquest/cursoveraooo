package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;


public class Exercicio05 {
	
	public static void main(String[] args) {
	
	float x1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor x1: "));
	float y1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor y1: "));
	
	float x2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor x2: "));
	float y2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor y2: "));
	
	float x = (float) Math.pow(x2-x1, 2);
	float y = (float) Math.pow(y2-y1, 2);

	float distancia = (float) Math.sqrt(x+y);
	
	
	
	}
	
	

}
