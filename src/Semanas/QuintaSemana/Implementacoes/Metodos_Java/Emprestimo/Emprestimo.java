package QuintaSemana.Implementacoes.Metodos_Java.Emprestimo;
/*Calcular valor final de um empréstimo a partir do valor solicitado.(Taxas e parcelas influênciam,
 Defina as faixas que influênciam nos valores)*/
public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresPacelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if(parcelas == 2){
            double valorFinal = valor + getTaxaDuasParcelas();
            System.out.println("O valor final do empréstimo em 2 parcelas: " + valorFinal + " R$");
        } else if (parcelas == 3) {
            double valorFinal = valor + getTaxaTresPacelas();
            System.out.println("O valor final do empréstimo em 3 parcelas: " + valorFinal + " R$");
        }else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
