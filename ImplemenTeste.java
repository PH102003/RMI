import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ImplemenTeste extends UnicastRemoteObject implements Teste{
    
    public ImplemenTeste() throws RemoteException{
        super();
    } 
        public int soma(int numero1, int numero2) throws RemoteException{
            numero1 = 2;
            numero2 = 3;
            int resultado = numero1+numero2;
            return resultado;
    }

} 