import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva o tamanho do vetor: ");
                int n = s.nextInt();
                int[] vetor = new int[n];

                System.out.println("Escreva" + n + " números inteiros:");
                for (int i = 0; i < n; i++) {
                    vetor[i] = s.nextInt();
                }
                int soma = 0;
                for (int i = 0; i < n; i++) {
                    soma += vetor[i];
                }
                System.out.println("A soma dos vetores são: " + soma);


            }
        }




