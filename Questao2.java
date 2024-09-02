import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = s.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = s.nextInt();

        int[][] matrizA = new int[linhasA][colunasA];
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = s.nextInt();
            }
        }
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = s.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = s.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }

        int[][] matrizB = new int[linhasB][colunasB];
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = s.nextInt();
            }
        }
        int[][] matrizResultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizResultado[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("A matriz resultante é:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

    }
}
