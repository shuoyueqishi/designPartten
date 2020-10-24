package adapter.demo;

import java.io.IOException;

public class FilePropertiesTest {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("F:\\MyProjects\\DesignParttern\\src\\adapter\\demo\\file.txt");
            fileIO.setValue("appId","com.huawei.cbcc");
            fileIO.setValue("desc","This is developed by Alexon");
            fileIO.writeToFile("F:\\MyProjects\\DesignParttern\\src\\adapter\\demo\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
