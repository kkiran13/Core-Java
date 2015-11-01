/*The join() method waits for a thread to die. In other words, it causes the currently 
 * running threads to stop executing until the thread it joins with completes its task.*/

class TestJoinMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
	  try{  
		  Thread.sleep(500);  
	  }catch(Exception e){
		  System.out.println(e);
	  }  
	  System.out.println(i+" "+Thread.currentThread().getName());  
  }  
 }  
 
public static void main(String args[]){  
 TestJoinMethod1 t1=new TestJoinMethod1();  
 TestJoinMethod1 t2=new TestJoinMethod1();  
 TestJoinMethod1 t3=new TestJoinMethod1();  
System.out.println("Name of t1: "+t1.getName()+" id of t1: "+t1.getId());
System.out.println("Name of t2: "+t2.getName()+" id of t2: "+t2.getId());
System.out.println("Name of t3: "+t3.getName()+" id of t3: "+t3.getId());
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 //t2.start();  
 System.out.println("When t1 completes its task then t2 and t3 starts executing");
 t2.start();
 t3.start(); 
 }  
}  