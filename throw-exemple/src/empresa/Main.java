package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um valor de 0 a 10");

        Scanner teclado = new Scanner(System.in);
        int valor  = teclado.nextInt();

        if (valor > 10 || valor < 0) {
            throw new Exception("Valor inválido");
        }

    }
}
