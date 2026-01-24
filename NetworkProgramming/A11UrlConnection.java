import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;

public class A11UrlConnection {
    public static void main(String[] args) {
        demoGetPermission();
        System.out.println();
        demoGuessContentTypeFromName();
//        System.out.println();
//        demoGuessContentTypeFromStream();
    }

    public static void demoGetPermission(){
        System.out.println("getPermission() demo");

        try{
            URL httpUrl = new URL("https://www.googleTwo.com/");
            URLConnection httpConn = httpUrl.openConnection();
            Permission httpPerm = httpConn.getPermission();

            System.out.println(".. HTTP URL ..");
            System.out.println("URL: " + httpUrl);
            if(httpPerm != null){
                System.out.println("Permission class" + httpPerm.getClass().getName());
                System.out.println("Name            " + httpPerm.getName());
                System.out.println("Actions         " + httpPerm.getActions());
            } else {
                System.out.println("No permmission object returns probably no security");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void demoGuessContentTypeFromName(){
        System.out.println("demoGuessContentTypeFromName()");

        String[] names = {
                "index.html",
                "photo.jpg",
                "archive.zip",
                "script.js",
                "style.css",
                "document.pdf",
                "object.json",
                "markup.xml",
                "unknownfile.xyz"
        };

        for(String name: names){
            String mimeType = URLConnection.guessContentTypeFromName(name);
            System.out.println(name + " ... " + mimeType);
        }
    }
}
