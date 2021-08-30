package loiane;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite seu nome completo:\n ");
		String nomeCompleto = teclado.nextLine();
		
		System.out.println("Seu nome é :\n" + nomeCompleto);
		
		System.out.println(" Digite seu primeiro nome: \n");
		String primeiroNome = teclado.next();
		
		System.out.println(" Digite seu primeiro nome: \n" + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Sua idade é: " + idade);
		

	}

}
