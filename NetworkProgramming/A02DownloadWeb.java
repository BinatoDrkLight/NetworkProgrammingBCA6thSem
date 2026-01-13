import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class A02DownloadWeb {
    public static void main(String[] args) {
        try{
        URL u = new URL("https://example.com");
            try(InputStream in = new BufferedInputStream(u.openStream())) {
                Reader r = new InputStreamReader(in);
                int c;

                while ((c = r.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

