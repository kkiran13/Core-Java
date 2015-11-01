
public class reverserecursion {
	public String output = "";
	BoundedStack stackout = new BoundedStack(10);
	public void revrecurse(BoundedStack st){
		if(!st.isEmpty()){
			stackout.push(st.pop());
			revrecurse(st);
		} 
		while(!stackout.isEmpty()){
			System.out.print(stackout.pop().toString()+"-->");
		}
	}
	
	public static void main(String[] args){
		reverserecursion rec = new reverserecursion();
		BoundedStack stack = new BoundedStack(5);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		rec.revrecurse(stack);
	}
}
