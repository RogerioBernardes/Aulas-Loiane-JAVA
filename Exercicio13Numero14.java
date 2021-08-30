package loiane;

import java.util.Scanner;

public class Exercicio13Numero14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Entre com o tamanho do arquivo: ");
		double arquivo = scan.nextDouble();
		System.out.print("Entre com a velocidade da internet");
		double internet = scan.nextDouble();
		
		double tempo = arquivo / internet;
		System.out.print(" tempo de Download" + tempo);
		
		
		
	}

}
