
//package remoto;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class RemoteDateImpl extends UnicastRemoteObject implements RemoteDate {

    public RemoteDateImpl() throws RemoteException {

    }

    @Override
    public Date getDate() throws RemoteException {
        return new Date();
    }

    public static void main(String[] args) {
        try {
            RemoteDate dateServer = new RemoteDateImpl();
            // Vincular esta instancia de objeto al nombre "RMIDateObject"
            Naming.rebind("RMIDateObject", dateServer);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
