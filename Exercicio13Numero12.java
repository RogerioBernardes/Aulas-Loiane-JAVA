package loiane;

import java.util.Scanner;

public class Exercicio13Numero12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double ideal = (72.7*altura) - 58;
		System.out.println("O peso ideal é: " + ideal);
	}

}
