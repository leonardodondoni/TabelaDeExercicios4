import java.util.Scanner;
public class e4_fund_prog {
    public static void main(String args[]){
        /*Faça um programa que leia um valor n qualquer (inteiro e positivo) que corresponde a quantidade de termos.
        O programa deve escrever a soma dos n primeiros termos da série 4/3 + 8/5 + 12/7 + 16/9 + 2+ 20/11 4/13 + 28/15+... .
        A soma deve ser calculada por um método recursivo (5,0). Faça um versão iterativa desse método também(5,0).
        A soma resultante deve ser gerada pelos métodos mas a escrita deste valor deve ser no main.
        Obs: Os métodos pedidos devem estar em um classe diferente da do método main. */

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e positivo que corresponde a quantidade de termos");
        int n = input.nextInt();
        if(n < 1){
            System.out.println("ERRO! Informe um valor válido.");
            return;
        }
        System.out.println(e4_fund_prog_class.iterativeE4(n));
        System.out.println(e4_fund_prog_class.recursiveE4(n));

    }
  
}
   