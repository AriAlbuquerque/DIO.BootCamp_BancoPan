package QuintaSemana.Implementacoes.Metodos_Java.Mensagem;
/*A partir da hora do dia passar msg de \bom dia\boa tarde\boa noite;
*/
public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 01:
            case 02:
            case 03:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida!");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom Dia! :)");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde! :p");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite! ;)");

    }
}