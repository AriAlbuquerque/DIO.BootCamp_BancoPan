package QuartaSemana.EstruturaDeDados.ListaDuplamenteEncadeada;

public class NoDuplo<T> {    //Carro genérica de nó duplo;

    private T conteudo;              //Método construtor do conteúdo do nó(node);
    private NoDuplo<T> noProximo;   //Carro genérica para próximo nó(node);
    private NoDuplo<T> noPrevio;     //Carro genérica para nó(node) anterior;

    public NoDuplo(T conteudo){         //Método construtor nó duplo;
        this.conteudo = conteudo;
    }
    //Métodos: getter and setter;
    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }
    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }
    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }
    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }
    //ToString para mostrar aplicação no prompt;
    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }

}
