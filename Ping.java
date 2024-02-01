import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ping {
    private static String getIPAdress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("IP: ");
        return scanner.next();
    }
    private static void IPAdress(String ipAddress) {
        try {
            //Checks whether the IP address is valid
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            if (!inetAddress.isReachable(5000)) {
                System.out.printf("The IP address %s is not reachable.",ipAddress);
            } else {
                System.out.printf("The IP address %s is reachable.",ipAddress);
            }
        } catch (UnknownHostException e) {
            System.out.printf("The %s ist not valid.",ipAddress);
        } catch (IOException e) {
            System.out.println("Error!!!");
        }
    }

    public static void main(String[] args) {
        String ipAdress = getIPAdress();
        IPAdress(ipAdress);

    }
}