package empresa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int peso;
        double altura;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" --------------------------------------");
        System.out.println("(          Calculadora de IMC          )");
        System.out.println(" --------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        
        System.out.print("Disite seu peso: ");
        peso = teclado.nextInt();
        
        System.out.print("Disite a sua altura: ");
        altura = teclado.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("\n(          Com base no seu IMC de %.2f\n          ", imc);

        if (imc <= 18.5) {
            System.out.println("(          Sua Classificação é de Magreza          ");
        } else if (imc >= 18.5 && imc <= 24.9) ;{
            System.out.println("(          Sua Classificação Está Dentro do Normal          ");
        } if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("(          Sua Classificação é de Sobrepeso I          ");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("(          Sua Classificação é Obesidade II          ");
        } else if (imc >= 40.0) {
            System.out.println("(          Sua Classificação é Obesidade Grave III          ");
        }
    }
}
