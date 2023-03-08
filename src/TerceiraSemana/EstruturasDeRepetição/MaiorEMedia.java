package TerceiraSemana.EstruturasDeRepetição;
import java.util.Scanner;
public class MaiorEMedia {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int numero;
            int count = 0;//variavel declarando contador;
            int maior = 0;
            int soma = 0;


            do {//Abrindo laço de repetição;
                System.out.println("Numero: ");
                numero = scan.nextInt();

                soma = soma + numero; //Irá somar a última entrada á próxima;


                if (numero > maior)
                    maior = numero;//Se numero digitado for maior que variável maior entao maior será o número digitado;

                count = count + 1;//O contador dirá ao laço quantas vezes ele será executado;
            } while (count < 5);

            System.out.println("Maior: " + maior);
            System.out.println("Media: " + soma / 5);//Média = Soma dividido por numero de entradas no caso 5;
        }
    }
