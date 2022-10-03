import java.util.Scanner;

public class Exercicio1Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Informe três valores, o programa calculará a média aritmética dos 3: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        System.out.println("Média aritmética dos valores: " + media(num1, num2, num3));

    }

    public static double media(double v1, double v2, double v3) {

        double m;
        m = (v1 + v2 + v3) / 3.0;
        return m;
    }

}
