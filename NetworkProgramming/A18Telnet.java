import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class A18Telnet {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){
            while(true){
                try(Socket connection = server.accept()){
                    Writer out = new OutputStreamWriter(connection.getOutputStream());
                    Date now = new Date();
                    out.write(now.toString() + "\r\n");
                    out.flush();
                } catch (IOException ex){
                    System.err.println(ex);
                }
            }
        } catch (IOException ex){
            System.err.println(ex);
        }
    }
}
