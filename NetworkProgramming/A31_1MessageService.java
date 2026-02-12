import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class A31_1MessageService extends UnicastRemoteObject implements A31MessageInterface {
    public A31_1MessageService() throws RemoteException{
        super();
    }

    @Override
    public String HelloMessage() throws RemoteException{
        return "Hello from the RMI Message server!";
    }
}
