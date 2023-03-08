package TerceiraSemana.EstruturasDeRepetição;
import java.util.Scanner;


public class Nome_Idade {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String nome;
            int idade = 0;

            while (true) { //Inicio do laço de repetição
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;// se nome for =0 break interrompe de imediato o laço;
                System.out.println("Idade: ");
                idade = scan.nextInt();
            }//fechamento do laço;
            System.out.println("Continua aqui...");//Após digitar 0 o sistema interrompe o laço e inicia o próximo comando do bloco seguinte;


        }

    }

