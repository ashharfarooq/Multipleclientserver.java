import java.util.*;
import java.net.*;
import java.io.*;

public class Deskclient{
	public static void main(String[] args){
try{
	
	Socket socket = new Socket("localhost",9090);
	System.out.println("CONNECTED");
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
	Scanner s1 = new Scanner(System.in);
	while(true){
        
	String line = s1.nextLine();
	out.println(line);
	String message = in.readLine();
        System.out.println("Server says "+message);
	
	if(line.equals("exit")){
break;
}
}
socket.close();	
s1.close();
}catch (IOException e){
e.printStackTrace();
}
}

}
