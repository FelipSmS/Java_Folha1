//11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
//ordem crescente. 

import java.util.Scanner;

public class Atv11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = ler.nextInt();

        System.out.println("Informe o terceiro número: ");
        int num3 = ler.nextInt();

        int vetor[] = { num1, num2, num3 };
        int numeroMaior = vetor[0];
        int numeroMenor = vetor[0];
        int numeroMedio = vetor[0];

        for (int i = 0; i < 3; i++) {

            if (vetor[i] >= numeroMaior) {
                numeroMaior = vetor[i];
            }
        }

        for (int i = 0; i < 3; i++) {

            if (vetor[i] <= numeroMenor) {
                numeroMenor = vetor[i];
            }
        }

        for (int i = 0; i < 3; i++) {

            if (vetor[i] != numeroMaior && vetor[i] != numeroMenor) {
                numeroMedio = vetor[i];
            }
        }

        System.out.println("Essa é a ordem: " + numeroMenor + "-" + numeroMedio + "-" + numeroMaior);

        ler.close();
    }

}
