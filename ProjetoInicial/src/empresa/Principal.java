package empresa;

import java.util.Scanner;

public class Principal {
	
	// public -> diz respeito que essa função main
	// pode ser acessada terceiros
	
	// void - significa oque a função irar retornar algo, por exemplo:
	// int -> número inteiro,
	// float número flutuante,
	// void -> que pode retornar qualquer coisa e etc

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		double peso;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = teclado.next();
		
		System.out.print("Olá " + nome + ", digite sua idade: ");
		idade = teclado.nextInt();
		
		System.out.print("Agora digite o seu peso: ");
		peso = teclado.nextFloat();
		
		System.out.printf("\nEssa são suas informações:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso + "\n");
		
		// uso de if's
		
		if (idade < 18) {
			System.out.println("Acesso bloqueado!!");
			System.out.println("Acesso bloqueado!!");
		} else if (idade <= 65) {
			System.out.println("Acesso liberado!!");
		} else {
			System.out.println("Você perdeu seu acesso (Muito idoso 👴👴)");
		}
		
		// uso de for
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Acessando em " + i);
			
			if (i == 10) {
				System.out.println("\nEntrou na conta!!");
			}
		}
		
		// Uso de Array's
		
		int num[] = {11, 14, 21, 30, 37, 56};
		
		
		// mudando o valor pelo indice
		num[0] = 10;
		
		// criando um array com tamanos de posições de indices
		int num2[] = new int[200];

	}

}
