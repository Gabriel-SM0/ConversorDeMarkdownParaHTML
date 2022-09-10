package TrashAndReferences;

import java.io.*;

public class LeitorDeArquivo {

    public void abreOArquivo(String arquivo) throws FileNotFoundException {
        FileInputStream fluxoDeEntrada = new FileInputStream(arquivo);//pega os bytes
        InputStreamReader reader = new InputStreamReader(fluxoDeEntrada);//transforma os bytes em caracteres
        BufferedReader readFile = new BufferedReader(reader);//junta os caracteres emum buffer unico por linha


    }




    public LeitorDeArquivo() {
    }




    public void LerArquivo (String caminho) throws IOException {
        try {
            FileInputStream fluxoDeEntrada = new FileInputStream(caminho);//pega os bytes
            InputStreamReader reader = new InputStreamReader(fluxoDeEntrada);//transforma os bytes em caracteres
            BufferedReader readFile = new BufferedReader(reader);//junta os caracteres emum buffer unico por linha

            String line = readFile.readLine();

            while (line != null) {
                System.out.println(line);
                line = readFile.readLine();
            }
            readFile.close();

        }catch (Exception exception) {
            throw new IOException("Arquivo nao encontrado");
        }



    }









}
