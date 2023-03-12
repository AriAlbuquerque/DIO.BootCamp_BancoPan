package QuartaSemana.EstruturaDeDados.Pilha;

public class Node {                    //Criação classe NODE;

    private int dado;
    private Node refNode = null;

    public Node() {
    }
    public Node(int dado) {
        this.dado = dado;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public Node getRefNode() {
        return refNode;
    }
    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }
    @Override
    public String toString() {
        return "Node{" +
                "dado=" + dado +
                '}';
    }
}
