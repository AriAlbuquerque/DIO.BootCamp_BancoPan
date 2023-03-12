package QuartaSemana.EstruturaDeDados.ListasCirculares;

public class Node<T> {            //Classe com implementação do tipo generico;

    private T coteudo;     //Atributo tipo genérico;

    private Node<T> nextNode;          // Referência de próximo nó;

    public Node(T coteudo) {
        this.nextNode = null;
        this.coteudo = coteudo;
    }

    public T getCoteudo() {
        return coteudo;
    }

    public void setCoteudo(T coteudo) {
        this.coteudo = coteudo;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "coteudo=" + coteudo +
                '}';
    }
}
