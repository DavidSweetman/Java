import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MortgageRunnable implements Runnable{
	
	protected Socket clientSocket = null;
	public MortgageRunnable(Socket clientSocket){
		this.clientSocket = clientSocket;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
			String arg1;
			arg1 = in.readLine();
			System.out.println("Client Says: " +arg1);
			out.println("Thanks for the message");
			System.out.println("Client Says: Test");
		}catch (IOException e){
			e.printStackTrace();
	}
}
	}
