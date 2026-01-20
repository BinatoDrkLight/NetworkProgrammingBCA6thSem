import java.net.*;

public class A07CookieManager {
    public static void main(String[] args) {
        String uri = "https://www.example.com";
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        CookiePolicy cookiePolicy = CookiePolicy.ACCEPT_ORIGINAL_SERVER;
        cookieManager.setCookiePolicy(cookiePolicy);
        try{
            URL url = new URL(uri);
        } catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }
}
