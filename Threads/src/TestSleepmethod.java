
public class TestSleepmethod extends Thread{
	public void run(){
		for(int i=1;i<5;i++){
			try{
				sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	 public static void main(String args[]){  
		 TestSleepmethod t1 = new TestSleepmethod();  
		 TestSleepmethod t2 = new TestSleepmethod();  
System.out.println("By Calling START method both threads execute synschronously i.e \n firsta and second thread run paralelly but never together");
		  //t1.start(); 
		  //t2.start();  
		  
		  //System.out.println("By Calling Run method, threads run one after the other");
		  t1.run();
		  t2.run();
		 }  
	 
}
