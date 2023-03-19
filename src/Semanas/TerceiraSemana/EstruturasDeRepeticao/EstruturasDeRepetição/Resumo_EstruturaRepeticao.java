package TerceiraSemana.EstruturasDeRepeticao.EstruturasDeRepetição;

public class Resumo_EstruturaRepeticao {
    /*

public class Fatorial {

        public static void Main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Fatorial: ");
            int fatorial = scan.nextInt();
            int multiplicacao = 1;//Multiplicação em fatorial não pode coomeçar com 0 se não os resultados serão 0;
            System.out.print(fatorial + "! = ");

            for (int i = fatorial; i >= 1; i--) {//Em fatorial usamos i-- ou seja decomposição para diminuir o fator;
                multiplicacao = multiplicacao * i;
            }
            System.out.println(multiplicacao);
        }
    }

*****************************************************************

public class MaiorEMedia {

        public static void Main(String[] args) {
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

*****************************************************************

public class Nome_Idade {

        public static void Main(String[] args) {
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
*****************************************************************

public class Notas {

        public static void Main(String[] args) {
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
*****************************************************************

public class Par_Impar {

        public static void Main(String[] args) {
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

*****************************************************************

    public class Tabuada {

        public static void Main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Tabuada: ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de: " + tabuada);

            for(int i =1; i <= 10 ; i++ ){//int i significa que o contador iniciara do 1; i<= 10 significa que meu contadoe irá ate 10; i++ é o incremento do contador como o count no while;
                System.out.println(tabuada + "X" + i + " = " + (tabuada*i));
            }
        }
    }





    */

}
