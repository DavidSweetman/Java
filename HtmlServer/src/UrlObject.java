import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// URL Object
public class UrlObject {
	
	public String url;
	public String html;
	
	// Method to get the HTML of a web site as a string
	public String getHTML(){
		String tmp_html = "";
		try{
			URL u = new URL(this.url);
			InputStreamReader i = new InputStreamReader(u.openStream());
			BufferedReader in = new BufferedReader(i);
			
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				tmp_html = tmp_html + inputLine;
			in.close();
					
			
		}catch (Exception e){
			System.out.println("Get HTML Page Error");
			
		}
		return tmp_html;
	}
}
