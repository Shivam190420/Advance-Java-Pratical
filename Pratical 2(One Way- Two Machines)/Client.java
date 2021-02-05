import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("192.168.43.222", 8080);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hellow Mr. Shivam");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
