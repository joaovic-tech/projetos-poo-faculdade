public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;

    Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação cancelada pois o valor do saque é zero");
        } else if (saldo < valor) {
            System.out.println("Não foi possivel sacar pois o seu saldo é menor que o valor do saque!!!");
        } else if (valor > limite) {
            System.out.println("Seu limite não permite sacar essa quantia!!!");
        } else {
            System.out.println("\n----------------------------");
            System.out.println("Efetuando saque");
            System.out.println("----------------------------");
            System.out.println("Saldo anterior: " + saldo);
            System.out.println("Valor do saque: " + valor);

            saldo -= valor;

            System.out.println("Saldo atual é de: " + saldo);
        }
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação cancelada pois o valor do deposito é zero");
        }

        System.out.println("\n----------------------------");
        System.out.println("Efetuando deposito");
        System.out.println("----------------------------");
        System.out.println("Saldo anterior: " + saldo);
        System.out.println("Valor do deposito: " + valor);

        saldo += valor;

        System.out.println("Saldo atual é de: " + saldo);
    }

    void info() {
        System.out.println("\n----------------------------");
        System.out.println("Número da conta: " + numero);
        System.out.println("Títular: " + titular);
        System.out.println("Saldo total: " + saldo);
        System.out.println("Limite disponível: " + limite);
    }
}
