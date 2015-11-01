import java.util.Stack;


public class Stackqueue {
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	public Stackqueue(){
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	
	private void movestack(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}
	
	public boolean isEmpty(){
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public int size(){
		return stack1.size() + stack2.size();
	}
	
	public int peek(){
		if(isEmpty()){
			throw new IllegalStateException("Queue Empty");
		}
		if(stack2.isEmpty()){
			movestack();
		}
		return stack2.peek();
	}
	
	public void enqueue(int item){
		stack1.push(item);
	}
	
	public int dequeue(){
		if(isEmpty()){
			throw new IllegalStateException("Queue empty");
		}
		if(stack2.isEmpty()){
			movestack();
		}
		return stack2.pop();	
	}	
}