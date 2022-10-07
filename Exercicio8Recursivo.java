import java.util.Scanner;

public class Exercicio8Recursivo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        /*
         * Faça um programa que leia dois valores x e y quaisquer (inteiros e
         * positivos).
         * O programa deve escrever o valor de xy.
         * O valor de xy deve ser encontrado a partir de um método recursivo. Não use
         * Math.pow.
         */

        System.out.println("Informe dois valores, x e y, inteiros e positivos: ");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x < 1 || y < 1) {
            System.out.println("ERRO! Número negativo informado.");
            return;
        }
        System.out.print(Operations.power(x , y));
    }
}