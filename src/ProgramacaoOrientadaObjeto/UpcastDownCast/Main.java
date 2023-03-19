package ProgramacaoOrientadaObjeto.UpcastDownCast;

public class Main {

    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios();    //Instanciando Objeto na classe

         //UPCAST: Subtipos de Funcionário;
        Funcionarios gerente = new Gerente();
        Funcionarios vendedor = new Vendedor();
        Funcionarios faxineiro = new Faxineiro();

        //DOWNCAST: Deve ser evitado essa linha dará erro!
        //    Vendedor vendedor_ = (Vendedor) new Funcionarios();
    }
}
