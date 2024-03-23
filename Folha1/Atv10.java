//10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
//o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
//inválido!”. 

import java.util.Scanner;

public class Atv10 {

    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int a = ler.nextInt();

        switch (a) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;

            default:
                System.out.println("Número Inválido");
        }

        ler.close();
    }
}
