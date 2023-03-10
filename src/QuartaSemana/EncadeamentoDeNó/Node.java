package QuartaSemana.EncadeamentoDeNó;

public class Node <T> {       //Nó tipo genérico "T"; Agora o node aceita qualquer conteúdo;

   private T conteudo;
   private Node<T> nextNumber;

   public Node(T conteudo){
      this.nextNumber = null;
      this.conteudo = conteudo;
   }

   public T getConteudo() {
      return conteudo;
   }

   public void setConteudo(String conteudo) {
      this.conteudo = (T) conteudo;
   }

   public Node getNextNumber() {

      return nextNumber;
   }

   public void setNextNumber(Node nextNumber) {
      this.nextNumber = nextNumber;
   }

   @Override
   public String toString() {
      return "Node{" + "conteudo='" + conteudo + '\'' +
              '}';
   }
}
