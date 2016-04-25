// Class to facilitate checking strings for " ' " that will cause errors with the SQL statements
// Just removes the " ' " from the string so "O'Brien" becomes "OBrien" for example

public class StringChecker {
	
	public static String checkString(String s){
		if(s.contains("'")){
			s = s.replace("'", "''");
		}
		return s;
	}

}
