import java.util.Scanner;
public class Exercicio34Lista4 {
    public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    /*
    Faça um programa que leia uma string e a escreva na ordem inversa. Crie
    um método que recebe a string como parâmetro e a devolve invertida.
    */

    System.out.println("Escreva uma string: ");
    String exercicio = input.nextLine();
    String reverso = reverse(exercicio);

    System.out.println(reverso);
    
    }

    public static String reverse(String exercicio){

        int length = exercicio.length();

        String reverse = "";
        for (int i = length - 1 ; i >= 0 ; i--)
          reverse = reverse + exercicio.charAt(i);
        return reverse;
    }
    
}
