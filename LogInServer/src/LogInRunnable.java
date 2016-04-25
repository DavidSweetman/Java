import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LogInRunnable  implements Runnable{

	
	protected Socket clientSocket = null;
	ILog io = new FileIO();
	public LogInRunnable(Socket clientSocket){
		this.clientSocket = clientSocket;
		
		

	}
	
	@Override
	public void run() {
		
		Storage list = new Storage();
		Student s1 = new Student("Apple", 99);
		Student s2 = new Student("Orange", 40);
		Student s3 = new Student("Grape", 12);
		Student s4 = new Student("Melon", 33);
		Student s5 = new Student("Lemon", 79);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			String password;
			int studentnum;
			String studentnumstring = in.readLine();
			studentnum = Integer.parseInt(studentnumstring);
			password = in.readLine();

			String result = list.Display(studentnum, password);
			
			if (result == "Wrong Password"){
				synchronized(io){
				io.write("Log: Student: " + studentnum + " attempted to log on with wrong password");
				}
			}
			else{
				synchronized(io){
				io.write("Log: Student: " + studentnum + " has logged on.");
				}
			}
			
			out.println(result);	
			
			//System.out.println("The client says: " + password);
			//out.println("Thanks  for the message");
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
		
	}

}
