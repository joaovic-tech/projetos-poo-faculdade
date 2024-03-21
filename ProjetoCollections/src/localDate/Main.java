package localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        // Formatando a data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");

        String dataFormatadada = dataAtual.format(formatador);

        System.out.println(dataFormatadada);
    }
}
