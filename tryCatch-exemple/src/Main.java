public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            System.out.println(numeros[65]);
        } catch (ArrayIndexOutOfBoundsException error) { // irar pegar uma exceção especifica
            System.out.println("Fora do limite!!!");
        } catch (Exception error) { // irar pegar qualquer exceção
            System.out.println("Ocorreu um problema: " + error.getMessage());
        } finally { // Sempre irar executar
            System.out.println("Finalizando programa!");
        }

    }
}
