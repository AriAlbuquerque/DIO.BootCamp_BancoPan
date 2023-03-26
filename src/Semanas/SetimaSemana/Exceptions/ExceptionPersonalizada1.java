package Semanas.SetimaSemana.Exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do Arquivo a ser exibido");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom Exception pu não o programa continua...");

    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo){

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();

        } catch (ImpossivelAberturaDeArquivoExceptiom e) {
            e.printStackTrace();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "O arquivo" + nomeDoArquivo + "não foi encontrado no diretório: "+ ex.getMessage());
            ex.printStackTrace();;
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoExceptiom {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw  new ImpossivelAberturaDeArquivoExceptiom(file.getName(), file.getPath());
        }
    }
}//Classe exception personalizada:
class ImpossivelAberturaDeArquivoExceptiom extends Exception{

    private  String nomeDoArquivo;
    private  String diretorio;

    public ImpossivelAberturaDeArquivoExceptiom(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + "não foi encontrado no diretório: " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
