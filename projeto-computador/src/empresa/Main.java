package empresa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Desktop compA = new Desktop(8,4,600);
        Desktop compB = new Desktop(8,4,600);
        Notebook compC = new Notebook(16,18,1200);

        ArrayList<Computador> listaComputadores = new ArrayList<>();

        listaComputadores.add(compA);
        listaComputadores.add(compB);
        listaComputadores.add(compC);

        double total = 0;

        System.out.println("Listando todos os computadores:\n");

        for (Computador c : listaComputadores) {
            System.out.println("Valor total do produto atual: R$ " + c.calculaValor());
            total += c.calculaValor();
        }

        System.out.println("\nTotal do valor: " + total);
    }
}
