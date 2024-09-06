public class Atividade3 {
    public static void main(String[] args) {

        int[] vetor = {5, 10};
        System.out.println("Vetor ao inicio: " + vetor[0] + ", " + vetor[1]);
        vetor[0] = vetor[1];
        vetor[1] = 5;
        System.out.println("Vetor ao final: " + vetor[0] + ", " + vetor[1]);

    }
}
