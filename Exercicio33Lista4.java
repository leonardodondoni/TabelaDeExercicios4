import java.util.Scanner;
public class Exercicio33Lista4 {
    public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    /*
    Faça um programa que leia uma string e a escreva sem as vogais. Crie um
    método que recebe a string como parâmetro e a devolve sem as vogais.
    */

    System.out.println("Escreva uma string: ");
    String exercicio = input.nextLine();

    String semVogais = semVogais(exercicio);

    System.out.println(semVogais);
    

    }

    public static String semVogais(String exercicio){

        String semVogais = exercicio.replaceAll("[aeiouAEIOU]", "");
        return semVogais;
    }
    
}
