
public class StartThreadRunnanbleInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("Running "+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args){
		StartThreadRunnanbleInterface si = new StartThreadRunnanbleInterface();
		Thread t = new Thread(si);
		Thread t1 = new Thread(si);
		t.run();
	}
	
}
