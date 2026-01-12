import java.net.URL;
import java.net.MalformedURLException;


public class A01UrlOne {
    public static void main(String[] args) {
        try {
            //URL u = new URL("http://www.website.org/");
            URL u = new URL("http:", "www.mywebsite.org", 80, "/home.html#intro");
        } catch (MalformedURLException ex){
            System.err.println(ex);
        }
    }
}
