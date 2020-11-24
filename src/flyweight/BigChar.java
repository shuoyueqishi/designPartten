package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;

public class BigChar {
    private String fontData;
    private char charName;
    public BigChar(char charName) {
        this.charName=charName;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\MyProjects\\学习类项目\\JAVA\\designPartten_git\\src\\flyweight\\file\\big"+charName+".txt"));
            String line;
            StringBuffer buffer = new StringBuffer();
            while((line=reader.readLine())!=null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontData=buffer.toString();
        } catch (Exception e) {
            this.fontData=charName+"?";
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println(fontData);
    }
}
