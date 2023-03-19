package PrimeiraSemana.Metodos;

public class ResumoMetodosEVariaveis {


    public static void main(String[] args) {
       /*

       Variáveis são espaços de memória alocados por um TIPO;

 *   Tiopos PRIMITIVOS (Informaçoes usuais e básicas):
 *    .BOOLEAN -> A váriável tipo boolean é sempre representado por um estado: TRUE | FALSE;
 *    .CHAR -> Usa o código UNICODE colocando em uma posição ocupando 16bits;
 *    .INTEIROS -> Números inteiros podendo ser positivos ou negativos;
 *    .REAIS -> Podem ser positivos ou negativos, porém possuem ponto flutuante;
 *    .Reais podem ser: byte, short, long, int.
 *    .Reais com ponto flutuante: float, double;
 *
 * Para declarar uma variável segue a gramática utilizada em JAVA:

                  String nome = "Ariane";
                  int idade = 33;
                  String profissao = "DEV"
                  double salarioSonhos = 10.000.00;  //Usado para números com maior espaço de memória mais bytes, sempre usar . nunca , ; Não precisa de declaração posterior como float->
                  float mediaNotas = 9.4f;   //Menos bytes precisa de declaração posterior = 9,4f;

 *  Inicia com tipo -> nome da variável(Referência) -> "=" recebe -> conteúdo(será acessado através da referência), pode ser inicializado ou iniciar em 0 Ex: int idade = 0;;


         * Todas as acões das aplicações são consideradas métodos;
         * Uma Carro é definida por atributos e método
         * Atributos são quase sempre variáveis de diferentes tipos e valores;
         * Os métodos correspondem a FUNÇÕES ou SUB-ROTINAS;
         * Convenções são padrões seguidos na comunidade, boas práticas de programação;
         * Nomeação de um método: 1)Nomeado com verbo. 2)Padrão camelCase.EX: abrirConexão, findById. 3) Um método deve ter apenas uma responsabilidade.
         * Em JAVA todo método deve ser definido dentro de uma Carro, não há métodos globais
         * Ao definir nomenclatura do método manter sempre em mente QUAL A PROPOSTA DO MÉTODO && QUAL RETORNO ESPERADO APÓS EXECUTADO!
         * Caso o método não retorne nenhum valor será representado por VOID(**Palavra chave**);
         * Definir quais PARÂMENTROS SÃO NECESSÁRIOS PARA EXECUTAR O MÉTODO;
         * Prever e tratar as EXCEÇÕES possíveis no método;

         Operadores Lógicos

     * Tipos:

     * Conjunção && (and)-> Operação lógica que só é verdadeira,
     * se ambas as operações forem verdadeiras é representada por && ou "and";

     * Disjunção || (or) -> Operação q só é falsa quando ambos os
     * operadores são falsos;

     * Disjunção Exclusiva ^ (xor) -> Operação que só é verdade quando
     * ambos os operadores ou expressões são opostos;

     * Negação ! (iversion) -> Operação que inverte o valor lógico de um operando ou expressão;



  public class ControleDeFluxo {


     * Estruturas de controle de fluxo tem a capacidade de direcinar o fluxo da execução do código;
     *
     * TIPOS:
     * Decisão -> if(se), if-else(se não), if-else-if, if-else-if-else,  switch(escolha) e operador ternário;
     * Repetição -> for, while, do while;
     * Interrupção -> break, continue, return;

     * Boas Práticas:
     * switch é para valores exatos com apenas uma variável e
     * if para expressão booleana com mais de uma variável;

     * Só utilizar default para casos em que o valor passado está errado;
     * Evitar efeito flecha do if...Criar variáveis simples.



    //Decisão...Exemplo:

    if(condição){  ***Declaração de condição se ou se não redireciona o codigo;
    }else{
    if(condição){
    }

   *** Operador Ternário deve ser evitado ao máximo devido dificuldade de manutenção do código... Exemplos:

    condiçaõ ? true : false;

    liago ? desligar : ligar;

    condição ? true : null;

    ***Se a condição for verdadeira faça se não (null) não faça nada;

       *** Decisão switch utiliza uma variável como parâmetro:

        switch(olhos){
        case1 : "Azuis"   **caso == façã.
        break;
        case2 : "Verdes"
        brak;
        case3 : "Castanhos"
        default:   **caso nenhuma das opções solicitadas execute default;
        break;
*******************************************************************************

         * Testando operadores lógicos e relacionais && || ^  e ! ;

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));//Uso do operador relacional AND &&;
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("\n");

        System.out.println("b2 || b3 " + (b1 || b3));// Uso do operador relacional OR ||;
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("\n");

        System.out.println("b1 ^ b3 " + (b1 ^ b3));// Uso do operador relacional XOR ^ ;
        System.out.println("b4 ^ b1 " + (b4 ^ b1));
        System.out.println("\n");

        System.out.println("Uso de !b1 -> " + !b1); // Uso do operador relacional NOT ! ;
        System.out.println("Uso de !b2 -> " + !b2);
        System.out.println("\n");


       ****** Operadores2 aritméticos, operadores relacionais e operadores lógicos juntos
        para chegar a uma expressão booleana;


        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("\n");
        System.out.println("(((i1 + i2) < (f2 - f1)) && true -> " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1))); -> " + ((i1 > i2) || (f2 < f1)));

       ******* Média salarial para baixa renda

         * como reduzir linhas de código com operações lógicas eficazes;
         * Exemplo:


        double salarioMensal = 1875.79d;
        double mediaSalarial = 2800.54d;

        int quantidadeDeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println("\n");
        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDeDependentes > mediaDependentes)); //forma ineficaz com muitas etapas e comparações > chance de erros no código;

        *Outra forma mais abreviada:

        boolean salarioBaixo = (salarioMensal < mediaSalarial);
        boolean muitosDependentes = (quantidadeDeDependentes > mediaDependentes);
        System.out.println("\n");
        System.out.println(salarioBaixo && muitosDependentes);

       * Forma mais eficaz e direta sem muitas linhas de código;
         * Exemplo:
           boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        Sytem.out.println("\n");
        System.out.println("Tem direito á auxílio: " + recebeAuxilio);


         * Sempre tentar deixar o código o mais claro e com o menor número de linhas possível sem afetar a aplicação,
         * Realizar comentários em métodos e suas funções, principalmente os mais complexos mantendo boas práticas e facilitando atualizações e correçoes no código;

         () && ()  ? e :    -----> é a abreciação de if else para expressão booleana;

    exemplo:
  int a, b;
    a = 6;
    b = 6;
    String resultado = a==b ? "Verdadeiro" : "Falso";
    System.out.println(resultado);

*/

    }
}
