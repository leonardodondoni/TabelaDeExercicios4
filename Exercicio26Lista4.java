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

        int divisores = divisores(num);

        String primo = primo(divisores);

        System.out.printf("%S",primo);

    }

    public static int divisores(int num) {

        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }

        }
        return divisores;
    }

    public static String primo(int divisores){

        String primo;

        if(divisores == 2){
            primo = "Primo";
        }
        else{
            primo = "Não é primo";
        }
        return primo;
    }

}
    
