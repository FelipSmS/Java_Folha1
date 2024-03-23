//16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
//aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

import java.util.Scanner;

public class Atv16 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = ler.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3);

        System.out.printf("A média do aluno é: " + media);

        ler.close();
    }
}
