import java.rmi.Naming;

public class A31_3RMIMessageClient {
    public static void main(String[] args) {
        try{
            A31MessageInterface remoteService = (A31MessageInterface) Naming.lookup("rmi://localhost/RMIMessageService");
            String response = remoteService.HelloMessage();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
