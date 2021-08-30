package loiane;

import java.util.Scanner;

public class Exercicio13Numero10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperaturaem Celsius: ");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.print("A temperatura convertidaé: " + f + " Farenheit");
		
	}

}
