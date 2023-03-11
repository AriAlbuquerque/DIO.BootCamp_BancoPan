package TerceiraSemana.EstruturasDeRepeticao.Arrays;
import java.util.Scanner;
/**
 * Criar um programa que leia um VETOR de seis CARACTERES;
 * Mostre quantas CONSOANTES foram lidas;
 * Imprima as consoantes;
 */
public class Consoantes {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] consoantes = new String[6];//Criando vetor[] com seis posições para armazenar STRING;
            int quantidadeConsoantes = 0;

            int count = 0;
            do {
                System.out.println("Digite uma letra: ");
                String letra = scan.next();

                if (!(letra.equalsIgnoreCase("a")) |
                        letra.equalsIgnoreCase("e") |         //equals irá comparar a letra de entrada; IgnoreCase irá ignorar se a letra é maiúscula ou minúscula;
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u")){
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                }
                count++;

            } while (count < consoantes.length);//Enquanto contador for menor que VETOR INEIRO(lenght) o laço se repetirá;
            System.out.print("Consoantes: ");
            for ( String consoante : consoantes ) {// Utilizando FOREACH; Para cada elemento do array consoantes imprima o elemento no caso consoante; estrutura FOR EACH;
                if(consoante != null)//Se não for uma consoante não será impresso;
                    System.out.print(consoante + " ");

            }

        }

    }
