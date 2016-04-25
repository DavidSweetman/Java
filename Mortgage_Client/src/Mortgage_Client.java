import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Mortgage_Client {


	public static void main(String[] args) {
		String hostName = "127.0.0.1";
		int portNumber = 55555;
		Socket clientSocket;
		PrintWriter out;
		InputStreamReader ir;
		BufferedReader in ;
		
		try{
			clientSocket = new Socket(hostName, portNumber);
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			ir = new InputStreamReader(clientSocket.getInputStream());
			out.println("initCalculation");
			System.out.println("Server says: Test");
			in = new BufferedReader(ir);
			System.out.println("Server says: " + in.readLine());
		}catch(UnknownHostException e){
			System.exit(1);
		}catch(IOException e){
			System.exit(1);
		}


	}

}
