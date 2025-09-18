import java.util.*;
import java.net.*;
import java.io.*;
	class Threading extends Thread{
		private Socket client;
		public Threading (Socket client){
			this.client=client;
		}
		public void run(){
			try{
			Scanner in = new Scanner(client.getInputStream());
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		Scanner input = new Scanner(System.in);
	
		while(true){

	
	String message = in.nextLine();
	System.out.println("Client says "+ message);
	
    
	if(message.equals("exit")){
		break;
}
String line = input.nextLine();
	out.println(line);
}
client.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	}



public class Deskserver{
	public static void main(String[] args){
try{
		ServerSocket server = new ServerSocket(9090);
	System.out.println("Waiting for client connection");
	while(true){
		Socket client = server.accept();
	System.out.println("client connected");
		Threading handle = new Threading(client);
		handle.start();
	}

}catch(IOException e){
e.printStackTrace();
}
}
}
