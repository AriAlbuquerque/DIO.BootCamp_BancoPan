package ProgramacaoOrientadaObjeto;
//Resumo das aulas teóricas;
public class ResumoPOO {


    /*  ***Programação Orientada á Objeto***

    *** OBJETO---> É o que executa faz tudo acontecer, deve estar em uma classe estática, é a representação de um conceito/entidade do mundo real, que pode ser física ou conceitual;
    Possui significado bem definido para determinado software;
    Para esse conceito/entiade(Objeto) deve ser inicialmente definida uma classe a partir de onde swerão instanciados objetos distintos;

        EX:             Carro carro = new Carro();         //Constrói um objeto e atribui a essa variável;

    * Definição: O POO(Programação Orientada á Objeto), é um paradigma de análise, projeto de programação d sistemas de software,
    baseado na composição e interação entre diversas unidades de software chamadas de OBJETO;

    *Análise: Compreender e desenvolver forma com maior automação possível pra o projeto;

    *Projeto: Pegar necessidades do mundo real e modelá-las e criar um modelo computacional;

    *Programação: Desenvolver os passoas anteriores em línguagem de programação;

    *Eleva o nível de Abstração;

    @ Abstração: Processo pelo qual isolamos características de um objeto como essênciais, considerando em comum os que tenham certos grupos de objetos com características essênciais iguais, para garantir o reuso;

    @ Reuso: Capacidade de criar novas unidades de código a partir de outras já existentes á partir de abstração, ;

    @ Encapsulamentos: Capacidade de esconder complexidades(Esconde comportamentos), e proteger dados aumentando a segurança desses dados,

""---->>>>> Ao programar pense apenas no PRESENTE, diminua as atribuiçoes em principais, e siga com os complementos e características, após avaliar o que já se tem, nunca tente prever o futuro;

    * *** Paradigma Orientado á Objeto(POO):  tem uma representação mais realista os conceitos do mundo real com mecanismos mais avançadas;
    * Foca na modelagem  de entidades e nas interações entre elas; Foca no "O que fazer"; Faz com  que o principal foco seja em automatizar detrminados processos;
    * Melhor COESÃO;
    * Melhor ACOPLAMENTO -> Bons acoplamentos são flexíveis, com facilidade de modelagem;
    * Diminuiçãodo Gap semântico(Diferença de semântica) aproxima a linguagem de máquina do DEV ;
    * Coletor de lixo -> Libera memória automaticamente para evitar excesso de uso de memória e travamento do software ;
    * Em POO o foco é nas estruturas que utilizará para criar a aplicação, permitindo facilidade de solução de problemas;

 *** Paradigma Estruturado(PE): Utilizado pela linguagem C tem uma representação mais simplista; foca em operações(funções) e dados;
    * Foca mais nas funçoes ou seja em dados brutos; Foca em como fazer; Muito baixo nível;
    * Limpeza de lixo manual, aumenta chance de erro no código;

************Estruturas básicas de OO*****************

    *** CLASSE: É estatica serve de molde para criar objetos, unidade mínima e básica de implementação de POO, estrutura que abstrai um conjunto de OBJETOS com características similares;
    Uma Carro define o comportamento de seus Objetos através de métodos e os estados possíveis destes através de atributos;
    Ou seja uma CLASSE descreve os servoços providos por seus objetos e quais informações eles podem armazenar;
    Através da classe podemos modelar os dados fazendo abstração e criar objetos;
    Como Criar Classes-----> São SUBSTANTIVOS do mundo real; Nomes Significativos; Contexto deve ser considerado;

    *** ATRIBUTOS(Próprio peculiar a alguém ou alguma coisa): é o elemento de uma Classe responsãvel por DEFINIR sua ESTRUTURA DE DADOS;
    O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe;
    Os atributos representam de forma mais fidedigna os conceitos do mundo real;
    Dentro do pc os atributos e variáveis serão reconhecidos da mesma maneira, porém com OO os atributos serão criadas dentro das Classes;
    Já as VARIÁVEIS(Sujeito a variações, inconstanjte, instavél) serão definidos dentro dos métodos;
    Usar: Substantivos e Adjetivos(Carro+Cor); Nomes Significativos; Contexto deve ser considerado; Abstração; Tipos adequados;

    *** MÉTODOS: porção de código(sub-rotina) que é disponibilizada pela classe;
    É exucutado quando chamado(requerido);
    Um método identifica quais serviços, ações que a classe oferece e realiza ddeterminado comportamento;
    Provém as ações através de manipulação de atributos ou variáveis;
    Usar: Verbos; Visibilidade; retorno; Nomes Significativos; Parâmentros se necessário; Contexto deve ser considerado;

    1-Método Construtor---> Constrói Objetos:  Obrigatório uso do mesmo nome da Classe no objeto;

                              EX:        class Carro{
                                             Carro(){
                                                 (Parâmetros)
                                                 }
                                               }
    2-Método Destrutor---> Auxilia na destrução de um objeto, quando a IDE percebe que sua classe não é utilizada ele chama o coletor que criará os destrutores e cahma-os;

                             EX:            class Carro{
                                                void finalize(){
                                                (Parâmetros)
                                                }
                                              }

    *** OBJETO---> É o que executa faz tudo acontecer, deve estar em uma classe estática, é a representação de um conceito/entidade do mundo real, que pode ser física ou conceitual;
    Possui significado bem definido para determinado software;
    Para esse conceito/entiade(Objeto) deve ser inicialmente definida uma classe a partir de onde swerão instanciados objetos distintos;

        EX:             Carro carro = new Carro();         //Constrói um objeto e atribui a essa variável;

    ***Sobrecarga---> Muda a assinatura de acordo com a necessidade: Assinatura: Nome + Parãmetros; EX: m1() --> m1(int i) --> m1(String s, long 1);


    *** Mensagem---> Solicitação para que um código seja executado; É um processo de aticação de um método de um objeto, ocorre quando chamamos esse método e disparamos a execução de seu comportamento descrito em sua classe;
    Pode também ser direcionada diretamente á classe, caso a requisição seja a um método estático;
          EX:            Carro carro = new Carro();
                         carro.<método>;// chama o método via obj;
                                     OU
                         Carro.<método>;// chama obj via a classe;

//Pesquisar sobre:
1-Instância X Estático: atributos e métodos--->

2-Estado de um Objeto--->
3-Identidade de um Objeto--->
4-Representação numérica de um Objeto--->
5-Representação padrão de um objeto--->



    * */
}
