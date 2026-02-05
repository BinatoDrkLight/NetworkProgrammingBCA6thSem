import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.SocketChannel;

public class A25MsgClient {
    public static void main(String[] args) {
        try {
            SocketAddress address = new InetSocketAddress("172.16.0.186", 8080);
            SocketChannel client = SocketChannel.open(address);
            ByteBuffer buffer = ByteBuffer.allocate(4);
            IntBuffer view  = buffer.asIntBuffer();

            for(int expected = 0; ;expected++){
                client.read(buffer);
                int actual = view.get();
                buffer.clear();
                view.rewind();
                if(actual !=expected) {
                    System.err.println("Expected" + expected + "; was" + actual);
                    break;
                }
                System.out.println(actual);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
