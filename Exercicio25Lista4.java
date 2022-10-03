import java.util.Scanner;

public class Exercicio25Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa semelhante ao 24, ele também deve ler um valor
         * inteiro e positivo (garanta isso), mas calcular e devolver a quantidade de
         * divisores desse valor. A contagem dos divisores deve ser feita por um
         * método.
         */

        System.out.println("Informe um número inteiro e positivo: ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("ERRO! Informe um número inteiro e positivo.");
            return;
        }

        int divisores = Operacoes.divisores(num);

        System.out.println("Quantidade de divisores: " + divisores);

    }

}
