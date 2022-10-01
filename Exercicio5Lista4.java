import java.util.Scanner;

public class Exercicio5Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Faça um programa que leia as coordenadas de 2 pontos no plano (x1, y1) e
         * (x2, y2). A seguir, o programa deve calcular e escrever a distância
         * euclidiana e também a distância de Manhattan entre esses pontos. Para isso,
         * defina um método que calcula a distância euclidiana usando a fórmula:
         * distanciae =
         * p
         * (x1 − x2)
         * 2 + (y1 − y2)
         * 2. Defina também um método que
         * calcula a distância de Manhattan pela fórmula: distanciam = |x1 − x2| +
         * |y1 − y2|.
         */

        System.out.println("Informe as coordenadas do ponto x1 no plano (x1,y1): ");
        double x1 = input.nextDouble();
        System.out.println("Informe as coordenadas do ponto y1 no plano (x1,y1): ");
        double y1 = input.nextDouble();
        System.out.println("Informe as coordenadas do ponto x1 no plano (x2,y2): ");
        double x2 = input.nextDouble();
        System.out.println("Informe as coordenadas do ponto x1 no plano (x2,y2): ");
        double y2 = input.nextDouble();

        double distEuc = distanciaEuclidiana(x1, y1, x2, y2);
        double distMan = distanciaManhattan(x1, y1, x2, y2);

        System.out.println("Distância Euclidiana: " + distEuc);
        System.out.println("Distância Manhattan: " + distMan)

    }

    public static double distanciaEuclidiana(double x1, double y1, double x2, double y2) {

        double distanciaEuclidiana = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distanciaEuclidiana;
    }

    public static double distanciaManhattan(double x1, double y1, double x2, double y2) {

        double distanciaManhattan = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distanciaManhattan;
    }
}
