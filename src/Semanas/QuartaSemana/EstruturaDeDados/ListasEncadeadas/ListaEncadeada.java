package QuartaSemana.EstruturaDeDados.ListasEncadeadas;

public class ListaEncadeada<T> {    //Criação de lista genérica;

    Node<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        Node<T> newNode = new Node<>(conteudo);
        if (this.isEmpty()){
            refEntrada = newNode;
            return;
        }

        Node<T> auxNode = refEntrada;
        for (int i = 0; i < this.size()-1; i++){
            auxNode = auxNode.getNextNode();
        }
        auxNode.setNextNode(newNode);
    }

    public T get(int index){
        return getNode(index).getConteudo();
    }

    private Node<T> getNode(int index){
        validaIndice(index);
        Node<T> auxNode = refEntrada;
        Node<T> nodeReturn = null;
        for (int i = 0; i <= index; i++){
            nodeReturn = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return nodeReturn;
    }

    public T remove(int index){

        Node<T> nodePivor = this.getNode(index);
        if(index == 0 ){
            refEntrada = nodePivor.getNextNode();
            return nodePivor.getConteudo();
        }
        Node<T> nodeAnterior = getNode(index - 1);
        nodeAnterior.setNextNode(nodePivor.getNextNode());
        return nodePivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;

        Node<T> refAux = refEntrada;
        while (true){
            if (refAux != null){
                tamanhoLista++;
                if (refAux.getNextNode() != null){
                    refAux = refAux.getNextNode();
                }else {
                    break;
                }
            }else {
                break;
            }

        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() - 1;
            throw  new IndexOutOfBoundsException("Não existe conteúdo no índice" + index + " desta lista! \nEssa lista só vai até o indice: " + ultimoIndice + ".");
        }

    }
    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }
    @Override
    public String toString(){
        String strReturn = "";
        Node<T> auxNode = refEntrada;
        for (int i = 0; i < this.size(); i++){
            strReturn += "[Node{conteudo: " + auxNode.getConteudo() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;

    }

}
