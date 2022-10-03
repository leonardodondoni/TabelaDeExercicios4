import java.util.Scanner;

public class Exercicio24Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Faça um programa que leia um valor inteiro e positivo(garanta isso), calcule
         * e escreva os divisores desse valor na tela.
         */

        System.out.println("Informe um número inteiro e positivo: ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("ERRO! Informe um número inteiro e positivo.");
            return;
        }

        Operacoes.divisoresTela(num);
    }

}
