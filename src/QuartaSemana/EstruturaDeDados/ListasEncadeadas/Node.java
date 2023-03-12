package QuartaSemana.EstruturaDeDados.ListasEncadeadas;

public class Node<T> {

    private T conteudo;
    private Node nextNode;
    public Node() {
        this.nextNode = null;
    }
    public Node(T conteudo) {
        this.nextNode = null;
        this.conteudo = conteudo;
    }

    public Node(Node nextNode) {
        this.conteudo = conteudo;
        this.nextNode = nextNode;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo=" + conteudo +
                '}';
    }
    public  String toStringEncadeado(){
        String str =  "Node{" + "conteudo=" + conteudo + '}';

        if (nextNode != null){
            str += "-->" + nextNode.toString();
        }else {
            str += "--> null" ;
        }
        return str;
    }


}
