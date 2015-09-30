package algoritms.stackoverflow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Sigora on 26.09.2015.
 */
public class Balanced {
    public static void main(String[] args) throws FileNotFoundException {
        Balanced bal = new Balanced();
        bal.testFileLocation();
    }

    public void testFileLocation() throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));

        System.out.println(Balanced.class.getClassLoader().getResource("test3.txt").getPath());

        File file = new File("test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
        InputStream is = new FileInputStream(file);
    }
}
