package QuartaSemana.EstruturaDeDados.Filas;

public class Node<T> {

    private T object;   //Todos os objetos do JAVA herdarão deste objeto; Parte util com informações do node;
    private Node<T> refNode;

    public Node(){
    }
    public Node(T object){
        this.object = object;
        this.refNode = null;

    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Object getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
