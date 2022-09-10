package ConcreteBuilder;

import Builder.TextConverter;

import java.io.*;

public class MarkdownToHtmlConverter implements TextConverter {


    public void retornaAsciCompleto() {

    }


    @Override
    public String conversorTitulo1(String texto) {
        String textoConvertido;
        if (texto.contains("#")) {
            //textoConvertido = texto.replaceAll("[#]", "");
            textoConvertido = texto.replace("#", "");
            textoConvertido = "<h1>" + textoConvertido + "<h1>";
            return textoConvertido;
        }
        return texto;

    }

    @Override
    public String conversorTitulo2(String texto) {
        String textoConvertido;
        if (texto.contains("##")) {
            textoConvertido = texto.replace("##", "");
            textoConvertido = "<h2>" + textoConvertido + "<h2>";
            return textoConvertido;
        }
        return texto;

    }

    @Override
    public String conversorTitulo3(String texto) {
        String textoConvertido;
        if (texto.contains("###")) {
            textoConvertido = texto.replace("###", "");
            textoConvertido = "<h3>" + textoConvertido + "<h3>";
            return textoConvertido;
        }
        return texto;
    }

    @Override
    public String conversorTitulo4(String texto) {
        String textoConvertido;
        if (texto.contains("####")) {
            textoConvertido = texto.replace("####", "");
            textoConvertido = "<h4>" + textoConvertido + "<h4>";
            return textoConvertido;
        }
        return texto;

    }

    @Override
    public String conversorNegrito(String texto) {

        if (texto.contains("**")) {

            texto = texto.replace("**", "<strong>") + "<br>";
        }
        return texto;


    }

    @Override
    public String conversorItalico(String texto) {

        if (texto.contains("*")) {
            texto = texto.replace("*", "<em>") + "<br>";

        }
        return texto;


    }

    @Override
    public String conversorItalicoENegrito(String texto) {


        if (texto.contains("***")) {
            texto = texto.replace("***", "<em><strong>") + "<br>";
        }
        return texto;


    }


    @Override
    public String conversorLista(String texto) {

        return texto;

    }

    public void exportaProduto(String nomeDoArquivo, String arquivoDeSaida) throws IOException {

        try {
            FileInputStream fluxoDeEntrada = new FileInputStream(nomeDoArquivo);//pega os bytes
            InputStreamReader reader = new InputStreamReader(fluxoDeEntrada);//transforma os bytes em caracteres
            BufferedReader readFile = new BufferedReader(reader);//junta os caracteres emum buffer unico por linha


            FileOutputStream fluxoDeEntrada2 = new FileOutputStream(arquivoDeSaida);//pega os bytes
            Writer writer = new OutputStreamWriter(fluxoDeEntrada2);//transforma os bytes em caracteres
            BufferedWriter bwriter = new BufferedWriter(writer);//junta os caracteres emum buffer unico por linha


            //bwriter.newLine();

            String textoConvertido = "";

            String line = readFile.readLine();

            while (line != null) {
                textoConvertido = conversorTitulo4(line);
                textoConvertido = conversorTitulo3(textoConvertido);
                textoConvertido = conversorTitulo2(textoConvertido);
                textoConvertido = conversorTitulo1(textoConvertido);
                textoConvertido = conversorItalicoENegrito(textoConvertido);
                textoConvertido = conversorNegrito(textoConvertido);
                textoConvertido = conversorItalico(textoConvertido);
                textoConvertido = conversorLista(textoConvertido);
                System.out.printf(textoConvertido);

                //textoConvertido = textoConvertido + "<br>";
                bwriter.write(textoConvertido);
                bwriter.newLine();

                line = readFile.readLine();
            }
            readFile.close();
            bwriter.close();

        } catch (Exception exception) {
            throw new IOException("Arquivo nao encontrado");
        }


    }

}
