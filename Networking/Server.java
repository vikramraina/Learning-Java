//	Sockets

package Networking;
import java.io.*;
import java.net.*;

public class Server extends Thread {
	
	private ServerSocket serversocket_obj;
	
	public Server(int port) {
		try {
			serversocket_obj = new ServerSocket(port);
			serversocket_obj.setSoTimeout(90000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		try {
			System.out.println("Listening to client for connection on port " +
					+ serversocket_obj.getLocalPort() + " ......");
			Socket server = serversocket_obj.accept();
			System.out.println("Connected to socket => " + server.getRemoteSocketAddress());
			
			DataInputStream in = new DataInputStream(server.getInputStream());
			System.out.println(in.readUTF());
			
			DataOutputStream out = new DataOutputStream(server.getOutputStream());
			out.writeUTF("Thanks for connecting to the server at port => " + 
					serversocket_obj.getLocalPort() + " & Socket address => " 
					+ server.getRemoteSocketAddress());
			
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		int port  = Integer.parseInt(args[0]);
		
		Server server_obj = new Server(port);
		
		server_obj.start();
		
	}

}
