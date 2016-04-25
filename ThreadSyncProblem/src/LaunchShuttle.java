
public class LaunchShuttle extends Thread{
	private String threadName;
	private LaunchCountdown lcd;
	private Thread te;
	
	public LaunchShuttle(String threadName, LaunchCountdown lcd){
		this.threadName = threadName;
		this.lcd = lcd;
		
	}
	public void run(){
		synchronized(lcd){
			lcd.launchCount(threadName);
		}
		System.out.println("Thread" + threadName + " completed.");
	}
	
	public void start(){
		System.out.println("Starting" + threadName);
		this.te = new Thread(this,threadName);
		te.start();
	}
}
