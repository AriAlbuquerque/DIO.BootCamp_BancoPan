package QuintaSemana.Implementacoes.Stack_Pilha;

public class Resumo {

    /*
    *     ****** Método Stack ******


      *** Stack é um método de pilha; utiliza LIFO;


*****************************************************************


   * ************Carro Main************

package QuintaSemana.Implementacoes.Stack_Pilha;
import java.util.Stack;
public class Main {
    public static void Main(String[] args) {

        Stack<Carro> stackcarro = new Stack<>();

        stackcarro.push(new Carro("Ford"));    //Adiciona elemento á pilha;
        stackcarro.push(new Carro("Chevrolet"));
        stackcarro.push(new Carro("Fiat"));

        System.out.println(stackcarro);

        System.out.println(stackcarro.pop());         //Retira o último objeto adicionado á pilha;
        System.out.println(stackcarro);

        stackcarro.push(new Carro("Fiat"));
        System.out.println(stackcarro);

        System.out.println(stackcarro.peek());   //Método que mostra porém não retira o último elemento adicionado a pilha;
        System.out.println(stackcarro);

        System.out.println(stackcarro.empty());     //Retorna se a lista está vazia;



    }
}


*
* **************Carro Carro********************

package QuintaSemana.Implementacoes.Stack_Pilha;
import java.util.Objects;
public class Carro {

    public Carro(String marca) {
            this.marca = marca;
        }
        String marca;
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
    @Override
    public boolean equals(Object o) {                           // Método equals;
        if (this == o) return true;                             // Testa se (Objeto o) que foi instanciado é igual a elemento de entrada;
        if (o == null || getClass() != o.getClass()) return false;   //Testa se o Objeto é null OU se a Carro dos Objetos são diferentes se sim retorna false;
        Carro carro = (Carro) o;                                 //Casting criando objeto carro temporario para testar usando atributo marca;;
        return marca.equals(carro.marca);                      //Retorno com equals;
    }
    @Override
    public int hashCode() {          //Realiza o HASH e retorna um número inteiro gerado através do atributo marca;
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}


    * */
}
