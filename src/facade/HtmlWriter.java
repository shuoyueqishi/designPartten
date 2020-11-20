package facade;

import java.io.*;

public class HtmlWriter {
    private OutputStreamWriter writer;
    public HtmlWriter(String path) throws FileNotFoundException,UnsupportedEncodingException {
        this.writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
    }
    public void title(String title) throws IOException {
        writer.write("<html>\n");
        writer.write(" <head>\n");
        writer.write(" <title>"+title+"</title>\n");
        writer.write(" </head>\n");
        writer.write(" <body>\n");
        writer.write("  <h1>"+title+"</h1>\n");
    }
    public void paragraph(String msg)throws IOException  {
        writer.write("      <p>"+msg+"</p>\n");
    }
    public void link(String href,String caption) throws IOException {
        paragraph("<a href=\""+href+"\">"+caption+"</a>");
    }
    public void mailto(String mailAddr,String username) throws IOException{
        link("mailto: "+mailAddr,username);
    }
    public void close() throws IOException {
        writer.write(" </body>\n");
        writer.write("</html>\n");
        writer.close();
    }
}
