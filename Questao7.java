import java.util.Scanner;
public class Questao7{
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Digite o tamanho da matriz quadrada (n): ");
            int n = s.nextInt();


            int[][] matriz = new int[n][n];

            System.out.println("Digite os elementos da matriz:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = s.nextInt();
                }
            }
            System.out.println("Elementos da diagonal principal:");
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][i] + " ");
            }
            System.out.println();

            System.out.println("Elementos da diagonal secundária:");
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][n - 1 - i] + " ");

            }
    }
}
