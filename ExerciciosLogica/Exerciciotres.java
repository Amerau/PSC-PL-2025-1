package ExerciciosLogica;

public class Exerciciotres{


    public static void main(String[] args){
        notasMedia();
        
    }

    public static void notasMedia(){
        double nota1 = 15;    
        double nota2 = 8;       
        double nota3 = 5;
        double media = (nota1 + nota2+ nota3) / 3;
            if(nota1 > 10 || nota2 > 10 || nota3 > 10){
                System.out.println("Insira uma nota menor ou igual a 10.");
            }
            else if( media >= 9 && media <= 10){
                System.out.println("Sua média é " + media + ", conceito A.");
            }
            else if(media >=7.5 && media < 9){
                System.out.println("Sua média é " + media + ", conceito B.");
            }
            else if(media >= 6 && media < 7.5){
                System.out.println("Sua média é " + media + ", conceito C.");
            }
            else if(media >= 4 && media < 6){
                System.out.println("Sua média é " + media + ", conceito D.");
            }
            else{
                System.out.println("Sua média é " + media + ", conceito E.");
            }
    }

}