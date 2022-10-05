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
    public static boolean divisoresTela(int num) {


        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);      
          }

        }
    
    }
    public static int primo(int divisores){

        boolean primo;

        if(divisores == 2){
            primo = true;
        }
        else{
            primo = false;
        }
        return primo;
    }
    public static double exercise42(int num){

        double S = 0, totalS = 0;;

        for (int i = 1; i <= num; i++){
            S = 1.0/i;
            totalS = totalS + S;
        }
        return totalS;
    }
    public static String reverse(String exercicio){

        int length = exercicio.length();

        String reverse = "";
        for (int i = length - 1 ; i >= 0 ; i--)
          reverse = reverse + exercicio.charAt(i);
        return reverse;
    }
}
