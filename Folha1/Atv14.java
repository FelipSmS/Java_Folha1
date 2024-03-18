// 14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
// Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo
// termo),
// r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um
// algoritmo
// que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10,
// n =
// 7, r = 3. Resultado: an = 28

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro termo (a1): ");
        int a1 = ler.nextInt();

        System.out.print("Digite o valor da razão (r): ");
        int r = ler.nextInt();

        System.out.print("Digite a ordem do termo desejado (n): ");
        int n = ler.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "º termo da progressão aritmética é: " + an);

        ler.close();
    }
}
