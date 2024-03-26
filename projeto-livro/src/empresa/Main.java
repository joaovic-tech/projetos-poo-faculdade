package empresa;

public class Main {

    public static void main(String[] args) {

        LivroDigital livroA = new LivroDigital(
                "Senhor dos Aneis",
                new Autor("Tolkien", "Britanico", "tolkien@email.com"),
                "Aventura",
                5,
                10000,
                3500
        );

        LivroFisico livroB = new LivroFisico(
                "Harry Potter",
                new Autor("J.K. Rowling", "Britânica", "jkrowling@email.com"),
                "Fantasia",
                4,
                8000,
                2500
        );

        livroA.info();
        livroB.info();

    }
}
