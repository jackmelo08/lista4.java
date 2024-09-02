import java.util.ArrayList;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] n = new int[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            n[i] = s.nextInt();
        }

        ArrayList<Integer> elementosUnicos = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            if (!elementosUnicos.contains(n[i])) {
                elementosUnicos.add(n[i]);
            }
        }

        int[] vetorSemDuplicados = new int[elementosUnicos.size()];
        for (int i = 0; i < elementosUnicos.size(); i++) {
            vetorSemDuplicados[i] = elementosUnicos.get(i);
        }

        System.out.println("Vetor sem duplicados:");
        for (int elemento : vetorSemDuplicados) {
            System.out.print(elemento + " ");
        }
    }
}


