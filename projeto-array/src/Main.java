public class Main {
    public static void main(String[] args) {
        int tam = -10;

        try {
            int vetor[] = instaciaArray(tam);

            for (int i = 0; i < tam; i++) {
                System.out.println(vetor[i]);
            }
        } catch (NegativeArraySizeException error) {
            System.out.println("O tamanho do vetor não pode ser (" + error.getMessage() + ") pois é um valor negativo");
        } catch (Exception error) {
            System.out.println("Ocorreu outro problema: " + error.getMessage());
        }
    }

    private static int[] instaciaArray(int n) {
        return new int[n];
    }
}
