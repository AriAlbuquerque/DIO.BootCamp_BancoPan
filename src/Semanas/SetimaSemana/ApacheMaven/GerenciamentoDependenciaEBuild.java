package Semanas.SetimaSemana.ApacheMaven;

public class GerenciamentoDependenciaEBuild {
  /*
  * **********Gerenciamento de Dependências e Build em JAVA Maven**********

      * Apache Maven---> O Apache Maven é uma ferramenta de automação e gerenciamento de projetos Java, embora também possa ser utilizada com outras linguagens.
 Ela fornece às equipes de desenvolvimento uma forma padronizada de automação, construção e publicação de suas aplicações, agregando agilidade e qualidade ao produto final;
 Trata-se de uma ferramenta de gestão de dependências e um task runner. Em outras palavras, o Maven automatiza os processos de obtenção de dependências e de compilação de projetos Java. Quando criamos um projeto Maven, este projeto fica atrelado a um arquivo principal: o pom.
 Por ser extremamente flexível, permite que sejam adicionados plugins a si, para estender suas funcionalidades nativas;
 Em seu cerne, o Maven é uma ferramenta de gerenciamento e automação de construção (build) de projetos.
 Entretanto, por fornecer diversas funcionalidades adicionais através do uso de plugins e estimular o emprego de melhores práticas de organização, desenvolvimento e manutenção de projetos, é muito mais do que apenas uma ferramenta auxiliar.

         ***** POM--->Este arquivo, presente no diretório-raiz do projeto, contém todas as configurações que o Maven necessita para interagir corretamente com o projeto.
       Ele pode ser simples, somente possuindo as coordenadas do projeto, ou extremamente complexo, relacionando dependências, repositórios, repositórios de plugins, plugins específicos, estratégias de construção do projeto, perfis, entre outros

        ***** Tipos de dependencias:
        * Diretas: São dependências declaradas no pom.xml;
        * Transitivas: São as dependências obrigatórias das dependências declaradas no pom.xml;

        *****Transitividade e Escopos:


         ***** Ciclo de Vida de Construção--->Um ponto central do Maven é o conceito de ciclo de vida de construção (build lifecycle), que significa que os procedimentos de construção são definidos em etapas;
       Essas etapas são chamadas de estágios do ciclo de vida;
       Esses estágios ocorrem de forma cumulativa; Ou seja se executarmos o estágio 4 de um ciclo de vida for invocado, os estágios anteriores também serão executados ordenadamente, ou seja, os estágios 1, 2 e 3 serão acionados antes do Maven ativar o estágio 4.

        1-default: Gerencia a implementação do projeto;
        2-clean: Gerencia a limpezaq do projeto;
        3-site: Compreende a criação automatizada da documentação do projeto;

        *  O ciclo de vida padrão possui mais de 20 estágios, dos quais os mais importantes são:

    * validate: valida se todas as informações obrigatórias do projeto estão preenchidas e são válidas;
    * compile: compila o código-fonte;
    * test: executa os testes unitários presentes no projeto, desde que o framework de testes utilizado seja compatível com o Maven. Por padrão, é usado o jUnit;
    * package: empacota o código compilado no formato definido pela tag packaging do pom.xml;
    * integration-test: caso exista, o pacote gerado no estágio anterior é instalado em um ambiente de teste de integração;
    * verify: executa checagens para verificar se o pacote é válido e se atende aos critérios de qualidade;
    * install: instala o pacote no repositório local, de modo que outros projetos locais possam utilizá-lo como dependência
    * deploy: instala o pacote em repositórios externos, efetivamente disponibilizando-o em ambientes remotos.





*/
}
