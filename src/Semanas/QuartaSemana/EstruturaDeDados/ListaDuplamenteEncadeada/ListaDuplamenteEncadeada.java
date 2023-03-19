package QuartaSemana.EstruturaDeDados.ListaDuplamenteEncadeada;

import QuartaSemana.EstruturaDeDados.ListasEncadeadas.ListaEncadeada;

import java.util.List;

public class ListaDuplamenteEncadeada<T> {

    private  NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

   private int tamanhoLista;
   public ListaDuplamenteEncadeada(){
       this.primeiroNo = null;
       this.ultimoNo = null;
       this.tamanhoLista = 0;
   }

   public T get(int index){                   //Método com reutilização do método getNo;
       return this.getNo(index).getConteudo();
   }

   public  void add(T elemento){              //Método add adiciona ao final da lista;
       NoDuplo<T> novoNo = new NoDuplo<>(elemento);     //Novo nó com elemento add;
       novoNo.setNoProximo(null);
       novoNo.setNoPrevio(ultimoNo);        //Aponta o nó prévio ao último nó;

       if (primeiroNo == null){
           primeiroNo = novoNo;
       }
       if (ultimoNo != null){
           ultimoNo.setNoProximo(novoNo);
       }
       ultimoNo = novoNo;
       tamanhoLista++;
   }

   public void add(int index, T elemento){          //Método para adicionar elemento em qualquer lugar da lista;
       NoDuplo<T> noAuxiliar = getNo(index);
       NoDuplo<T> novoNo = new NoDuplo<>(elemento);
       novoNo.setNoProximo(noAuxiliar);

       if (novoNo.getNoProximo() != null){
           novoNo.setNoProximo(noAuxiliar.getNoPrevio());
           novoNo.getNoProximo().setNoPrevio(novoNo);
       }else {
           noAuxiliar.setNoPrevio(ultimoNo);
           ultimoNo = novoNo;
       }
       if (index == 0){
           primeiroNo = novoNo;
       }else {
           novoNo.getNoPrevio().setNoProximo(novoNo);
       }
       tamanhoLista++;
   }

   public void remove(int index){

       if (index == 0){                                   //Se  indice ==0 primeiro num será o próximo número;
           primeiroNo = primeiroNo.getNoProximo();
           if (primeiroNo != null){                    //Se primeiro numero for != null entao primeiro numero indicara o anterior como null;
               primeiroNo.setNoPrevio(null);
           }
       }else {
           NoDuplo<T> noAuxiliar = getNo(index);               //Carro nó auxiliar possibilita trabalhar nos encadeamento dos nós(Espaço reserva);
           noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());    //Retirando um nó. referenciando seu próximo;

           if (noAuxiliar != ultimoNo){                        //Se nó auxiliar != ultimo nó;
               noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());      // nó aux pega próximo , retira o anterior, e o auxiliar pegará o nó prévio e colocará no settado;
           }else{
               ultimoNo = noAuxiliar;
           }
       }
       this.tamanhoLista--;          //Decremento;
       }
   private NoDuplo<T> getNo(int index){        //Método getNo permite reutilização de código;
       NoDuplo<T> noAuxiliar = primeiroNo;       //Inicio o nó auxiliar no primeiro nó;

       for(int i = 0; (i < index) && (noAuxiliar != null); i++){   // Condição booleana; Laço for continuará até que uma das condições seja false;
           noAuxiliar = noAuxiliar.getNoProximo();                 //Forma de inserir próximo elemento;    noAuxiliar = noAuxiliar.getNoProximo;
       }
       return noAuxiliar;
   }
   public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
       String strRetorno = "";

       NoDuplo<T> noAuxiliar = primeiroNo;
       for (int i = 0; i < size() ; i++){
           strRetorno += "[Nó{Conteudo=" + noAuxiliar.getConteudo() + "}]-----> ";
         noAuxiliar = noAuxiliar.getNoProximo();
       }
       strRetorno += "null";
       return strRetorno;
    }
}
