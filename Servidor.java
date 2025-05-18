import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Classe principal que configura e inicia o servidor
public class Servidor {
    public static void main(String[] args) {
        try {
            // instância do objeto remoto
            Teste teste = new ImplemenTeste();

            // Cria  o registro RMI na porta padrão 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Faz o registro do objeto remoto com nome "TesteService(rebind associa um nome a um objeto remoto no registro do RMI)"
            registry.rebind("TesteService", teste);

            System.out.println("Servidor RMI em funcionamento");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
