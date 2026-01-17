import java.io.IOException;
import java.net.*;
import java.util.List;
public class A06Cookie {
    public static void main(String[] args) {
        String uri = "https://www.google.com/";
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        CookiePolicy cookiePolicy = CookiePolicy.ACCEPT_ORIGINAL_SERVER;
        cookieManager.setCookiePolicy(cookiePolicy);

        try{
            URL url = new URL(uri);
            URLConnection connection = url.openConnection();
            connection.getContent();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }


        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookieList = cookieStore.getCookies();

        for (HttpCookie cookie : cookieList) {
            System.out.println("Domain name is: " + cookie.getDomain());
            System.out.println("Cookie name is: " + cookie.getName());
            System.out.println("Cookie name is: " + cookie.getValue());
        }
    }
}