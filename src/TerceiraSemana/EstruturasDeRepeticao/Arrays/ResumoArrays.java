package TerceiraSemana.EstruturasDeRepeticao.Arrays;

import java.util.Random;
import java.util.Scanner;

public class ResumoArrays {

        /* ARRAYS;
         * Arrays são na verdade um vetor podendo ser unidimensionais [VETORES] ou multideminsionais[MATRIZES];
         * Arrays podem conter diversos elementos desde que sejam OBRIGATÓRIAMENTE do mesmo tipo; EX: int 0,5,4,15;
         * Após definir o tamanho de um ARRAY ele continurá com seu tamanho mesmo que as posições não sejam ocupadas;

import java.util.Random;
import java.util.Scanner;

 * Gerar e imprimir uma MATRIZ 4x4 com valores aleatórios entre 0 e -9;

*******************************************************************
public class ArrayMultiDimensional {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                Random random = new Random();

                int[][] M = new int[4][4];                        //O primeiro [] representa uma linha, o segundo [] uma coluna;

                for (int i = 0; i < M.length; i++) {            //Linha i representa a linha da matriz;
                    for (int j = 0; j < M[i].length; j++){     //Linha j representa coluna da matriz;
                        M[i][j] = random.nextInt(9);
                    }
                }

                System.out.println("Matriz: ");
                for (int[] linha : M){                   //Pegar cada elemento da linha;
                    for(int coluna : linha){            //Para percorrer todos os elementos da matriz;
                        System.out.print(coluna + " ");
                    }
                    System.out.println();            //Dá o espaço para mostar a matriz;
                }
      }

*******************************************************************

public class Consoantes {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] consoantes = new String[6];                        //Criando vetor[] com seis posições para armazenar STRING;
            int quantidadeConsoantes = 0;

            int count = 0;
            do {
                System.out.println("Digite uma letra: ");
                String letra = scan.next();

                if (!(letra.equalsIgnoreCase("a")) |
                        letra.equalsIgnoreCase("e") |                     //equals irá comparar a letra de entrada; IgnoreCase irá ignorar se a letra é maiúscula ou minúscula;
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u")){
                        consoantes[count] = letra;
                       quantidadeConsoantes++;
                }
                count++;

            } while (count < consoantes.length);                        //Enquanto contador for menor que VETOR INEIRO(lenght) o laço se repetirá;
            System.out.print("Consoantes: ");
            for ( String consoante : consoantes ) {                    // Utilizando FOREACH; Para cada elemento do array consoantes imprima o elemento no caso consoante; estrutura FOR EACH;
                if(consoante != null)//Se não for uma consoante não será impresso;
                    System.out.print(consoante + " ");

            }

        }

    }


*******************************************************************

public class NumerosAleatorios {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();

            int[] numerosAleatorios = new int[20];//Criando um Array de inteiros []; Contendo 20 posiçoes;

            for (int i = 0; i < numerosAleatorios.length; i++) {//Para vator com inicio em 0(i=0); vetor int com 20 posiçoes;
                int numero = random.nextInt(100); //declarando variável número = próximo numero aleatório(Randon), limite = 100;
                numerosAleatorios[i] = numero;//Números aleatórios [VETOR] receberá número;
            }

            System.out.print("Numeros aleatórios: ");
            for (int numero : numerosAleatorios) { //foreach ( Representa elemento : Array )
                System.out.print(numero + " ");
            }

            System.out.print("\nSucessores: ");
            for (int numero : numerosAleatorios) { //foreach ( Representa elemento : Array )
                System.out.print((numero+1) + " ");//numero mais 1 imprimirá o sucessor do numero aleatório
            }

            System.out.print("\nAntecessores: ");
            for (int numero : numerosAleatorios){
                System.out.print(numero-1 + " ");
            }

        }
    }


*******************************************************************

* public class Ordem_Inversa {

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

 */

}
