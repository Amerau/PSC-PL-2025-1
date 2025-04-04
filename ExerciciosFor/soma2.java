/* Não compreendi exatamente o que exatamente o professor havia solicitado em sala de aula, logo executei uma nova possibilidade de soma para o exercício */
 
package ExerciciosFor;
import javax.swing.JOptionPane;

public class soma2 {

    public static void main(String[] args){
       int entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
       for(int valor = 1; valor <= 10; valor = valor + 1){
        System.out.println(valor + entrada);
       }
    }
    
}
