//Extending Thread Class
public class Multi extends Thread implements Runnable{
	public void run(){
		System.out.println("thread is running");
	}
	
	public static void main(String[] args){
		Multi mt = new Multi();
		mt.setName("my thread");
		mt.start();
		System.out.println(mt.getName());
		System.out.println(mt.getId());
	}
}
