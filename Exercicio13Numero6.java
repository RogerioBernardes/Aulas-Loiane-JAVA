package loiane;

import java.util.Scanner;

public class Exercicio13Numero6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("Area do circulo é: " + area);

	}

}
