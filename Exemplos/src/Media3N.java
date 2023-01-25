import java.util.Scanner;

public class Media3N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		float n1, n2, n3; //dados de entrada
		float resultado; //dados de saida
		System.out.println("Informe n1: ");
		n1 = teclado.nextFloat();
		System.out.println("Informe n2: ");
		n2 = teclado.nextFloat();
		System.out.println("Informe n3: ");
		n3 = teclado.nextFloat();
		resultado = (float)(n1+n2+n3) / 3.0f;
		System.out.println("Área: " + resultado);
	}

}
