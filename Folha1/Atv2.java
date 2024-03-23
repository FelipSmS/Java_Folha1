//2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
//resultado da sua soma. 

import java.util.Scanner;

public class Atv2 {

    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.println("Informe osegundo número: ");
        int num2 = ler.nextInt();

        System.out.println("O resultado da soma desses dois números é: " + (num1 + num2));

        ler.close();
    }

}
