package loiane;

import java.util.Scanner;

public class Exercicio13Numero11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um numero real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3 ) + num3;
		double resultado3 = Math.pow(num3, 3); 
		
		System.out.println(" O dobro  do primeiro com a metade do segundo �: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + resultado2);
		System.out.println(" O terceiro elevado ao cubo �: " + resultado3);

	}

}
