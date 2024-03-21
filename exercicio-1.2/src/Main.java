public class Main {
    public static void main(String[] args) {
        Conta contaX = new Conta(445509, "João Victor", 2000, 400);

        contaX.depositar(1600);

        contaX.sacar(200);

        contaX.info();
    }
}
