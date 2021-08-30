package loiane;

import java.util.Scanner;

public class Exercicio13Numero8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o valor recebido por hora ? ");
		double valor = scan.nextDouble();
		
		System.out.print("Quantas horas trabalhadas? ");
		double hora = scan.nextDouble();
		
		System.out.print("O total do seu salário no mês é  " + (valor * hora));
				
				
		

	}

}
