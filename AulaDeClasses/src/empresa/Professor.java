package empresa;

public class Professor {
    int cadastro;
    String nome;
    String formacao;

    Professor(int cadastro, String nome, String formacao) {
        this.cadastro = cadastro;
        this.nome = nome;
        this.formacao = formacao;
    }

    void info() {
        System.out.println("Cadastro: " + cadastro);
        System.out.println("Nome: " + nome);
        System.out.println("Formação: " + formacao);
    }

}
