import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept(); // will establish connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();

            System.out.println("Message from client: " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
