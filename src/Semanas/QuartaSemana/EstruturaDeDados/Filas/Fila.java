package QuartaSemana.EstruturaDeDados.Filas;

public class Fila<T> {

    private Node<T> refNodeEntradaFila;

    public Fila() {
        this.refNodeEntradaFila = null;   //Instanciando ref de entrada null;
    }


    public void enqueue(T objcet){
        Node newNode = new Node(objcet);
        newNode.setRefNode(refNodeEntradaFila);
        refNodeEntradaFila = newNode;
    }

    public T first(){
        if (!this.isEmpty()){
            Node<T> firstNode = refNodeEntradaFila;
            while (true){
                if (firstNode.getRefNode() != null){
                    firstNode = (Node<T>) firstNode.getRefNode();

                }else{
                    break;
                }
            }
            return(T) firstNode.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!this.isEmpty()){
            Node firstNode = refNodeEntradaFila;
            Node nodeAux = refNodeEntradaFila;
            while (true){
                if (firstNode.getRefNode() != null){
                    nodeAux = firstNode;
                    firstNode = (Node) firstNode.getRefNode();
                }else{
                    nodeAux.setRefNode(null);
                    break;
                }
            }

            return(T) firstNode.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNodeEntradaFila == null ? true : false;

    }

    @Override
    public String toString() {
       String stringReturn = "";

       Node nodeAux = refNodeEntradaFila;
       if (refNodeEntradaFila != null){
           while (true){
               stringReturn += "[Node{Object=" + nodeAux.getObject() + "}]--->";

               if (nodeAux.getRefNode() != null){
                   nodeAux = (Node) nodeAux.getRefNode();
               }else {
                   stringReturn += "null";
                   break;
               }
           }

       }else {
           stringReturn = null;
       }

       return stringReturn;
    }
}
