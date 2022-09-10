package TrashAndReferences;

import java.io.*;

public class EscritorDeArquivo {

    public void EscreveArquivo(String nomeDoArquivo) throws IOException {

            FileOutputStream fluxoDeEntrada = new FileOutputStream(nomeDoArquivo);//pega os bytes
            Writer reader = new OutputStreamWriter(fluxoDeEntrada);//transforma os bytes em caracteres
            BufferedWriter writer = new BufferedWriter(reader);//junta os caracteres emum buffer unico por linha

            writer.write("Testanto");
            writer.newLine();
            writer.write("Testanto");


            writer.close();

}









}
