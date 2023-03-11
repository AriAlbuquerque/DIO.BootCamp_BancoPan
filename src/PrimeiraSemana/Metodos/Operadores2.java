package PrimeiraSemana.Metodos;

public class Operadores2 {

    public static void main(String[] args) {


        /**
         * Testando operadores lógicos e relacionais && || ^  e ! ;
         */
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
        /**Operadores2 aritméticos, operadores relacionais e operadores lógicos juntos
         * para chegar a uma expressão booleana;*/


        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("\n");
        System.out.println("(((i1 + i2) < (f2 - f1)) && true -> " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1))); -> " + ((i1 > i2) || (f2 < f1)));

        /**Média salarial para baixa renda
         *
         * como reduzir linhas de código com operações lógicas eficazes;
         * Exemplo:
         */

        double salarioMensal = 1875.79d;
        double mediaSalarial = 2800.54d;

        int quantidadeDeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println("\n");
        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDeDependentes > mediaDependentes)); //forma ineficaz com muitas etapas e comparações > chance de erros no código;

        //Outra forma mais abreviada:

        boolean salarioBaixo = (salarioMensal < mediaSalarial);
        boolean muitosDependentes = (quantidadeDeDependentes > mediaDependentes);

        System.out.println("\n");
        System.out.println(salarioBaixo && muitosDependentes);

        /** Forma mais eficaz e direta sem muitas linhas de código;
         * Exemplo:
         */

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("\n");
        System.out.println("Tem direito á auxílio: " + recebeAuxilio);

        /**
         * Sempre tentar deixar o código o mais claro e com o menor número de linhas possível sem afetar a aplicação,
         * Realizar comentários em métodos e suas funções, principalmente os mais complexos mantendo boas práticas e facilitando atualizações e correçoes no código;
         *
         */


    }


}
