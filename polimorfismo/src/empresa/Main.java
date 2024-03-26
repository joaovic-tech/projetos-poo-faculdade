package empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarios[] = {
                new Assalariado("Joãozin", 1600),
                new Horista("Mario", 100, 40.5f),
                new Comissionado("Luigi", 50000, 0.05f)
        };

        Funcionario funcionario;
        float tatalPagamento = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            funcionario = funcionarios[i];
            System.out.println("--------------------------------------");
            System.out.println("Funcionário: " + funcionario.nome);
            System.out.println("Salário: " + funcionario.pagamento());
            System.out.println("--------------------------------------");

            tatalPagamento += funcionario.pagamento();
        }

        System.out.println("Total de pagamentos de todos os funcionários: R$ " + tatalPagamento);
    }
}
