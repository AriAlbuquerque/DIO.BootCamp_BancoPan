package QuartaSemana.EstruturaDeDados.Filas;

public class Main {
    public static void main(String[] args) {

        Fila <String> minhaFila = new Fila <>();
        minhaFila.enqueue(("first"));
        minhaFila.enqueue(("second"));
        minhaFila.enqueue(("third"));
        minhaFila.enqueue(("fourth"));
        minhaFila.enqueue(("ARI"));




        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(("last"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }

}
