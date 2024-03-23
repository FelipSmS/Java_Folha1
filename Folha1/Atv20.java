import java.util.Scanner;

public class Atv20 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagemHoras = ler.nextDouble();

        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMediaKmPorHora = ler.nextDouble();

        double consumoPorLitro = 12; // km por litro
        double distancia = tempoViagemHoras * velocidadeMediaKmPorHora;
        double quantidadeLitros = distancia / consumoPorLitro;

        System.out.println("Quantidade de litros de combustível gasta: " + quantidadeLitros);

        ler.close();
    }
}
