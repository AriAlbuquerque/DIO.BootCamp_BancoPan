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

            while (nota < 0 || nota > 10) {
                System.out.println("Nota invalida!\nDigite novamente: ");
                nota = scan.nextInt();//Nova entrada;
            }
            System.out.println("Nota: " + nota);
        }
    }


