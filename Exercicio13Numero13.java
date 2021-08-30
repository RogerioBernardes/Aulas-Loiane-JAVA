package loiane;

import java.util.Scanner;

public class Exercicio13Numero13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor ganho por hora: ");
		double valor = scan.nextDouble();
		System.out.println("Digite as horas trabalhadas: ");
		double horas = scan.nextDouble();
		
		double salario = (valor * horas);
		System.out.println("Seu salario Bruto é: " +salario);
		
		double inss = (salario /100)*8;
		System.out.println(" Seu desconto de INSS é: "+ inss);
		
		double sindicato = (salario /100)* 5;
		System.out.println("Seu desconto do Sindicato é de: " + sindicato);
		
		double IR = (salario /100)* 11;
		System.out.println("Seu desconto de imposto de renda é: " + IR);
		
		double TotalDescontos = inss + sindicato + IR;
		System.out.println("O total descontado é de: " + TotalDescontos);
		
		double salarioliquido = (salario - TotalDescontos);
		System.out.println("O salário liquido é: " + salarioliquido);
	

		
	

	}

}
