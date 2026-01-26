import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class A15DictClient {
    public static void main(String[] args) throws IOException {
        String server = "dict.org";
        int port = 2628;

        try(Socket socket =new Socket(server, port)) {
            System.out.println("connected to" + socket.getInetAddress());
            socket.setSoTimeout(10000);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            String command = "DEFINE * computer\r\n";
            out.write(command.getBytes());
            out.flush();

            StringBuilder response = new StringBuilder();
            int ch;
            while ((ch = in.read()) != -1) {
                response.append((char) ch);

                if (response.toString().contains("250")) {
                    break;
                }
            }
            System.out.println(".....Server Response.....");
            System.out.println(response);
        }

    }
}