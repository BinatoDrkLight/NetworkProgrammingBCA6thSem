import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class A10RequestHeader {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com");
            URLConnection uc = url.openConnection();

            uc.setRequestProperty("User-Agents", "MySimpleClient/1.0");
            uc.setRequestProperty("Accept", "text/html");

//            uc.getInputStream().close();

            Map<String, List<String>> headers = uc.getRequestProperties();
            for(Map.Entry<String, List<String>> entry : headers.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            uc.getInputStream().close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
