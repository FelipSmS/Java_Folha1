//7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
//este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
//o usuário também deverá ser informado. 

import java.util.Scanner;

public class Atv7 {

    public void ExecutarPrograma() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int a = ler.nextInt();

        if (a >= 100 && a <= 200) {
            System.out.println("Este número está no intervalo de 100 a 200");
        } else {
            System.out.println("Este número não está no intervalo de 100 a 200");
        }

        ler.close();
    }
}
