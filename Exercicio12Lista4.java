import java.util.Scanner;

public class Exercicio12Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Um usuário deseja um programa onde possa informar 3 notas e ainda
         * escolher o tipo de média que deve aplicada aos valores lidos.Implemente
         * esse programa considerando o menu de opções abaixo. O cálculo de cada
         * média deve ser feito por um método.
         * 1 - Aritmética
         * 2 - Ponderada ( Pesos: 3,3,4)
         * 3 - Harmônica
         */

        System.out.println("Informe 3 notas: ");
        double nota1 = input.nextInt();
        if (nota1 < 0) {
            System.out.println("Nota inválida");
            return;
        }
        double nota2 = input.nextInt();
        if (nota2 < 0) {
            System.out.println("Nota inválida");
        }
        double nota3 = input.nextInt();
        if (nota3 < 0) {
            System.out.println("Nota inválida");
        }

        System.out.printf(
                "Informe o tipo de média desejado para as notas\n1 - Aritmética \n2 - Ponderada ( Pesos: 3,3,4) \n3 - Harmônica\n");
        int metodo = input.nextInt();
        if (metodo < 1 || metodo > 3) {
            System.out.println("Informe um tipo de média válido");
        }

        double media = Operations.media(nota1, nota2, nota3, metodo);

        System.out.println("Baseado na sua escolha, a Média é: " + media);
        

    }

}
