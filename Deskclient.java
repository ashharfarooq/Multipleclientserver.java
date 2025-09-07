import java.util.*;
import java.io.*;
import java.net.*;

public class Deskclient{
public static void main(String[] args){
try{
	Socket Client = new Socket("localhost",9090);
	PrintWriter out = new PrintWriter(Client.getOutputStream(),true);
	System.out.println("Type something");
	
	Scanner s1 = new Scanner(System.in);
	while(true){
	String exit = s1.nextLine();
	out.println("Client says "+ exit);
	if(exit.equals("exit")){
		break;
}
}
Client.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}
