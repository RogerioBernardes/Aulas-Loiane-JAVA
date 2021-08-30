package loiane;

import java.util.Scanner;

public class Exercicio13Numero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos metros deseja converter: ");
		double cm = scan.nextDouble();
		
		double resultado = cm * 100;
		System.out.println(" A medida em centimetros é: " + resultado + " cm");
				
	}

}
