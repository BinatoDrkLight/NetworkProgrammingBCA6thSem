import java.rmi.Naming;

public class A31_2RMIMessageServer {
    public static void main(String[] args) {
        try{
            A31MessageInterface server = new A31_1MessageService();
            Naming.rebind("RMIMessageService", server);
            System.out.println("RMI message server is running...");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}