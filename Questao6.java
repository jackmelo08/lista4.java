import java.util.Scanner;
public class Questao6 {
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
                int[][] matrizRotacionada = rotacionar90Graus(matriz, n);

                System.out.println("Matriz rotacionada 90 graus no sentido horário:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrizRotacionada[i][j] + " ");
                    }
                    System.out.println();
                }

            }
            public static int[][] rotacionar90Graus(int[][] matriz, int n) {
                int[][] matrizRotacionada = new int[n][n];

                // Rotacionar a matriz
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrizRotacionada[j][n - 1 - i] = matriz[i][j];
                    }
                }

                return matrizRotacionada;
            }
        }




