package ExerciciosMatrizes;

public class foreach {

    public static void main(String[] args) {

        String[] nomes = {"Matheus", "Guilherme", "Rafael", "Édipo", "João"};
        int[] idades = {21, 23, 24, 35, 22};

        for(String nome: nomes){

            System.out.println("Nome: " + nome + ".");
        }

        for(int idade: idades){

            System.out.println("Idade " + idade + " anos.");
        }
    }
    
}
