public class Desafio2 {
    public static void main(String args[]){
        
        /*
         Faça um programa que gera e escreve os 4 primeiros números perfeitos, 
         use em sua codificação o método perfeito (já implementado). 
         Um número perfeito é aquele que é igual a soma dos seus divisores, excluindo a si próprio como divisor. 
         (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).
         */

        int cont = 0;
        int value = 1;
        for (int i = 1; i <= value; i++) {
            value++;
            boolean perfectNumber = Operations.perfectNumberChecker(value);
            
            if (perfectNumber == true) {
                System.out.println(value);
                cont++;
            }
            if(cont == 4) break;
                
        }
    }
    
}
