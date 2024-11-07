package SampleApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\vivek.a.sahu\\OneDrive - Accenture\\documents/Readme.txt");
            int c;
            while ((c = fis.read()) != -1)
            System.out.println((char) c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
