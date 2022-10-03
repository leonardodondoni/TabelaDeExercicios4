public class Operacoes {
    public static int somatorio(int num) {

        int somatorio = 0;
        for (int i = 1; i <= num; i++) {
            somatorio = somatorio + i;
        }
        return somatorio;
    }

    public static int divisores(int num) {

        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }

        }
        return divisores;
    }

}
