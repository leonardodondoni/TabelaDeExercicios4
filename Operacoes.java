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
    public static void divisoresTela(int num) {


        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);      
          }

        }
    
    }
    public static boolean primo(int divisores){

        boolean primo;

        if(divisores == 2){
            primo = true;
        }
        else{
            primo = false;
        }
        return primo;
    }
}
