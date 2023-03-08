package TerceiraSemana.EstruturasDeRepetição;
import java.util.Scanner;
/**
 * Desenvolva um gerador de tabuada;
 * Capaz de gerar tabuada do 1 ao 10;
 * Numero deve ser solicitado pelo usuário;
 * Saída:
 * Tabuada de 5:
 * 5 x 1 = 5L
 * 5 x 2 = 10....
 */
public class Tabuada {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            System.out.println("Tabuada: ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de: " + tabuada);

            for(int i =1; i <= 10 ; i++ ){//int i significa que o contador iniciara do 1; i<= 10 significa que meu contadoe irá ate 10; i++ é o incremento do contador como o count no while;
                System.out.println(tabuada + "X" + i + " = " + (tabuada*i));
            }


        }


    }
