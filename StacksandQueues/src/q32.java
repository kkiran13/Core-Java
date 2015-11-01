import java.util.Stack;


public class q32 {
	public void push1(Stack<Integer> st1,int n){
		st1.push(n);
	}
	public void push2(Stack<Integer> st2,int n){
		int top = st2.peek();
		if(n<top){
			st2.pop();
			st2.push(n);
			
		}
	}
	public void getmin(Stack<Integer> st2){
		System.out.println("Min is: "+st2.pop());
	}
  public static void main(String[] args){
	  q32 q = new q32();
	  Stack<Integer> st1 = new Stack<Integer>();
	  Stack<Integer> st2 = new Stack<Integer>();
 	  int[] intarr = {18,19,29,15,16,4,2,64,3124,564,12,0,32,4};
 	  for(int i=0;i<intarr.length;i++){
 		  if(i==0){
 			  st1.push(intarr[i]);
 			  st2.push(intarr[i]);
 		  }
 		 int n = intarr[i];
 		  q.push1(st1,n);
 		  q.push2(st2,n);
 	  }
	  q.getmin(st2);
  }
}