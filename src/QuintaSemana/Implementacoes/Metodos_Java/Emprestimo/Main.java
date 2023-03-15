package QuintaSemana.Implementacoes.Metodos_Java.Emprestimo;

public class Main {

    public static void main(String[] args) {


        System.out.println("****************Emprestimo****************");

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
