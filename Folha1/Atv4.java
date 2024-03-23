//4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
//multiplicação e a divisão dos números lidos. 

import java.util.Scanner;

public class Atv4 {

    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = ler.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma desses dois números é: " + soma);
        System.out.println("A subtracao desses dois números é: " + subtracao);
        System.out.println("A multiplicação desses dois números é: " + multiplicacao);
        System.out.println("A divisão desses dois números é: " + divisao);

        ler.close();
    }

}
