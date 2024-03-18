//8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este
//número seja maior ou igual a 50, outra se ele for menor que 50. 

import java.util.Scanner;

public class Atv8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num1 = ler.nextInt();

        if (num1 > 50) {
            System.out.println(num1 + " É maior que 50!");
        } else if (num1 < 50) {
            System.out.println(num1 + " É menor ou igual a 50!");
        }

        ler.close();
    }
}
