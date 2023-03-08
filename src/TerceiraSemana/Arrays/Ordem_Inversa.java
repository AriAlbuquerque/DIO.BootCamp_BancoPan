package TerceiraSemana.Arrays;
import java.util.Scanner;
/**
 * Criar um vetor com 6 numeros inteiros;
 * Mostrar na ordem inversa;
 */
public class Ordem_Inversa {

    public class Ex01_Ordem_Inversa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] vetor = {-6, -5, 50, 8, 4, 15};//Criando um vetor unidimensional com 5  com posições iniciando na posição 0;
            System.out.println("***VETOR***\n");
            System.out.println("Vetor original: ");
            int count = 0;//Iniciando contador para laço de repetição;

            while (count < (vetor.length)) {//Iniciando laço de repetição infinito enquanto TRUE;
                //(count < (vetor.length-1)) enquanto contador for menor que (tamanho do vetor-1) com vetor - 1 -> o contador iniciará da posiçã0 0;

                System.out.print(vetor[count] + " ");//Imprimindo valor do vetor na posição 0;
                count++;//Irá incrementar 1 posição ate última posição determinada na variável vetor;
            }

            System.out.println("\nInverso do vetor: ");
            for (int i = (vetor.length - 1); i >= 0; i--) {//O i deve iniciar com vetor.lenght para saber o tamanho correto detrminado para o vetor;

                System.out.print(vetor[i] + " ");
            }

        }
    }


}
