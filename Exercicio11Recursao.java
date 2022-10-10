import java.util.Scanner;
public class Exercicio11Recursao {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        /*Escreva um programa que lê um valor n inteiro e positivo, calcula e exibe a seguinte soma:
        S = 1 + 2/3 + 3/5 ... O cálculo de S deve ser feito por meio de um método recursivo. */

        System.out.println("Informe um valor inteiro e positivo:");
        int num = input.nextInt();

        if(num < 1){
            System.out.println("ERRO! Informe um valor inteiro e positivo.");
            return;
        }

        System.out.println("Calculo S: " + Operations.calculoSRecursivo(num));

    }
   
}
