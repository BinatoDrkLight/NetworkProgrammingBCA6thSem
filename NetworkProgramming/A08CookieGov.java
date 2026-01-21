import java.net.*;
import java.util.List;

public class A08CookieGov {
    public static void main(String[] args) {
        String uri = "https://www.google.com";
        Boolean govContains = false;
        try{
            URL url = new URL(uri);
            URLConnection connection = url.openConnection();
            connection.getContent();
            System.out.println("Connection Successful");
            if(url.getHost().toLowerCase().contains("gov")){
                govContains = true;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            if(govContains){
                System.out.println("Cookies not needed");
            } else {
                CookieManager cookieManager = new CookieManager();
                CookieHandler.setDefault(cookieManager);
                CookiePolicy cookiePolicy = CookiePolicy.ACCEPT_ORIGINAL_SERVER;
                cookieManager.setCookiePolicy(cookiePolicy);
                System.out.println("Cookie Created");
//                System.out.println(cookieManager.getCookieStore().getCookies().get(0).getValue());
                System.out.println(cookieManager.getCookieStore().getCookies().get(0));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
