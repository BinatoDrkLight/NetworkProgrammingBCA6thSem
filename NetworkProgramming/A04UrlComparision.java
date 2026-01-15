import java.net.MalformedURLException;
import java.net.URL;

public class A04UrlComparision {
    public static void main(String[] args) {
        try{
            URL u1 = new URL("https://www.example.com/");
            URL u2 = new URL("https://example.com");
            System.out.println(u1.equals(u2));

            URL a = new URL("http://www.example.com/index.html#p1");
            URL b = new URL("http://www.example.com/index.html#q2");
            System.out.println(a.sameFile(b));
        } catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
        }


    }
}
