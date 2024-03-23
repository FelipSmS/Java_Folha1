//9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
//diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
//Caso sejam diferentes, informe que são diferentes e qual número é o maior. 

import java.util.Scanner;

public class Atv9 {

    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int a = ler.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int b = ler.nextInt();

        if (a == b) {
            System.out.println("Esses números são iguais");
        } else {
            System.out.println("Esses números são diferentes");
        }

        ler.close();
    }
}
