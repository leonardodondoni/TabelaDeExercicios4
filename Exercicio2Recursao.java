import java.util.Scanner;
public class Exercicio2Recursao {
   
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        /*Faça um programa que leia um valor inteiro e não negativo (garanta isso),    
        calcula e escreve o somatório desse valor. Para calcular o somatório use um método recursivo.
         */

        System.out.println("Informe um valor inteiro e positivo: ");
        int num = input.nextInt();

        if(num < 1){
            System.out.println("ERRO! Informe um valor inteiro e positivo.");
            return;
        }

        System.out.println("Somatório: " + Operations.somatorioR(num));

    }
 
}