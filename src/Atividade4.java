import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[3];

        System.out.println("Digite o primeiro número: ");
        vetor[0] = input.nextInt();
        System.out.println("Digite o segundo número: ");
        vetor[1] = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        vetor[2] = input.nextInt();

        int soma = 0;
        System.out.println("Os elementos do vetor são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
        System.out.println("A média dos elementos do vetor é: " + (soma/3));
    }
}
