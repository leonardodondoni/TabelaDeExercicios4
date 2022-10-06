import java.util.Scanner;
public class Exercicio26Lista4 {
    public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    /*
    Faça um programa que leia um valor inteiro e positivo (garanta), verifique
    e escreva se o valor lido é um número primo ou não. Números primos são
    possuem dois divisores: 1 e ele mesmo. Exemplos de números primos: 2,
    3, 5, 7, 11, 13, 17, ... Crie um método para verificar o número lido é primo.
     */

      System.out.println("Informe um número inteiro e positivo: ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("ERRO! Informe um número inteiro e positivo.");
            return;
        }

        int divisores = Operations.divisores(num);

        boolean primo = Operations.primo(divisores);

        System.out.printf("%S",primo);

    }

}
    
