package TerceiraSemana.EstruturasDeRepeticao.EstruturasDeRepetição;
import java.util.Scanner;

/**
 * Faça um programa que peça uma nota entre 0 e 10;
 * Que se o valor fornecido for inválido, continue solicitando número válido ao usuário;
 */
public class Notas {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int nota;

            System.out.println("Digite a nota: ");
            nota = scan.nextInt();

            while (nota < 0 || nota > 10) {//Iniciando estrutura while para solicitar nota válida;
                System.out.println("Nota invalida!\nDigite novamente: ");//Solicitação de nova nota valida;
                nota = scan.nextInt();//Nova entrada;

            }//Finalização do laço while;

            System.out.println("Nota: " + nota);//Se nota válida programa passará direto do laço e não o executará, e sim o próximo comando válido do próximo bloco;


        }
    }


