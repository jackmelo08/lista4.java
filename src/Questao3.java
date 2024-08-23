import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o tamanho do vetor: ");
        int n = s.nextInt();

        int[] vetor = new int[n];

        System.out.println("Escreva " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }

        System.out.println("Vetor invertido:");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }




    }
}


