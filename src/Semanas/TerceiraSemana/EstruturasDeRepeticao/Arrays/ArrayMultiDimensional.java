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

            int[][] M = new int[4][4];

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = random.nextInt(9);
                }
            }

            System.out.println("Matriz: ");
            for (int[] linha : M){
                for(int coluna : linha){
                    System.out.print(coluna + " ");
                }

                System.out.println();

            }
        }

    }
