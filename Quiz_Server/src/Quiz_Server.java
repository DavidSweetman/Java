import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz_Server {

	public static void main(String[] args) {

        int portNo = 55555;
        String[] questions = {"What is the capital of Ireland",
            "What year was the first Terminator movie released",
            "What is Batmans real name"};
        String[] answers = {"Dublin", "1984", "Bruce Wayne"};

        try {
            ServerSocket serverSocket = new ServerSocket(portNo);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine, outputLine;
            int counter = 0;

            out.println(questions[counter]);

            while ((inputLine = in.readLine()) != null) {
                 if (inputLine.equals(answers[counter])) {
                     outputLine = "Correct!!";
                 } else {
                     outputLine = "Incorrect, the answer is: " + answers[counter];
                 }
                 
                 if (counter == questions.length - 1) {
                     out.println(outputLine + " Game is over, thanks for playing!!");
                     System.exit(1);
                 } else {
                     counter = counter + 1;
                     out.println(outputLine + " Next Question: " + questions[counter] + "?");
                 }
            }
        } catch (IOException e) {
            // somethis goes here!!
        }

	}

}
