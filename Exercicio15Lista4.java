import java.util.Scanner;

public class Exercicio15Lista4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        /*
         * Escrever um programa que lê a matrícula, as 3 notas obtidas por um aluno
         * nas 3 vericações e a média dos exercícios que fazem parte da avaliação.
         * Calcular a média de aproveitamento, usando a fórmula:
         * MA =
         * Nota1+Nota2×2+Nota3×3+ME
         * 7
         * A atribuição de conceitos deve obedecer a tabela abaixo:
         * Média de Aproveitamento (MA) Conceito
         * de 9 a 10 A
         * de 7,5 a 8,9 B
         * de 6,0 a 7,4 C
         * de 4,0 a 5,9 D
         * abaixo de 4,0 E
         * O programa deve escrever a matrícula, suas notas, a média dos exercícios,
         * a média de aproveitamento, o conceito correspondente e a mensagem:
         * APROVADO se o conceito for A,B ou C e REPROVADO se o conceito
         * for D ou E. Crie um método para calcular a média de aproveitamento.
         * Implemente também um método para definir o conceito. E ainda construa
         * um método que verifica se o aluno foi aprovado ou não.
         */

        System.out.println("Informe a matrícula do aluno: ");
        int matricula = input.nextInt();
        System.out.println("Informe as 3 notas obtidas nas verificações: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        System.out.println("Informe a média dos exercícios: ");
        double mediaExercicios = input.nextDouble();

        double mediaAproveitamento = mediaAproveitamento(nota1, nota2, nota3, mediaExercicios);
        char notaConceito = conceito(mediaAproveitamento);
        String aprovacao = aprovacao(mediaAproveitamento);

        System.out.printf("Sua matrícula: %d\nSuas notas: %.1f e %.1f e %.1f\nSua média dos exercícios: %.1f\nSua média de aproveitamento: %.1f\nSua nota conceito: %C\nAprovação: %S", matricula, nota1, nota2, nota3, mediaExercicios, mediaAproveitamento, notaConceito, aprovacao);

    }

    public static double mediaAproveitamento(double nota1, double nota2, double nota3, double mediaExercicios) {

        double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7.0;

        return mediaAproveitamento;
    }

    public static char conceito(double mediaAproveitamento) {

        char notaConceito;

        if (mediaAproveitamento < 4.0) {
            notaConceito = 'E';
        } else if (mediaAproveitamento < 6.0) {
            notaConceito = 'D';
        } else if (mediaAproveitamento < 7.5) {
            notaConceito = 'C';
        } else if (mediaAproveitamento < 9.0) {
            notaConceito = 'B';
        } else {
            notaConceito = 'A';
        }
        return notaConceito;
    }

    public static String aprovacao(double mediaAproveitamento) {

        String aprovacao;

        if (mediaAproveitamento >= 6.0) {
            aprovacao = "APROVADO";
        } else {
            aprovacao = "REPROVADO";
        }
        return aprovacao;

    }

}
