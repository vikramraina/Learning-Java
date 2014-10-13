package Networking;

import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String [] args) throws IOException {
		int port = Integer.parseInt(args[1]);
		String hostname = args[0];
		
		Socket client = null;
		
		try {
			client = new Socket(hostname,port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connecting to " + hostname + "and port " + port + "====>");
		System.out.println("Client address for socket => " + client.getRemoteSocketAddress() + 
				" and port " + client.getLocalPort() + " ");
		
		DataInputStream in_from_server = new DataInputStream(client.getInputStream());
		
		DataOutputStream out_to_server = new DataOutputStream(client.getOutputStream());
		
		out_to_server.writeUTF("Hello from client: " + client.getRemoteSocketAddress());
		
		System.out.println("Server says: " + in_from_server.readUTF());
		
		client.close();
	}
}
