/* EXERCICIO - Tabauada de 1 a 10 de um valor N.
Objetivo: O usuário digita um número N, e o programa conta a tabuada de 1 até 10 de um valor N.
Peça para o usuário inserir um número N.
Use um for para contar a tabuada de 1 até 10 do valor N.
Exiba cada número na tela.
*/

package ExerciciosFor;
import javax.swing.JOptionPane;

public class tabuada {

    public static void main(String[] args){

        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));

        for(int contagem = 1; contagem <= 10; contagem = contagem + 1){
            System.out.println(contagem * entrada);
        }
    }
    
}