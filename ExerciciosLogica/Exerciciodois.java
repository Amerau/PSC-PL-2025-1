package ExerciciosLogica;


public class Exerciciodois{


    public void main(String[] args){
        consumoMedio();
    }   

    public static void consumoMedio(){

        double distancia = 10;
        double consumo = 2;
        double consumoMedio = distancia / consumo;
        System.out.println("O consumo médio é : " + consumoMedio + " km/L");

    }
}
