package ProgramacaoOrientadaObjeto.Polimorfismo_Sobrescrita;

public class Main {

    public static void main(String[] args) {

        //Criando vetor classe mãe atribuido a variável classes contendo os objetos Criados:
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Polimorfismo e Sobrescrita: percorre os 3 objetos e chama o método 1  de todos deles;
        for (ClasseMae classe : classes) {
            classe.metodo1(); // Polimorfismo das classes filhas, exceto classe mãe que o tipo é igual ao objeto;
        }
        System.out.println("");

        //Sobrescrita e Polimorfismo: percorrer os 3 objetos chamando os métodos 2 de cada classe que possui o método 2;
        for (ClasseMae classe : classes) {
            classe.metodo2();

        }
        System.out.println("");

        //Sobescrita pura chama diretamente a classe filha e seu método 2;
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}