import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public ServidorRMI() {
        try {
            LocateRegistry.createRegistry(1099);
            SaludoRemotoImpl saludoRemoto = new SaludoRemotoImpl();
            Naming.rebind("//localhost/SaludoRemoto", saludoRemoto);
            System.out.println("Servidor iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServidorRMI();
    }
}
