package TerceiraSemana.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100);
 * Armazene-os num VETOR;
 * Ao final imprima os números e seus sucessores.
 */
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

