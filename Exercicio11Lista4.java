import java.util.Scanner;

public class Exercicio11Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Um banco concederá um crédito especial aos seus clientes, variável com
         * o saldo médio no último ano. Faça um programa que leia o saldo médio
         * de um cliente e calcule o valor do crédito de acordo com a tabela abaixo.
         * Mostre uma mensagem informando o saldo médio e o valor do crédito.
         * Implemente um método para calcular o valor do crédito.
         * saldo médio crédito
         * R$ 0 a 500,00 nenhum crédito
         * acima de R$ 500,00 a 1500,00 10%
         * acima de R$ 1500,00 a 2500,00 15%
         * acima de R$ 2500,00 a 4000,00 20%
         * acima de R$ 4000,00 25%
         * 
         */

        System.out.println("Saldo médio do cliente para calcular o valor de crédito disponível: ");
        double saldoMedio = input.nextInt();

        double credito = credito(saldoMedio);

        System.out.println("Crédito disponível: " + credito);

    }

    public static double credito(double saldoMedio) {

        double credito = 0;

        if (saldoMedio < 501) {
            credito = 0;
        } else if (saldoMedio < 1501) {
            credito = (saldoMedio * 10) / 100.0;
        } else if (saldoMedio < 2501) {
            credito = (saldoMedio * 15) / 100.0;
        } else if (saldoMedio < 4001) {
            credito = (saldoMedio * 20) / 100.0;
        } else {
            credito = (saldoMedio * 25) / 100.0;
        }

        return credito;

    }

}
