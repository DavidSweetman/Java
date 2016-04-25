import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Quiz_Client {
	public static void main(String[] args) {
        // TODO code application logic here
        String host = "127.0.0.1";
        int portNumber = 55555;
        
        try {
            Socket quizSocket = new Socket(host, portNumber);
            
            PrintWriter out = new PrintWriter(quizSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(quizSocket.getInputStream()));
            BufferedReader userConsoleIn = new BufferedReader(new InputStreamReader(System.in));
            
            String serverText;
            String userText;
            
            while ((serverText = in.readLine()) != null) {
                System.out.println("Server Text:" + serverText);
                
                userText = userConsoleIn.readLine();
                if (userText != null) {
                    System.out.println("Client Text: " + userText);
                    out.println(userText);
                }
            }
            
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
