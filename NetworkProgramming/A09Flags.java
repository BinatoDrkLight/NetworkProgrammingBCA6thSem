import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class A09Flags {
    public static void main(String[] args) {
        Date today = new Date();
        long millisecondsPerDay = 20 * 60 * 60 * 1000;
        try{
            URL url = new URL("https://www.google.com");
            URLConnection uc = url.openConnection();

            System.out.println("Original if modified since " + new Date(uc.getIfModifiedSince()));
            uc.setIfModifiedSince((new Date(today.getTime() - millisecondsPerDay)).getTime());

            System.out.println("Will retrieve file " + new Date(uc.getIfModifiedSince()));
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
