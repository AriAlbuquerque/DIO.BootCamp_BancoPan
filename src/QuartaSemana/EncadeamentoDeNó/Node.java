package QuartaSemana.EncadeamentoDeNó;

public class Node {

   private String conteudo;
   private Node nextNumber;

   public Node(String conteudo){
      this.nextNumber = null;
      this.conteudo = conteudo;
   }

   public String getConteudo() {
      return conteudo;
   }

   public void setConteudo(String conteudo) {
      this.conteudo = conteudo;
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
