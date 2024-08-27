import java.util.Scanner;

public class Questao4 {
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

        System.out.println("Escreva o número a ser buscado:");
        int numero = s.nextInt();

        int[] posicao = buscarNumeroNaMatriz(matriz, numero);

        if (posicao != null) {
            System.out.println("Número encontrado na posição: Linha " + posicao[0] + ", Coluna " + posicao[1]);
        } else {
            System.out.println("Número não encontrado na matriz.");
        }

    }

    public static int[] buscarNumeroNaMatriz(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    return new int[] { i, j }; // Retorna a posição [linha, coluna]
                }
            }
        }
        return null; // Retorna null se o número não for encontrado
    }
}



