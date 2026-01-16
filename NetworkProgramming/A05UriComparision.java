import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class A05UriComparision {
    public static void main(String[] args) {
        try{
            URI u1 = new URI("http://www.example.com/A");
            URI u2 = new URI("http://www.example.com/%41");
            System.out.println(u1.equals(u2));

            URI a = new URI("http://www.Example.com/path");
            URI b = new URI("http://www.example.com/path");
            System.out.println(a.equals(b));

            URI x = new URI("http://www.Example.com/a");
            URI y = new URI("http://www.example.com/b");
            System.out.println(x.compareTo(y) < 0);
        } catch (URISyntaxException ex){
            System.out.println(ex.getMessage());
        }

    }
}