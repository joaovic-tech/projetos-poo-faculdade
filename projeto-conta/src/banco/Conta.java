package banco;

public class Conta {
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        super();
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor do depósito é menor do que 0!");
        }

        this.saldo += valor;

        System.out.println(this.nome + " depositou R$ " + valor);
    }

    public void sacar(double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor do saque é menor do que 0!");
        }
        if (valor > this.saldo) {
            throw new Exception("Saldo insuficiente para o saque!");
        }

        this.saldo -= valor;

        System.out.println(this.nome + " fez um saque de R$ " + valor);
    }

    public void transferir(Conta outraConta, double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor da transferência é menor do que 0!");
        }
        if (valor > this.saldo) {
            throw new Exception("A conta do "+ this.nome +" não tem saldo suficiente para a transferencia");
        }

        System.out.println(this.nome + " transferiu para " + outraConta.nome + " um valor de R$" + valor);

        this.saldo -= valor;
        outraConta.saldo += valor;
    }

    public void info() {
        System.out.println("|----------------");
        System.out.println(" Nome: " + this.nome);
        System.out.println(" Saldo: R$ " + this.saldo);
        System.out.println("|----------------");
    }
}
