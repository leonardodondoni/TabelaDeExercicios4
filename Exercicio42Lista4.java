import java.util.Scanner;
public class Exercicio42Lista4 {
    public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    /*
    Escreva um programa que lê um valor n inteiro e positivo, calcula e exibe
a seguinte soma: S = 1 + 1
2 +
1
3
... +
1
n
. O cálculo de S deve ser feito por
meio de um método.
    */
    System.out.println("Informe um número inteiro e positivo: ");
    int num = input.nextInt();
    if (num < 1){
        System.out.println("ERRO! Informe um número inteiro e positivo.");
        return;
    }

    double totalS = metodo(num);
    System.out.println(totalS);

    }
    public static double metodo(int num){

        double S = 0, totalS = 0;;

        for (int i = 1; i <= num; i++){
            S = 1.0/i;
            totalS = totalS + S;
        }
        return totalS;
    }
    
}
