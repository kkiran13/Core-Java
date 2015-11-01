import java.util.Stack;


public class q35 {
	
	public static Stack<Integer> queuestack(Stack<Integer> st1){
		Stack<Integer> st2 = new Stack<Integer>();
		while (!st1.isEmpty()){
			st2.push(st1.pop());
		}
		printstack(st2);
		return st2;
	}
	public static void printstack(Stack<Integer> st){
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
	public static void main(String[] args){
		Stack<Integer> st1 = new Stack<Integer>();
	    st1.push(10);
	    st1.push(20);
	    st1.push(30);
	    queuestack(st1);
	}
}
