import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class Sender {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);

        InetAddress address =
                InetAddress.getByName("localhost");

        while (true){
            String message = scanner.nextLine();
            byte[] data = message.getBytes();
            DatagramPacket packet =
                    new DatagramPacket(
                            data,
                            data.length,
                            address,
                            5000
                    );
            socket.send(packet);
            System.out.println("Message sent!");
        }
//        socket.close();

    }
}