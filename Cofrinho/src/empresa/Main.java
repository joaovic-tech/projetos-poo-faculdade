package empresa;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        cofrinho.add(new Moeda("BRL", 25.50));
        cofrinho.add(new Moeda("BRL", 250));
        cofrinho.add(new Moeda("BRL", 1600));
        cofrinho.add(new Moeda("BRL", 1700));
        cofrinho.add(new Moeda("BRL", 2500));

        cofrinho.info();
    }
}
