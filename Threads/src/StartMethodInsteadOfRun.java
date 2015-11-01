public class StartMethodInsteadOfRun extends Thread{
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
		 StartMethodInsteadOfRun t1 = new StartMethodInsteadOfRun();  
		 StartMethodInsteadOfRun t2 = new StartMethodInsteadOfRun();  
System.out.println("By Calling START method both threads execute synschronously i.e \n first and second thread run paralelly but never together" +
		"\nThere exists context switching between threads");
		  t1.start(); 
		  t2.start();  
		 }  
	 
}
