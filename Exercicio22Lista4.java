import java.util.Scanner;
public class Exercicio22Lista4 {
    public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    /*
     *  Faça um programa que leia um valor inteiro e positivo (garanta isso),
    calcule e escreva o seu somatório. O cálculo do somatório deve ser feito
    por meio de um método.
    */

    System.out.println("Informe um valor inteiro e positivo: ");
    int num = input.nextInt();
    if (num < 1){
        System.out.println("ERRO! Informe um valor inteiro e positivo.");
        return;
    }

    int somatorio = somatorio(num);

    System.out.println("Somatório do valor: " + somatorio);

    

    }
    public static int somatorio(int num){

        int somatorio = 0;
        for(int i = 1;i <= num; i++){
            somatorio = somatorio + i;
        }
        return somatorio;
    }
    
}
