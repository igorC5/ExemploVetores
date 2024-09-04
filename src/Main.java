import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int votoPessoa1 = 10;
        int votoPessoa2 = 23;
        int votoPessoa3 = 10;
        int votoPessoa4 = 10;
        int votoPessoa5 = 10;
        int votoPessoa6 = 99;
        int votoPessoa7 = 10;
        int votoPessoa8 = 10;
        int votoPessoa9 = 23;
        int votoPessoa10 = 99;

        //primeira forma de criar e inicializar um vetor
        //criamos o vetor vazio
        int[] votos = new int[10];

        //nomeVetor[posição] = valor
        //vetor vai da posição 0 a 9.
        votos[0] = 90;
        votos[1] = 10;
        votos[9] = 10;
        votos[0] = 90;

        String[] nomes = new String[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomes[0] = input.nextLine();
        System.out.println("O primeiro nome é: " + nomes[0]);

        double[] valores = {5.5, 10.9, 99};

    }
}

