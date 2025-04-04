/* Desenvolver um programa que solicite um número ao usuário, e então seja capaz de informar ao usuário se o número inserido é positivo ou negativo. */

package ExerciciosIf;
import javax.swing.JOptionPane;
public class exemploif {

    public static void main(String[] args){

        double entrada = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));
        if(entrada < 0){

            System.out.println("Seu número é negativo.");
        }
        else{

            System.out.println("Seu número é positivo.");
        }
    }
    
}
