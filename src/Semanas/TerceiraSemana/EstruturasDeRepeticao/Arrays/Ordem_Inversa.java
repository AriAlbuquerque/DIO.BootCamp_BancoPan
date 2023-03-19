package TerceiraSemana.EstruturasDeRepeticao.Arrays;
import java.util.Scanner;
/**
 * Criar um vetor com 6 numeros inteiros;
 * Mostrar na ordem inversa;
 */
public class Ordem_Inversa {

    public class Ex01_Ordem_Inversa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] vetor = {-6, -5, 50, 8, 4, 15};
            System.out.println("***VETOR***\n");
            System.out.println("Vetor original: ");
            int count = 0;
            while (count < (vetor.length)) {
                System.out.print(vetor[count] + " ");
                count++;
            }
            System.out.println("\nInverso do vetor: ");
            for (int i = (vetor.length - 1); i >= 0; i--) {
                System.out.print(vetor[i] + " ");
            }

        }
    }


}
