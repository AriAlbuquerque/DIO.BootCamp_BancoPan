package QuartaSemana.EstruturaDeDados.Arvores.ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {


    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;    //Sempre ao criar árvore binária a raiz será null;
    }

    /*Método Inserir*/
    public void inserir(T conteudo) {   //Recebendo conteúdo do tipo T genérico
        BinNo<T> novoNo = new BinNo<>(conteudo);   // Criando Nó do conteúdo;
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {   //Método  inserir que será chamado e reutilizado no método publico inserir;
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {  //Compara se conteúdo do novo nó é  menor que o conteúdo atual;
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));   //Inserir nó atual á esquerda se for menor;
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));     //Se maior inserir atual á direita;
        }
        return atual;
    }
    /*Fim do método inserir*/
    //**********************************//

    /*Método Exibição em Ordem */
    public void exibirInOrdem() {
        System.out.print("\nExibindo em ordem ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());    //Percorrer primeiro a esuqerda;
            System.out.print(atual.getConteudo() + ", ");    //Imprime atual;
            exibirInOrdem(atual.getNoDir());     //Percorre á direita;
        }

    } /*Fim do método Exibir em ordem*/
    //**********************************//

    /*Método Exibição pós Ordem */
    public void exibirPosOrdem() {
        System.out.print("\nExibindo pós ordem ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());    //Percorrer primeiro a esuqerda;
            exibirPosOrdem(atual.getNoDir());    //Percorre á direita;
            System.out.print(atual.getConteudo() + ", "); //Imprime atual;
        }
    }/*Fim do método Exibir pós ordem*/
    //**********************************//

    /*Método Exibição Pré Ordem */
    public void exibirPreOrdem() {
        System.out.print("\nExibindo Pré ordem ");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");    //Imprime atual;
            exibirPreOrdem(atual.getNoEsq());    //Percorrer primeiro a esuqerda;
            exibirPreOrdem(atual.getNoDir());     //Percorre á direita;
        }
    }/*Fim do método Exibir Pré ordem*/
    //**********************************//

    /* ****************Método Remove---> não possui recursividade por isso tem mais e métodos */

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && atual.getConteudo().equals(conteudo)) {   //Looping para procurar conteúdo de nó que queremos excluir;
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {   //Testando se conteúdo é < que conteúdo do nó;
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.print("Conteudo nao localizado!\nBloco Try.");
            }
            /*Condições*/
            if (pai == null) {
                if (atual.getNoDir() == null) {             // Se nó atual á direita == null então--->Pegue nó a esquerda;
                    this.raiz = atual.getNoEsq();

                } else if (atual.getNoEsq() == null) {        //SE nó atual á esquerda == null  então
                    this.raiz = atual.getNoDir();

                } else {
                    for (temp = atual, filho = atual.getNoEsq();    //Condições do laço for;
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq())
                        ;

                }
                {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());     //Método remove que retira e rearranja as posições;
                        filho.setNoEsq(raiz.getNoEsq());
                    }
                }
                filho.setNoDir(raiz.getNoDir());
                raiz = filho;

            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == null){        //Testando se ref a direita do nó atual ou vou passar a testar a esuerda;
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());    //Sempre jogar a ref a esquerda do nó atual;
                }

            } else if (atual.getNoEsq() == null) {  //Testando se ref a esqueda do nó atual é null;
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    for (
                            temp = atual, filho = atual.getNoEsq();
                            filho.getNoDir() != null;      //Condição de parada
                            temp = filho, filho = filho.getNoDir()
                    ){

                        if (filho != atual.getNoEsq()){        //Se filho != atual jogue a esquerda;
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(atual.getNoEsq());
                        }
                        filho.setNoDir(atual.getNoDir());
                        if (pai.getNoEsq() == atual){
                            pai.setNoEsq(filho);
                        }else{
                           pai.setNoDir(filho);
                        }
                    }
                }// Fim do método REMOVE;
            }
        } catch (NullPointerException erro) {                             // Saída para as Exceções;
            System.out.print("Conteudo nao localizado! Bloco Catch.");
        }
    }
}



