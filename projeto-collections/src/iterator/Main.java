package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        int soma;

        lista.add(55);
        lista.add(105);
        lista.add(654);
        lista.add(898);
        lista.add(9000);


        Iterator it = lista.iterator();

        soma = 1;

        while (it.hasNext()) {
            // Somando o valor
            System.out.println(soma);
            soma += (int)it.next();
        }

        System.out.println(lista);
    }
}
