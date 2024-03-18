//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
//Fahrenheit. A fórmula de conversão é:
//F = (9 * C + 160) / 5

import java.util.Scanner;

public class Atv6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a temperatura em celsius: ");
        double celsius = ler.nextDouble();

        System.out.println("A temperatura em C° é: " + ((9 * celsius + 160) / 5));

        ler.close();
    }

}
