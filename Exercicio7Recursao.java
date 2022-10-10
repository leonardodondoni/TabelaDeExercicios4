import java.util.Scanner;
public class Exercicio7Recursao {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro e positivo: ");
        int num = input.nextInt();
        if(num < 1){
            System.out.println("ERRO! Informe um valor inteiro e positivo.");
            return;
        }
        System.out.print(exercise7R(num));

    }
    public static double exercise7R(double num){
        if(num == 1) return 1;
        return exercise7R(num - 1) + 1.0 / num;
    }
}
