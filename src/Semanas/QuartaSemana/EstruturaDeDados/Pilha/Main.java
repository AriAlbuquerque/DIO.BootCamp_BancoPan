package QuartaSemana.EstruturaDeDados.Pilha;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new Node(1));
        minhaPilha.push(new Node(2));
        minhaPilha.push(new Node(3));
        minhaPilha.push(new Node(4));
        minhaPilha.push(new Node(5));
        minhaPilha.push(new Node(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

        minhaPilha.push(new Node(9));

        System.out.println(minhaPilha);



    }
}
