package QuartaSemana.Pilha;

public class Pilha {

    private Node refNodeEntradaPilha;

    public Pilha() {
        this.refNodeEntradaPilha = null;

    }

    public void push(Node newNode){                     //Método PUSH;
        Node refAuxiliar = refNodeEntradaPilha;
        refNodeEntradaPilha = newNode;
        refNodeEntradaPilha.setRefNode(refAuxiliar);
    }

    public Node pop(){                                //Método POP;
        if (this.isEmpty()){
            Node nodePoped = refNodeEntradaPilha;
            refNodeEntradaPilha = refNodeEntradaPilha.getRefNode();
            return nodePoped;

        }
        return null;
    }

    public Node top(){                                  //Método TOP;
        return refNodeEntradaPilha;

    }
    public boolean isEmpty(){                            //Método isEmpty;
//        if (refNodeEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNodeEntradaPilha == null; //Redução de linhas de código na estrutura if;

    }

    @Override
    public String toString(){

        String stringRetorno = "-----------------------------------\n";
        stringRetorno += "            Pilha\n";
        stringRetorno += "------------------------------------\n";

        Node nodeAuxiliar = refNodeEntradaPilha;

        while (true){
            if (nodeAuxiliar != null){
                stringRetorno += "[Node{Dado= " + nodeAuxiliar.getDado()+ "}]\n";
                nodeAuxiliar = nodeAuxiliar.getRefNode();

            }else {
                break;
            }

        }
        stringRetorno += "=================\nFim da aplicação.";
        return stringRetorno;

    }


}
