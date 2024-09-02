import java.util.ArrayList;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];


        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 3; i++) {
            vetor1[i] = s.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 3; i++) {
            vetor2[i] = s.nextInt();
        }

        ArrayList<Integer> intersecao = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (vetor1[i] == vetor2[j] && !intersecao.contains(vetor1[i])) {
                    intersecao.add(vetor1[i]);
                }
            }
        }

        System.out.println("Interseção dos vetores os elementos comuns entre eles:");
        if (intersecao.isEmpty()) {
            System.out.println("Não há elementos comuns entre os vetores.");
        } else {
            for (int elemento : intersecao) {
                System.out.print(elemento + " ");
            }
        }
    }
}


