package QuintaSemana.PrincipaisImplementações_EstruturasDeDados.Stack_Pilha;

public class Resumo {
    /*
    * ************* Stack Pilha **************

*   public class Main {
    public static void main(String[] args) {

      Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));      //Adiciona elemento na lista;
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop());   //Retira o último elemento da lista;  elemento da lista;
        System.out.println(stackCarros);

        stackCarros.push(new Carro("Fiat")); // Add elemento na lista;
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());  //Mostra um elemento sem retirá lo da fila;
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); //Retorna se a lista esta vazia;

    *
    ******************************



import java.util.Objects;

public class Carro {

    String marca;


    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                               //Testando se obj é igual o parametro se sim retorno true;
        if (o == null || getClass() != o.getClass()) return false;//Retorna se obj é nullo ou obj e classes diferentes retur false;
        Carro carro = (Carro) o; //Casting de obj
        return Objects.equals(marca, carro.marca);               //Retorno levando em consideração atributo marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int hashCode() {         //Retorna numero inteiro um "hash" gerado atraves do atributo marca;
        return Objects.hash(marca);
    }
}
    *
    *
    *
    *
    *
    *
    * */
}
