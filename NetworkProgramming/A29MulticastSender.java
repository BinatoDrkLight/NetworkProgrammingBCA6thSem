import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class A29MulticastSender {
    public static void main(String[] args) {
        try{
            String message = "Swsc BCA student 6th semester";
            InetAddress group = InetAddress.getByName("224.0.0.1");
            int port = 8888;
            MulticastSocket socket = new MulticastSocket();
            socket.setTimeToLive(1);

            byte[] messageByte = message.getBytes();
            DatagramPacket packet = new DatagramPacket(messageByte, messageByte.length,group,port);

            socket.send(packet);
            System.out.println("Sent: "+ message);

            socket.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
