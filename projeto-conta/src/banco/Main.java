package banco;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta("janjão", 0);
        Conta conta02 = new Conta("professor", 0);

        try {

            conta01.depositar(1825);
            conta01.sacar(25);
            conta01.transferir(conta02, 60000);

            System.out.println("\n========================");
            System.out.println("Informações finais!!!");
            conta01.info();
            conta02.info();

        } catch (Exception error) {
            System.out.println("Ocorreu um erro: " + error.getMessage());
        } finally {
            System.out.println("\n\nFechando programa!!!");
        }
    }
}
