package QuartaSemana.EstruturaDeDados.EncadeamentoDeNó;

public class App {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("Conteudo node 1"); //Instanciando um NODE de String;

        Node<String> node2 = new Node<>("Conteudo node 2");
        node1.setNextNumber(node2); // Nó 1 aponta para o nó 2;

        Node<String> node3 = new Node<>("Conteúdo node 3");
        node2.setNextNumber(node3); // Nó 2 apontando para o nó 3;

        Node<String> node4 = new Node<>("Conteúdo node 4");
        node3.setNextNumber(node4); //Nó 3 apontando para nó 4;

//        System.out.println(node1);
//        System.out.println(node1.getNextNumber());
//        System.out.println(node3);
//        System.out.println(node4);

        System.out.println("----------------------------------");

        System.out.println(node1);
        System.out.println(node1.getNextNumber());
        System.out.println(node1.getNextNumber().getNextNumber());
        System.out.println(node1.getNextNumber().getNextNumber().getNextNumber());
        System.out.println(node1.getNextNumber().getNextNumber().getNextNumber().getNextNumber());




    }
}
