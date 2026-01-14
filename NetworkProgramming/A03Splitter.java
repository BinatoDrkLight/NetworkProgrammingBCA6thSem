import java.net.MalformedURLException;
import java.net.URL;

public class A03Splitter {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://admin@www.example.com:8080/student.html?id=788#top");
            System.out.println("Schema " + u.getProtocol());
            System.out.println("User info: " + u.getUserInfo());
            System.out.println("Host " + u.getHost());
            System.out.println("Port " + u.getPort());
            System.out.println("Path " + u.getPath());
            System.out.println("Ref " + u.getRef());
            System.out.println("Query " + u.getQuery());
        } catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
