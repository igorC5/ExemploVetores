import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] vetor = new String[3];

        System.out.println("Insira o primeiro nome: ");
        vetor[0] = input.nextLine();

        System.out.println("Insira o segundo nome: ");
        vetor[1] = input.nextLine();

        System.out.println("Insira o terceiro nome: ");
        vetor[2] = input.nextLine();

        System.out.println("Primeiro nome: " + vetor[0]);
        System.out.println("Segundo nome: " + vetor[1]);
        System.out.println("Terceiro nome: " + vetor[2]);
    }
}
