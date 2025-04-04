package ExerciciosIf;
import javax.swing.JOptionPane;

public class exemploifencadeado {

    public static void main(String[] args){

        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota da A1: "));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota da A2: "));
        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota da A3: "));
        int media = a1 + a2 + a3;

        if(a1 > 30 || a2 > 30 || a1 < 0 || a2 < 0){
            System.out.println("Insira uma nota de 0 a 30 para A1 e/ou A2.");
        }

        if(a3 > 40 || a3 < 0){
            System.out.println("Insira uma nota de 0 a 40 para A3.");
        }

        if(media > 100 || media < 0){
            System.out.println("Sua média é invalida (?)");
        }

        else if(media >= 70){
            System.out.println("Sua média é " + media + "! Parabéns, você foi aprovado!");
        }

        else if(media >= 60){
            System.out.println("Sua média é " + media + "! Você está de recuperação! :( ");
        }

        else{
            System.out.println("Sua média é " + media + "! Você foi reprovado! ;( ");
        }

    }
    
}
