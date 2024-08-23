import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escrva tamanho do vetor: ");
        int n = s.nextInt();
        int[] vetor = new int[n];

        System.out.println("Escreva " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }
        System.out.print("Escreva o número a ser achado: ");
        int nBuscado = s.nextInt();

        int posicao = -1;
        for (int i = 0; i < n; i++) {
            if (vetor[i] == nBuscado) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            System.out.println("O número " + nBuscado + " foi achado na posição: " + posicao);
        } else {
            System.out.println("O número " + nBuscado + " não foi achado no vetor.");
        }

    }
}
