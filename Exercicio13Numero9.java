package loiane;

import java.util.Scanner;

public class Exercicio13Numero9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperaturaem Farenheit: ");
		double f = scan.nextDouble();
		
		double c = (5 * (f - 32)/9);
		
		System.out.print("A temperatura convertidaé: " + c + " Celsius");
		
		
		

	}

}
