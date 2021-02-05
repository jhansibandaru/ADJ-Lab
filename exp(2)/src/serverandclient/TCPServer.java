package serverandclient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;


public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2001);
		System.out.println("Server is ready for clients");
		Socket c = ss.accept();
		
		//DataInputStream din = new DataInputStream(c.getInputStream());
		PrintStream pw = new PrintStream(c.getOutputStream());
		//String s = din.readLine();
		
		pw.println("How may i help you..!?");
	}

}
