import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        System.out.println("Digite os elementos da primeira matriz:");

        System.out.println("Digite os elementos da segunda matriz:");

             for (int i = 0; i < linhas; i++) {
                  for (int j = 0; j < colunas; j++) {
                        matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }

                System.out.println("Matriz soma:");
                exibirMatriz(matrizSoma);

    }

            private static void preencherMatriz(Scanner scanner, int[][] matriz) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matriz[i][j] = scanner.nextInt();
                    }
                }
            }

            private static void exibirMatriz(int[][] matriz) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


