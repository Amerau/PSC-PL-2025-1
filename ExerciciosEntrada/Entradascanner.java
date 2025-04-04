package ExerciciosEntrada;

import java.util.Scanner;

public class Entradascanner {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    scanner.close();
    System.out.println("Olá " + nome + "! Você possui " + idade + " anos de idade?");

    }
    
}
