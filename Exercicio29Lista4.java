import java.util.Scanner;

public class Exercicio29Lista4 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        /*
        Implemente um programa que leia dois valores inteiros e positivos: a e b.
        A seguir, construa um método que recebe esses valores como parâmetros,
        devolve a quantidade de valores primos existentes no intervalo [a; b]. O
        programa deve escrever a quantidade encontrada.
         */
        System.out.println("Informe dois valores inteiros e positivos: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n1 < 1 || n2 < 1){
            System.out.println("ERRO! Informe um valor inteiro e positivo: ");
        }
        
        int menor = n2;
        int maior = n1;
        if(n2 > maior){
            maior = n2;
            menor = n1;
        }

        int intervalosPrimo = Operations.primosIntervalo(maior, menor);

        System.out.println(intervalosPrimo);
      
        
        }
    
}    




