package compiletimeexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {

    public static void main(String[] args) {

        FileHandling f = new FileHandling();

        try {
            f.openFile();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }

    // throws delegates the exception to calling method (main)
    public void openFile() throws FileNotFoundException {
        File file = new File("D:\\Hii.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        
    }
    
}