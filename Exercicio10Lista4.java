import java.util.Scanner;

public class Exercicio10Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Faça um programa que leia a altura e o sexo de uma pessoa (1 para
         * masculino e 2 para feminino), calcule e escreva o seu peso ideal, utilizando
         * as fórmulas abaixo. Implemente um método para calcular o peso ideal.
         * • para homens: (72.7 × altura) − 58
         * • para mulheres: (62.1 × altura) − 44.7
         */

        System.out.println("Informe a altura de uma pessoa (em cm): ");
        int altura = input.nextInt();

        if (altura < 0 || altura > 250){
        System.out.println("Informe uma altura válida");
        return;
        }

        System.out.println("Informe o sexo da pessoa(1 para masculino e 2 para feminino): ");
        int sexo = input.nextInt();

        if (sexo < 1 || sexo >2){
            System.out.println("Informe o sexo corretamente, utilizando 1 para masculino e 2 para feminino");
            return;
        }

        double alturaDouble = altura / 100.0;

        
        System.out.println("Peso ideal: " + Operations.pesoIdeal(alturaDouble, sexo));
        

    }
   

}
