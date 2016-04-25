import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class LogInClient {

	public static void main(String[] args) {
		String hostName = "127.0.0.1";
		int portNumber = 44445;
		Socket clientSocket;
		PrintWriter out;
		BufferedReader in;
		InputStreamReader ir;
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			clientSocket = new Socket(hostName, portNumber);
			//Create IO Streams
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			ir = new InputStreamReader(clientSocket.getInputStream());
			in = new BufferedReader(ir);
			
			
			System.out.println("Enter Student Number");
			out.println(stdIn.readLine());
			System.out.println("Enter Password");
			out.println(stdIn.readLine());
			
			System.out.println("Your result is: " + in.readLine());
			
			clientSocket.close();
			
		}catch(UnknownHostException e){
			System.exit(1);
		}catch(IOException e){
			System.exit(1);
			
		}
	

	}

}
