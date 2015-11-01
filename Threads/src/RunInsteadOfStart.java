
public class RunInsteadOfStart extends Thread{
	
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
		 RunInsteadOfStart t1 = new RunInsteadOfStart();  
		 RunInsteadOfStart t2 = new RunInsteadOfStart();   
		  
		  System.out.println("By Calling Run method, threads run one after the other\n" +
				 " There is no context switching. t1 and t2 are treated as normal objects and not threaded objects");
		  t1.run();
		  t2.run();
		 }  
	 
}
