/**
 * Created by Sigora on 17.08.2014.
 */
public class Test {
    static String[] lang = {"D", "A", "S"};

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello world");
        Thread th1 = new Thread(r);
        th1.start();
    }
}