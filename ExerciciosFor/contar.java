/* EXERCICIO - Contar de 1 a N
Objetivo: O usuário digita um número N, e o programa conta de 1 até N.
Peça para o usuário inserir um número N.
Use um for para contar de 1 até N.
Exiba cada número na tela.
*/

package ExerciciosFor;
import javax.swing.JOptionPane;

public class contar {

    public static void main(String[] args){

        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));

        for(int contagem = 1; contagem <= entrada; contagem = contagem + 1){
            System.out.println(contagem);
        }
    }
    
}
