package ExerciciosMatrizes;
import java.util.Scanner;

public class matrizesloop {

    public static void main(String[] args){

        double valores[] = new double[5];       
        double soma = 0.0, media = 0.0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira as pontuações de 5 estudantes");
        for(int i = 0; i < valores.length; i = i + 1){
            System.out.println("Digite a " + (i + 1) + "nota.");
            valores[i] = teclado.nextInt();
        }
        for(int i = 0; i < valores.length; i = i + 1){
            System.out.println(valores[i]);
        }
        for(int i = 0; i < valores.length; i = i + 1){
            soma = soma + valores[i];
            media = soma / 5;
        }

        System.out.println("A pontuação média da classe é: " + media);
    }
    
}
