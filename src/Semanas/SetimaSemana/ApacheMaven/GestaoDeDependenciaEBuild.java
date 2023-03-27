package Semanas.SetimaSemana.ApacheMaven;

public class GestaoDeDependenciaEBuild {
  /*
  * **********Gestão de Dependências e Build em JAVA Maven**********

      * Apache Maven---> O Apache Maven é uma ferramenta de automação e gerenciamento de projetos Java, embora também possa ser utilizada com outras linguagens.
 Ela fornece às equipes de desenvolvimento uma forma padronizada de automação, construção e publicação de suas aplicações, agregando agilidade e qualidade ao produto final;
 Trata-se de uma ferramenta de gestão de dependências e um task runner. Em outras palavras, o Maven automatiza os processos de obtenção de dependências e de compilação de projetos Java. Quando criamos um projeto Maven, este projeto fica atrelado a um arquivo principal: o pom.
 Por ser extremamente flexível, permite que sejam adicionados plugins a si, para estender suas funcionalidades nativas;
 No seu cerne, o Maven é uma ferramenta de gestão e automação de construção (build) de projetos.
 Entretanto, por fornecer diversas funcionalidades adicionais através do uso de plugins e estimular o emprego de melhores práticas de organização, desenvolvimento e manutenção de projetos, é muito mais do que apenas uma ferramenta auxiliar.

         ***** POM--->Este arquivo, presente no diretório-raiz do projeto, contém todas as configurações que o Maven necessita para interagir corretamente com o projeto.
       Ele pode ser simples, somente possuindo as coordenadas do projeto, ou extremamente complexo, relacionando dependências, repositórios, repositórios de plugins, plugins específicos, estratégias de construção do projeto, perfis, entre outros

        ***** Tipos de dependencias:
        * Diretas: São dependências declaradas no pom.xml;
        * Transitivas: São as dependências obrigatórias das dependências declaradas no pom.xml;

        ***** Classpath: Referência da aplicação pra o momento da execução:

        * Runtime: Em tempo de execução
        * Test: Execução dos testes
        * Compile: Momento de compilação da aplicação;

        *****Transitividade e Escopos:
        * Escope compile---> Escopo default, disponível em todos os clathpaths, é transitivo;
        * Escope provided---> indica que a dependência será fornecida em tempo de execução por uma implementação na JDK ou via container;
        * Escope runtime---> Indica que a dependência é necessária para a execução e não para a compilação;
        * Escope test---> Disponível somente para compilação de testes, não é transitivo;
        * Escope system---> Similar ao escopo provided excetopor ser necessário prover o JAR explicitamente; Não transitiva; só é adicionado no classpath usado para compile e test mas não em runtime;
        * Escope import---> Disponível apenas com uma dependência do tipo pom e com tag <dependencyManagement>; indica um processo de reutilizar dependências de um projeto;

         ***** Dependencias Opcionais---> Utilizado quando uma dependência não é necessária para os projetos que irão reutilizar seu componente;

         ***** Exclusions---> Utilizado quando o componete que usa compartilha uma biblioteca que você já tem ou não quer disponível;


         ***** Maven Build Lifecycle (Ciclo de Vida de Construção)--->Um ponto central do Maven é o conceito de ciclo de vida de construção (build lifecycle), que significa que os procedimentos de construção são definidos em etapas;
       Essas etapas são chamadas estágios do ciclo de vida;
       Esses estágios ocorrem de forma cumulativa; ou seja, se executarmos o estágio 4 de um ciclo de vida for invocado, os estágios anteriores também serão executados ordenadamente, ou seja, os estágios 1, 2 e 3 serão acionados antes do Maven ativar o estágio 4.

        1-default: Gerencia a implementação do projeto; Responsável pelo Deploy local;
        2-clean: Gerencia a limpezaq do projeto;
        3-site: Compreende a criação automatizada da documentação do projeto;

        *  O ciclo de vida padrão (dafeult) possui mais de 20 estágios, dos quais os mais importantes são:

    * validate: valida se todas as informações obrigatórias do projeto estão preenchidas e são válidas;
    * compile: compila o código-fonte;
    * test: executa os testes unitários presentes no projeto, desde que o framework de testes utilizado seja compatível com o Maven. Por padrão, é usado o jUnit;
    * package: empacota o código compilado no formato definido pela tag packaging do pom.xml;
    * integration-test: caso exista, o pacote gerado no estágio anterior é instalado em um ambiente de teste de integração;
    * verify: executa checagens para verificar se o pacote é válido e se atende aos critérios de qualidade;
    * install: instala o pacote no repositório local, de modo que outros projetos locais possam utilizá-lo como dependência
    * deploy: instala o pacote em repositórios externos, efetivamente disponibilizando-o em ambientes remotos.

     ***** Peojetos multi-módulos---> Para criar um projeto multi módulo usamos os comandos:
     * service
     * webapp
     * core
     * controller

     ***** Plugins---> São a estrutura central onde o Maven foi construido;
     Estilo arquitetural para extensibilidade(criar o seu próprio plugin);
     Escrito majoritariamente em JAVA disponibilizando documentos em JARs;

    * Plugins mais utilizados:
    Eclipse: Voltado para integração com a IDE eclipse;
    Jacoco: Voltado para cobertura de código;
    ear: Empacota e costumiza projeto em formato ear;
    war: Empacota e costumiza projeto em formato war;
    compile: Compila o projeto;
    clean:
    checkstyle: Verifica se o código está no estilo definido;
    javadoc: Utilizado para gerar documentação;



*/
}
