package Semanas.QuintaSemana.Implementacoes.Stack_Pilha;
import java.util.Stack;

public class Main {
    public static <Carro, carro> void main(String[] args) {

        Stack<Carro> stackcarro = new Stack<>();

//        stackcarro.push(new carro ("Ford"));
//        stackcarro.push(new Carro("Chevrolet"));
//        stackcarro.push(new Carro("Fiat"));
//
//        System.out.println(stackcarro);
//
//        System.out.println(stackcarro.pop());
//        System.out.println(stackcarro);
//
//        stackcarro.push(new Carro("Fiat"));
//        System.out.println(stackcarro);

        System.out.println(stackcarro.peek());   //Método que mostra porém não retira o último elemento adicionado a pilha;
        System.out.println(stackcarro);

        System.out.println(stackcarro.empty());     //Retorna se a lista está vazia;



    }
}