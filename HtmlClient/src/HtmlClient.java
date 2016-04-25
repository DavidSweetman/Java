import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HtmlClient {

	public static void main(String[] args) {
		String hostName = "127.0.0.1";
		int portNumber = 44446;
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
			
			
			// Console inputs and outputs
			System.out.println("Enter Page Url");
			out.println(stdIn.readLine());
			System.out.println("Do you want to bypass the cache? True/False");
			out.println(stdIn.readLine());
			
			
			// Output
			System.out.println("HTML: " + in.readLine());
			
			clientSocket.close();
			
		}catch(UnknownHostException e){
			System.exit(1);
		}catch(IOException e){
			System.exit(1);
			
		}
	

	}

}
