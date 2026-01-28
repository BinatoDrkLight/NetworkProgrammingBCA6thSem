import java.net.*;
import java.net.Socket;

public class A17FindPort{
    public static void main(String[] args){
            for(int i = 1; i<=1024; i++){
                try(Socket socket = new Socket("localhost", i)){
                System.out.println(i);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
    }
}
