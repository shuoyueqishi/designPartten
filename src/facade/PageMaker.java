package facade;

import AbstractFactory.factory.Page;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("D:\\MyProjects\\学习类项目\\JAVA\\designPartten_git\\src\\facade\\maildata");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter htmlWriter = new HtmlWriter(filename);
            htmlWriter.title("Welcome to "+username+"'s page");
            htmlWriter.paragraph(username+" welcome to "+username+"'s home page.");
            htmlWriter.paragraph("We are waiting for you reply!");
            htmlWriter.mailto(mailAddr,username);
            htmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
