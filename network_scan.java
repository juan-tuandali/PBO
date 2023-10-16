// Program sederhana untuk melakukan scan jaringan
import java.net.InetAddress;
import java.io.IOException;

public class NetworkScanner {
    public static void main(String[] args) {
        String subnet = "192.168.1"; // Ubah dengan sesuai subnet jaringan yang mau di scan

        for (int i = 1; i <= 254; i++) {
            String host = subnet + "." + i;
            try {
                InetAddress address = InetAddress.getByName(host);
                if (address.isReachable(1000)) {
                    System.out.println(host + " is reachable");
                } else {
                    System.out.println(host + " is not reachable");
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
