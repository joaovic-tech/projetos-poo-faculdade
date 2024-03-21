package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String palavra;
        ArrayList<String> palavras = new ArrayList<String>();
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Digite algumas palavras e para sair digite 0:");
        palavra = inputValue.next();

        while (!palavra.equals("0")) {
            palavras.add(palavra);
            palavra = inputValue.next();
        }

        /*
         
        for (int i = palavras.size() - 1; i >= 0; i--) {
            System.out.println(palavras.get(i));
        }
         
        */
        
        // Deixando na orgem reversa (Mudando o valor do array)
        Collections.reverse(palavras);
       
        System.out.println(palavras);
        
        inputValue.close();
    }

}

