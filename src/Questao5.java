import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva o tamanho do vetor: ");
        int n = s.nextInt();
        int[] vetor = new int[n];

        System.out.println("Escreva os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }

        int contPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimo(vetor[i])) {
                contPrimos++;
            }
        }

        System.out.println("O vetor tem quantos numeros primos: " + contPrimos);
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
