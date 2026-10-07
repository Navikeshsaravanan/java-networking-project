import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

    public static void main(String[] args) throws Exception {
        int port = 5000;
        byte [] buffer = new byte[1024];
        DatagramSocket socket = new DatagramSocket(port);

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        while(true){
            System.out.println("Waiting for message...");
            socket.receive(packet);
            String message = new String(packet.getData(),0,packet.getLength());
            System.out.println("Received: "+message);

        }
//        socket.close();
    }
}