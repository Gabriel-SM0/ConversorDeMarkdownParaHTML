import ConcreteBuilder.MarkdownToHtmlConverter;

import java.io.IOException;

public class Director {
    public static void main(String[] args) throws IOException {


//        LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
//        leitorDeArquivo.LerArquivo("Loren2.txt");
//
        MarkdownToHtmlConverter markdownToHtmlConverter = new MarkdownToHtmlConverter();
        markdownToHtmlConverter.exportaProduto("a.txt","b.txt");



//        String b = markdownToHtmlConverter.conversorTitulo1("#teste1#");
//        System.out.println(b);
//        String c= markdownToHtmlConverter.conversorTitulo2("##teste2");
//        System.out.println(c);
//
//        String d = markdownToHtmlConverter.conversorTitulo3("###teste3");
//        System.out.println(d);
//        String e = markdownToHtmlConverter.conversorItalico("*italico");
//        System.out.println(e);
//        String f = markdownToHtmlConverter.conversorNegrito("**Negrito");
//        System.out.println(f);
//        String g = markdownToHtmlConverter.conversorItalicoENegrito("***teste6");
//        System.out.println(g);



    }


}
