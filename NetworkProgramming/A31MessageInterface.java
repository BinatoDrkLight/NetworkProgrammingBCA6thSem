import java.rmi.Remote;
import java.rmi.RemoteException;

public interface A31MessageInterface extends Remote {
    String HelloMessage() throws RemoteException;
}