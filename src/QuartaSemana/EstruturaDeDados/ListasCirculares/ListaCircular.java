package QuartaSemana.EstruturaDeDados.ListasCirculares;

public class ListaCircular<T> {

    private Node<T> cabeca;
    private Node<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        Node<T> newNode = new Node<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = newNode;
            this.cauda = this.cabeca;
            this.cabeca.setNextNode(cauda);
        } else {
            newNode.setNextNode(this.cauda);
            this.cabeca.setNextNode(newNode);
            this.cauda = newNode;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista!");

        Node<T> auxNode = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNextNode();
            this.cabeca.setNextNode(this.cauda);
        } else if (index == 1) {
            this.cauda.setNextNode(this.cauda.getNextNode().getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {       //Percorre a lista sempre do anterior;
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode()); // Retiro um node conecto seu antecessor ao sucessor;
        }
        this.tamanhoLista--;    //Finaliza assinalando decremento;
    }

    public T get(int index) {            //Método get;
        return this.getNode(index).getCoteudo();
    }

    private Node<T> getNode(int index) {    //O getNode recebe index(Indice) como parâmetro;
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");       //Exception se lista vazia;

        if (index == 0) {          //Se passar indíce zero ele apontará para a cauda;
            return this.cauda;
        }
        Node<T> auxNode = this.cauda;        //Percorre a lista através do nó auxiliar;
        for (int i = 0; (i < index) && (auxNode != null); i++) {
            auxNode = auxNode.getNextNode();
        }
        return auxNode;               //Fim do método de percorrer lista;
    }

    public boolean isEmpty() {                //Método testador que retorna se lista está vazia;
        return this.tamanhoLista == 0 ? true : false;  // se tamanho lista == 0(vazia) retorne true ou false se há elemento;
    }

    public int size() {           //Declarando size this.tamanhoLista não preciso add posições nas listas;
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        Node<T> auxNode = this.cauda;  //Nossa lista imprimirá pela cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[NodeConteudo=" + auxNode.getCoteudo() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }
}
