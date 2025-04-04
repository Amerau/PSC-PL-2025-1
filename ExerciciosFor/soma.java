/* EXERCICIO - Somar todos os números de 1 a N
Objetivo: O usuário digita um número N, e o programa soma os valores de 1 até N.
Peça para o usuário inserir um número N.
Use um for para somar de 1 até N.
Exiba cada número na tela.
*/

package ExerciciosFor;
import javax.swing.JOptionPane;

public class soma {

    public static void main(String[] args){
       int soma = 0;
       int entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
       for(int valor = 1; valor <= entrada; valor = valor + 1){
        soma = soma + valor;
        System.out.println(soma);
       }
    }
    
}
