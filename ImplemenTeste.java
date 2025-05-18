import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
// classe que implementa a interface "Teste"
public class ImplemenTeste extends UnicastRemoteObject implements Teste{
    
    // construtor que chama o construtor da superclasse
    public ImplemenTeste() throws RemoteException{
        super();
    } 
        //implementação do método criado no "Teste"
    @Override    
    public int soma(int numero1, int numero2) throws RemoteException{
            numero1 = 2;
            numero2 = 3;
            int resultado = numero1+numero2;
            return resultado;
    }

} 