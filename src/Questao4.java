import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = s.nextInt();
        int[] vetor = new int[n];

        System.out.println("Escreva " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media = (double) soma /n;
        double somatorioDesvio = 0;

        for(int i = 0; i < n ; i++){
            somatorioDesvio = somatorioDesvio + Math.pow(vetor[i]-media,2);
        }

        double desvioPadrao = Math.sqrt(somatorioDesvio/n);

        System.out.println("A media é: " + media);
        System.out.println("E o desvio padrão da media é: " + desvioPadrao);

    }
}
