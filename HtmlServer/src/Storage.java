import java.util.ArrayList;

public class Storage implements IStorage{
	
	ArrayList<UrlObject> aList = new ArrayList<UrlObject>();
	
	
	// Method to check the Storage for the URL and return HTML
	// If not found, add the storage and return HTML
	
	public synchronized String checkcache(String url){
		
		String check_result = "";
		for (int i=0; i<aList.size(); i++){
			UrlObject u = (UrlObject)aList.get(i);
			if (u.url.equals(url)){
				check_result = "( Loaded from Cached) " + u.html;
				break;
			}
			
		}
		// If URL is not found in the array list:
		if (check_result.equals("")){
			
			UrlObject uo = new UrlObject();
			uo.url       = url;
			uo.html      = uo.getHTML();
			check_result     = "(Added to Cache) " + uo.html;
			
			aList.add(uo);
			
		}
		return check_result;
		
	}
	



}
