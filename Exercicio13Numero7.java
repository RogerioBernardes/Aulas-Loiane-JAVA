package loiane;

import java.util.Scanner;

public class Exercicio13Numero7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite com a medida do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado ou 
		
		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro da area do quadrado é: " + (area* 2));
	}

}
