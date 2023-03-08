package TerceiraSemana.EstruturasDeRepetição;
import java.util.Scanner;

/**
 * Faça um programa que solicite entrada de números inteiros;
 * Calcule e mostre a quantidade de números PARES e ÍMPARES;
 */
public class Par_Impar {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int quantNumero;// Variável que define quantas vezes o usuário quer repetir o loop;
            int count = 0;//Variável de contador;
            int numero;//Variável que salvará o numero de entrada no laço;
            int qunatidadePares = 0, quantidadeImpares = 0;


            System.out.println("Quantidade de números: ");
            quantNumero = scan.nextInt();


            do{
                System.out.println("Número: ");
                numero = scan.nextInt();

                if(numero % 2 == 0) qunatidadePares++; //Se módulo do número for 0 adicionar em PARES;
                else quantidadeImpares++;//Se não adicionar aos ímpares;

                count++;//Incremento
            }while (count < quantNumero);//Manter laço até contador < que quantidade de números da entrada;

            System.out.println("Quantidade de números Pares: " + qunatidadePares);
            System.out.println("Quantidade de números ímpares: " + quantidadeImpares);




        }
    }

