package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int soldadosInimigos = 10000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos soldados adversários os espartanos de Leonidas irão enfrentar na guerra?");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro.");
                scanner.next();
                continue;
            }

            int palpite = scanner.nextInt();

            if (palpite < soldadosInimigos) {
                System.out.println("Um pouco mais 😃");
            } else if (palpite > soldadosInimigos) {
                System.out.println("Um pouco menos 🙄");
            } else {
                System.out.println("Isso mesmo, 10.000!! 😐");
                break;
            }
        }

        scanner.close();
    }

}
