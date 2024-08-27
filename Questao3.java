import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva o número de linhas da matriz:");
        int linhas = s.nextInt();
        System.out.println("Escreva o número de colunas da matriz:");
        int colunas = s.nextInt();

        int[][] matriz = new int[linhas][colunas];
        System.out.println("Escreva os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = s.nextInt();
            }
        }
        int[][] matrizTransposta = transporMatriz(matriz);

        System.out.println("Matriz transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }

        }


    }

    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}


