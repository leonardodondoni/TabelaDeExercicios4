import java.util.Scanner;

public class Exercicio4Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Crie um programa que lê o tempo atual em hora, minuto e segundo, e o escreve em segundos
         * quanto tempo se passou desde que o dia começou. Essa conversão deve ser calculada por um
         * método.
         */

        System.out.println("Informe as horas: ");
        int horas = input.nextInt();
        if (horas < 0 || horas > 24) {
            System.out.println("Erro, informe uma horá válida.");
            return;
        }
        System.out.println("Informe os minutos: ");
        int minutos = input.nextInt();
        if (minutos < 0 || minutos > 60) {
            System.out.println("Erro, informe um minuto válido.");
            return;
        }
        System.out.println("Informe os segundos: ");
        int segundos = input.nextInt();
        if (segundos < 0 || segundos > 60) {
            System.out.println("Erro, informe segundos válidos.");
            return;
        }

        System.out.println("Segundos: " +Operations.segundos(horas,minutos,segundos));
    }

}

