
public class Main {

    public static void main(String[] args){

        pessoa individuo1 = new pessoa();
        pessoa individuo2 = new pessoa();
        individuo1.nome = "Guilherme";
        individuo1.setPeso(105);
        individuo2.nome = "Matheus";
        individuo2.setPeso(65);
        

        System.out.println("Nome: " + individuo1.nome + " | Peso: " + individuo1.getPeso() );
        System.out.println("Nome: " + individuo2.nome + " | Peso: " + individuo2.getPeso() );

    }
    
}
