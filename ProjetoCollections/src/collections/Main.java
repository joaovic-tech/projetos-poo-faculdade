package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<String>();

        // Adicionado pessoas na lista
        pessoas.add("Mario");
        pessoas.add("Luigi");
        pessoas.add("Yoshi");
        pessoas.add("Toad");
        pessoas.add("Peach");

        // Imprime a pessoas na ordem original
        System.out.println(pessoas + " - original");

        // Colocar a pessoas em ordem aleatória
        Collections.shuffle(pessoas);
        System.out.println(pessoas + " - aleatória");

        // Colocar a pessoas em ordem alfabética
        Collections.sort(pessoas);
        System.out.println(pessoas + " - alfabética");

        // Inverte a ordem anterior a pessoas
        Collections.reverse(pessoas);
        System.out.println(pessoas + " - reverso");

        // Maior elemento alfabético
        System.out.println("Maior: " + Collections.max(pessoas));

        // Menor elemento alfabético
        System.out.println("Maior: " + Collections.min(pessoas));
    }
}