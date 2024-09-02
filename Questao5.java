import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double[][] matriz = new double[3][3];

            System.out.println("Digite os elementos da matriz 3x3:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextDouble();
                }
            }

            double determinante = calcularDeterminante(matriz);

            System.out.printf("O determinante da matriz é: %.2f\n", determinante);

        }
        public static double calcularDeterminante(double[][] matriz) {

            return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                    - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                    + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        }
    }


