//15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,
//y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz
//(((x2 - x1)2
//) + ((y2 - y1)2
//)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite as coordenadas do ponto P1 (x1 y1): ");
        double x1 = ler.nextDouble();
        double y1 = ler.nextDouble();

        System.out.print("Digite as coordenadas do ponto P2 (x2 y2): ");
        double x2 = ler.nextDouble();
        double y2 = ler.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distância entre os pontos: %.2f\n", distancia);

        ler.close();
    }
}