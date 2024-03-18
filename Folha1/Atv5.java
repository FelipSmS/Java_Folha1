//5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
//da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
//valor da variável A. Apresentar uma mensagem com o valor original de cada variável
//e outra com os valores trocados. 

import java.util.Scanner;

public class Atv5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = ler.nextInt();

        System.out.println("Valor original do número 1: " + num1);
        System.out.println("Valor original do número 2: " + num2);

        int coringa = num1;

        num1 = num2;
        num2 = coringa;

        System.out.println("Valor trocado do número 1: " + num1);
        System.out.println("Valor original do número 2: " + num2);

        ler.close();
    }

}
