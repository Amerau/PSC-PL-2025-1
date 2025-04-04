package ExerciciosMatrizes;

public class exception {

    public static void main(String[] args){

        int[] numeros = {1, 2, 3, 4, 5};

        try {

            System.out.println("Valor: " + numeros[5]);

        }
        catch (Exception e) {
            System.out.println("Erro ao selecionar valor inexistente.");
        }
    
    }
    
}
