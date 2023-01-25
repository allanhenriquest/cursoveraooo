package br.ufjf.dcc.poo.exemplos;
import javax.swing.JOptionPane;

public class Exemplo1Dialogo {

	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog("Nome do Usuario: ");
		JOptionPane.showInternalMessageDialog(null, nomeUsuario);
	}
}
