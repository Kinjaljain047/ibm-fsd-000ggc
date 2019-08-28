package networking;

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
	
	
	int portnumber=1234;
	
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
      
      // Send response to the client
      if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
          OutputStream clientOut = client.getOutputStream();
          PrintWriter pw = new PrintWriter(clientOut, true);
          String ansMsg = "Hello, " + msgFromClient;
          pw.println(ansMsg);
      }
      
      // Close sockets
      if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
          server.close();
          client.close();
          break;
      }
      
  } catch (IOException ie) {
  }
}
}
}
