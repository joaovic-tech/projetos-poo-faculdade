package empresa;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void add(Moeda moeda) {
        moedas.add(moeda);
    }

    private double calcularTotal() {
        double total = 0;
        for(Moeda moeda: moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    public void info() {
        System.out.printf("O tatal de moedas no cofrinho é: %.2f ", calcularTotal());
    }
}
