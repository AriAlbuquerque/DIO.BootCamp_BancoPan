package TerceiraSemana.EstruturasDeRepeticao.EstruturasDeRepetição;
import java.util.Scanner;

/**
 * Faça um programa que solicite entrada de números inteiros;
 * Calcule e mostre a quantidade de números PARES e ÍMPARES;
 */
public class Par_Impar {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int quantNumero;
            int count = 0;
            int numero;
            int qunatidadePares = 0, quantidadeImpares = 0;

            System.out.println("Quantidade de números: ");
            quantNumero = scan.nextInt();

            do{
                System.out.println("Número: ");
                numero = scan.nextInt();
                if(numero % 2 == 0) qunatidadePares++;
                else quantidadeImpares++;
                count++;
            }while (count < quantNumero);

            System.out.println("Quantidade de números Pares: " + qunatidadePares);
            System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        }
    }

