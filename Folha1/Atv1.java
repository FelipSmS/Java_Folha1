//1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
//mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
//menor ou igual a 10!”, caso este número seja menor ou igual. 

import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num1 = ler.nextInt();

        if (num1 > 10) {
            System.out.println(num1 + " É maior que 10!");
        } else {
            System.out.println(num1 + " É menor ou igual a 10!");
        }

        ler.close();
    }
}
