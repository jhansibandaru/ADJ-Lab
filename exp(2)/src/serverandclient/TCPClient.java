package serverandclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.*;
import java.util.*;


public class TCPClient {

	public static void main(String[] args) throws IOException,UnknownHostException{
		// TODO Auto-generated method stub
		Socket s = new Socket("Localhost",2001);
		DataInputStream din = new DataInputStream(s.getInputStream());
		PrintStream pw = new PrintStream(s.getOutputStream());

		pw.println("Server are you ready?");
		System.out.println(din.readLine());
		s.close();
		System.out.println("Server is closed.");

	}

}
