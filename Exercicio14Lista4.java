import java.util.Scanner;

public class Exercicio14Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Escrever um programa que lê a hora de início e hora de término de um jogo,
         * ambas subdivididas em dois valores distintos : horas e minutos. Calcular e
         * escrever a duração do jogo, também em horas e minutos, considerando
         * que o tempo máximo de duração de um jogo é de 24 horas e que o jogo
         * pode iniciar em um dia e terminar no dia seguinte. A duração deve ser
         * calculada por um método
         */

        System.out.println("Informe as horas e minutos de início do jogo: ");
        int horasInicio = input.nextInt();
        if (horasInicio < 0 || horasInicio > 24) {
            System.out.println("Informe um horário de início do jogo válido em horas");
            return;
        }
        int minutosInicio = input.nextInt();
        if (minutosInicio < 0 || minutosInicio > 59) {
            System.out.println("Informe um horário de início do jogo válido em minutos");
            return;
        }
        System.out.println("Informe as horas e minutos do término do jogo: ");
        int horasTermino = input.nextInt();
        if (horasTermino < 0 || horasTermino > 24) {
            System.out.println("Informe um horário de término do jogo válido em horas");
            return;
        }
        int minutosTermino = input.nextInt();
        if (minutosTermino < 0 || minutosTermino > 59) {
            System.out.println("Informe um horário de término do jogo válido em minutos");
            return;
        }

        int horaroInicialEmMinutos = (horasInicio * 60) + minutosInicio;

        int horarioFinalEmMinutos = (horasTermino * 60) + minutosTermino;

        int duracaoTotal = Operations.duracao(horaroInicialEmMinutos, horarioFinalEmMinutos);

        System.out.printf("Duração total do jogo: %d horas e %d minutos", duracaoTotal/60, duracaoTotal%60);

    }
    
}
