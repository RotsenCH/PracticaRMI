import java.rmi.Naming;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            SaludoRemoto saludoRemoto = (SaludoRemoto) Naming.lookup("//localhost/SaludoRemoto");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa tu nombre:");
            String nombre = scanner.nextLine();
            System.out.println(saludoRemoto.saludar(nombre));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
