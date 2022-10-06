public class Desafio1 {
    public static void main(String args[]) {

        /*
         * Escreva os 100 primeiros números primos no método main,
         * usando o método primo (já implementado) na sua implementação.
         * Um número primo é aquele que só tem 2 divisores: 2, 3, 5, 7, 11, ...
         */
        int cont = 0;
        int value = 1;
        for (int i = 1; i <= value; i++) {
            value++;
            boolean primo = Operations.primo(value);
            
            if (primo == true) {
                System.out.println(value);
                cont++;
            }
            if(cont == 100) break;
                
        }
    }

}
