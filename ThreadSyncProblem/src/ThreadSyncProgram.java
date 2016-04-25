
public class ThreadSyncProgram {


	public static void main(String[] args) {
		LaunchCountdown c = new LaunchCountdown();
		LaunchShuttle L1 = new LaunchShuttle("Launch thread 1", c);
		LaunchShuttle L2 = new LaunchShuttle("Launch thread 2", c);
		LaunchShuttle L3 = new LaunchShuttle("Launch thread 3", c);
		LaunchShuttle L4 = new LaunchShuttle("Launch thread 4", c);
		LaunchShuttle L5 = new LaunchShuttle("Launch thread 5", c);
		LaunchShuttle L6 = new LaunchShuttle("Launch thread 6", c);
		LaunchShuttle L7 = new LaunchShuttle("Launch thread 7", c);
		LaunchShuttle L8 = new LaunchShuttle("Launch thread 8", c);
		LaunchShuttle L9 = new LaunchShuttle("Launch thread 9", c);
		LaunchShuttle L10 = new LaunchShuttle("Launch thread 10", c);
		
		L1.start();
		L2.start();
		L3.start();
		L4.start();
		L5.start();
		L6.start();
		L7.start();
		L8.start();
		L9.start();
		L10.start();
		
		try{
			L1.join();
			L2.join();
			L3.join();
			L4.join();
			L5.join();
			L6.join();
			L7.join();
			L8.join();
			L9.join();
			L10.join();
		}
		catch (Exception e){
			System.out.println("Thread Interrupted");
		}
	
	}

}
