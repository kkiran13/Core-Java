
public class BalancedDelimeter {
	public boolean balance(String in){
		BoundedStack stack = new BoundedStack(in.length());
		for(int i=0;i<in.length();i++){
			char ch = in.charAt(i);
			if(ch == '[' || ch == '(' || ch == '{'){
				stack.push(ch);
			} else if(ch == ']'){
				if(stack.pop() != (Object)'[' || stack.isEmpty()){
					return false;
				}
			} else if(ch == '}'){
				if(stack.pop() != (Object)'{' || stack.isEmpty()){
					return false;
				}
			} else if(ch == ')'){
				if(stack.pop() != (Object)'(' || stack.isEmpty()){
					return false;
				}
			} 
		}
		
		  if(!stack.isEmpty()){  //this is an important check
			  return false;
		  }
		  
		  return true;
	}
	public static void main(String[] args){
		String in = "{a(b)}}";
		BalancedDelimeter bal = new BalancedDelimeter();
		System.out.println(in+ "balanced?? "+bal.balance(in));
	}
}
