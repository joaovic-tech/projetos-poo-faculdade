package empresa;

public class Main {

    public static void main(String[] args) {

        LivroDigital ld = new LivroDigital("Senhor dos Aneis",
                new Autor("Tolkien","Britanico","tolkien@email.com"),
                "Aventura",
                5,
                10000,
                3500);
        ld.info();
    }
}
