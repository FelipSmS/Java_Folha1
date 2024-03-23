//13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
//operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
//de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
//mensagem de operador não definido. Tratar erro de divisão por zero.

import java.util.Scanner;

public class Atv13 {
    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num1 = ler.nextInt();

        System.out.println("Informe um segundo número inteiro: ");
        int num2 = ler.nextInt();

        System.out.println("Informe o operador da operação que deseja realizar (+, -, *, /): ");
        char operador = ler.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Soma: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Soma: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Soma: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Soma: " + (num1 / num2));
                break;
            default:
                System.out.println("Operador inválido");
        }

    }
}
