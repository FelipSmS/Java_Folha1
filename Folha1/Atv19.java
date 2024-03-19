import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double raio = ler.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double altura = ler.nextDouble();

        double volume = 3.14 * raio * raio * altura;

        System.out.println("Volume do cilindro: " + volume);

        ler.close();
    }
}
