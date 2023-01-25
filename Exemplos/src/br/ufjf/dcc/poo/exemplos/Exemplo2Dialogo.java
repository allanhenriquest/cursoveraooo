package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialogo {

	public static void main(String[] args) {
		
		float valor1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor 1: "));
		float valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor 2: "));
		float soma = valor1+valor2;
		JOptionPane.showMessageDialog(null,"O valor da soma é: " + soma, "Resultado", 0);
	}

}
