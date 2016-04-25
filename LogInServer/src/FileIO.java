import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO implements ILog{
	
	public void write(String s){
	
	try{
		FileWriter f = new FileWriter("c:/temp/newfile.txt", true);
		BufferedWriter bf = new BufferedWriter(f);
		bf.write(s);
		bf.newLine();
		bf.close();
		
	}catch(IOException e){e.getStackTrace();}
	
	}

}