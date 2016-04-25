import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	int portNumber =44445;
	ServerSocket serverSocket = null;
	
	//Arraylist pages
	
	public void runServer(){
		try {
			serverSocket = new ServerSocket(portNumber);
		} catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		
		while (true){
			try{
				Socket clientSocket = serverSocket.accept();
				new Thread(new LogInRunnable(clientSocket)).start();   //(clientSocket, pages)).start();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	

}
