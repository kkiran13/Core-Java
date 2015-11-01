
public class StackTest {
	public static void main(String[] args){
		BoundedStack stack = new BoundedStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}
