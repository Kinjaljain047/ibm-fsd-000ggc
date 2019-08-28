package networking2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingServer {
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client;
		
		
		int portnumber=6034;
		
		try {
			server= new ServerSocket(portnumber);
		}catch(IOException ie) {
			System.out.println("cannot open socket" +ie);
			System.exit(1);
		}
		System.out.println("server is created" +server);


	while(true) {
		try {
		System.out.println("waiting for connection request..");
		client= server.accept();
		
		System.out.println("client request is accepted..");
		String clientHost= client.getInetAddress().getHostAddress();
		int clientPort=client.getPort();
		System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
		
		
		  InputStream clientIn = client.getInputStream();
	      BufferedReader br = new BufferedReader(new
	              InputStreamReader(clientIn));
	      String msgFromClient = br.readLine();
	      System.out.println("Message received from client = " + msgFromClient);
	      
	      
	      if (msgFromClient != null ) {
	          OutputStream clientOut = client.getOutputStream();
	          PrintWriter pw = new PrintWriter(clientOut, true);
	          int ans=fact(Integer.parseInt(msgFromClient));
	         pw.println(ans);
	          
	      }
	     
	          server.close();
	          client.close();
	          break;
	      }
	      
	   catch (IOException ie) {
	  }
	}		
	}
	public static int fact(int x) {
		if(x==1) {
			return 1;
		}else {
			return x*fact(x-1);
		}
	}
}

