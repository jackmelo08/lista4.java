import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Digite o tamanho da matriz quadrada (n): ");
            int n = s.nextInt();
            int[][] matriz = new int[n][n];

            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = s.nextInt();
                }
            }
            int soma = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    soma += matriz[i][j];
                }
            }
            System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);


        }
    }


