import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class A22HttpServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server running at http://localhost:8080");

            while(true){
                Socket socket = server.accept();

                PrintWriter out = new PrintWriter(socket.getOutputStream());

                out.println("HTTP/1.1 200 OK");
                out.println("Contest-Type: text/plain");
                out.println();
                out.println("Hello from  Java ServerSocket");

                out.flush();
                socket.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
