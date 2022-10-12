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

        System.out.println(iterativeE4(n));

    }
    public static double iterativeE4(int n){
        double plus2 = 3, plus4 = 4, term = 0, totalTerm = 0;
        if(n < 2) return 4.0/3;
        for(int i = 1; i <= n; i ++){
            plus2 = plus2 + 2.0;
            plus4 = plus4 + 4.0;
            term = plus4 / plus2;
            totalTerm = totalTerm + term;
        }
       
        return totalTerm;
    }
    public static double recursiveE4(int n){
        if(n < 2) return 4.0/3;
        return recursiveE4(n - 1) + ((n + 4.0) / (n + 2.0));
       
    }
}
   