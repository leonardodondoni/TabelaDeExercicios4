import java.util.Scanner;
public class Exercicio7Recursao {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        /*Faça um programa que leia um valor n qualquer (inteiro e positivo). 
        O programa deve escrever o n-ésimo termo da série de Fibonacci. 
        Os termos desse série são 1,1,2,3,5,8,13,21,... O n-ésimo termo deve ser calculado por um método recursivo.
        */

        System.out.println("Informe um valor inteiro e positivo: ");
        int num = input.nextInt();

        if(num < 1){
            System.out.println("ERRO! Informe um valor inteiro e positivo.");
            return;
        }

        System.out.print(Operations.fibonacci(num));
    }
    
}
