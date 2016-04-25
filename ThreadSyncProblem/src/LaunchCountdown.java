
public class LaunchCountdown {

	public void launchCount(String shuttleName) {
		try{
			for (int i = 5; i > 0; i--){
				System.out.println(shuttleName + " Launching in: "+ i);
			}
		}catch (Exception e){
			System.out.println("Launch interrupted");
		}
	}

}
