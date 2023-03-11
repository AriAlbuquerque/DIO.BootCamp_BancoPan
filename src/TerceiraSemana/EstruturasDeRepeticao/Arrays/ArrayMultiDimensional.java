package TerceiraSemana.EstruturasDeRepeticao.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Gerar e imprimir uma MATRIZ 4x4 com valores aleatórios entre 0 e -9;
 */
public class ArrayMultiDimensional {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();

            int[][] M = new int[4][4]; //O primeiro [] representa uma linha, o segundo [] uma coluna;

            for (int i = 0; i < M.length; i++) {//Linha i representa a linha da matriz;
                for (int j = 0; j < M[i].length; j++) {//Linha j representa coluna da matriz;
                    M[i][j] = random.nextInt(9);
                }
            }

            System.out.println("Matriz: ");
            for (int[] linha : M){//Pegar cada elemento da linha;
                for(int coluna : linha){//Para percorrer todos os elementos da matriz;
                    System.out.print(coluna + " ");
                }

                System.out.println();//Dá o espaço para mostar a matriz;

            }
        }

    }
