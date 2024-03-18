//3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
//variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
//ao usuário que a sequência de números informados é inválida. 

import java.util.Scanner;

public class Atv3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int a = ler.nextInt();

        System.out.println("Informe o segundo número: ");
        int b = ler.nextInt();

        if (a == b) {
            System.out.println("Sequência inválida");
        } else if (a > b) {
            System.out.println("O número A é maior que o B");
        } else if (b > a) {
            System.out.println("O número B é maior que o A");
        }

        ler.close();
    }

}