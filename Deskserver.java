import java.util.*;
import java.io.*;
import java.net.*;

class Threading extends Thread {
    private Socket client;

    public Threading(Socket client) {
        this.client = client;
    }

    public void run() {
        try {
            Scanner in = new Scanner(client.getInputStream());
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            while (true) {
                String line = in.nextLine();
                System.out.println(line);
                if (line.equals("exit")) {
                    break;
                }
            }

            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Deskserver {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090); // waiting for client connection
            System.out.println("Waiting for client connection");
while(true){
            Socket client = server.accept();
            System.out.println("Client Connected");

            Threading t = new Threading(client);
            t.start();

}       

     
 } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
