import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CheckTime {
	
	String time;
	
	public static String getTime(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

}
