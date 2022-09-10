import ConcreteBuilder.MarkdownToHtmlConverter;

import java.io.IOException;

public class Director {
    public static void main(String[] args) throws IOException {


        MarkdownToHtmlConverter markdownToHtmlConverter = new MarkdownToHtmlConverter();
        markdownToHtmlConverter.exportaProduto("a.txt", "b.html");
        markdownToHtmlConverter.exportaProduto("a.txt", "b.txt");


    }


}
