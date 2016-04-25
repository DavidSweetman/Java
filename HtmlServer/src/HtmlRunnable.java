import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class HtmlRunnable  implements Runnable{

	
	protected Socket clientSocket = null;
	public Storage cache;
	
	//Constructor. Sets storage as the storage on the server.
	public HtmlRunnable(Socket clientSocket, Storage storage){
		this.clientSocket = clientSocket;
		this.cache        = storage;
	}
	
	@Override
	public void run() {

		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out   = new PrintWriter(clientSocket.getOutputStream(), true);
			
			
			String url       = in.readLine();
			String nocache   = in.readLine();
			Boolean b = Boolean.valueOf(nocache.toLowerCase());
			
			// If not using the cache
			if (b){
				
				//Make new object
				UrlObject uo = new UrlObject();
				uo.url  = url;
				uo.html = uo.getHTML();
				String result = "(Non Cached)" + uo.html;
				//Print out the result to the client
				out.println(result);
				//Add to the cache
				cache.aList.add(uo);}
			// If using the cache
			else{
				//Check the cache and return HTML as string
				String response = cache.checkcache(url);
				//Print out the result to the client
				out.println(response);
			}
		
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}
	
	// Synchronized method to add to the storage
	public synchronized void add(UrlObject u){
		
		cache.aList.add(u);
	}

}
