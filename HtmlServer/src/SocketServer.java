import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer {
	
	int portNumber =44446;
	ServerSocket serverSocket = null;
	
	public Storage list = new Storage();
	
	public void runServer(){
		try {
			serverSocket = new ServerSocket(portNumber);
		} catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		
		while (true){
			try{
				Socket clientSocket = serverSocket.accept();
				
				// Thread takes in the runnable object which takes in the storage.
				new Thread(new HtmlRunnable(clientSocket, list)).start();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	

}
