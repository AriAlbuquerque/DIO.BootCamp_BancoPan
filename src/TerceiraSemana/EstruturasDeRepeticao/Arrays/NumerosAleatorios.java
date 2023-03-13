package TerceiraSemana.EstruturasDeRepeticao.Arrays;
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

            int[] numerosAleatorios = new int[20];

            for (int i = 0; i < numerosAleatorios.length; i++) {
                int numero = random.nextInt(100);
                numerosAleatorios[i] = numero;
            }

            System.out.print("Numeros aleatórios: ");
            for (int numero : numerosAleatorios) {
                System.out.print(numero + " ");
            }

            System.out.print("\nSucessores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero+1) + " ");
            }

            System.out.print("\nAntecessores: ");
            for (int numero : numerosAleatorios){
                System.out.print(numero-1 + " ");
            }

        }
    }

