import java.io.IOException;
import java.net.ServerSocket;

public class A20RandomPortServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(0);
            System.out.println("This server runs on port : " + server.getLocalPort());
            System.out.println(server.getInetAddress());
        } catch (IOException e){
            System.err.println(e);
        }
    }
}
