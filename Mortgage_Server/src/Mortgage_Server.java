//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;

public class Mortgage_Server {

	public static void main(String[] args) {

		
		
		System.out.println("Hello Server");
		SocketServer sos = new SocketServer();
		sos.runServer();
		
		//		int portNo = 55555;
		
		
		
//		try{
//			ServerSocket serverSocket = new ServerSocket(portNo);
//			Socket clientSocket = serverSocket.accept();
//			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//			out.println("Hello World!!");
//		}catch (IOException e){
//			System.out.println("Something went wrong");
//			
//		}

	}

}
