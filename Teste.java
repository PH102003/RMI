import java.rmi.Remote;
import java.rmi.RemoteException;

//interface que define o método remoto que pode ser invocados pelo cliente
public interface Teste extends Remote {
    int soma(int numero1, int numero2) throws RemoteException;

}