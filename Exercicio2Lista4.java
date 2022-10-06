import java.util.Scanner;

public class Exercicio2Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Faça um programa que leia 3 valores e determine o maior deles. Use um
         * método para encontrar o maior valor.
         */

        double num1, num2, num3;

        System.out.println("Informe 3 valores, o programa informará o maior deles.");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        System.out.print("Maior: " + Operations.maior(num1, num2, num3));
    }

}