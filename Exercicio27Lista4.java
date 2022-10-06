import java.util.Scanner;
public class Exercicio27Lista4 {
    public static void main(String args[]){
        /*
        Crie um programa que leia um valor inteiro e positivo (garanta), verifique
        e escreva se o valor lido é um número perfeito ou não. Números perfeitos
        são aqueles cuja soma dos seus divisores (excluindo o próprio número como
        divisor) corresponde ao próprio número. Exemplo de números perfeitos:
        6, 28, ... Por exemplo, o número 6 possui os divisores 1, 2 e 3, os quais
        somados 1 + 2 + 3 = 6. Crie um método para verificar o número lido é
        perfeito.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro e positivo: ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("ERRO! Informe um número inteiro e positivo.");
            return;
        }

        boolean perfectNumber = Operations.perfectNumberChecker(num);
        
        if(perfectNumber == true){
            System.out.print("Número perfeito");
        }
        if(perfectNumber == false){
            System.out.print("Número imperfeito");
        }
    }

}
