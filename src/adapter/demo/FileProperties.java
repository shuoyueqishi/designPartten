package adapter.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
       store(new FileOutputStream(fileName),"Written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
         setProperty(key,value);
    }

    @Override
    public void getValue(String key) {
        getProperty(key);
    }
}
