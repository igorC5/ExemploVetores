import java.util.Scanner;

public class Alternativa5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] vetor = new String[3];

        for( int i = 0; i < vetor.length; i++ ){
            System.out.println("Digite o nome para a posição " + i + " do vetor");
            vetor[i] = input.nextLine();
        }

        System.out.println("Vetor completo: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
