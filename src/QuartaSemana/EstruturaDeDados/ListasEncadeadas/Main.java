package QuartaSemana.EstruturaDeDados.ListasEncadeadas;

public class Main {
    public static void main(String[] args) {

       ListaEncadeada minhaListaEnacadeada = new ListaEncadeada<String>();

        minhaListaEnacadeada.add("Desafios_DIO.FabricaDeCarros");
        minhaListaEnacadeada.add("Teste2");
        minhaListaEnacadeada.add("Teste3");
        minhaListaEnacadeada.add("Teste4\n");

        System.out.println(minhaListaEnacadeada.get(0));
        System.out.println(minhaListaEnacadeada.get(1));
        System.out.println(minhaListaEnacadeada.get(2));
        System.out.println(minhaListaEnacadeada.get(3));

        System.out.println(minhaListaEnacadeada);

        System.out.println(minhaListaEnacadeada.remove(3));

        System.out.println(minhaListaEnacadeada);

    }
}
