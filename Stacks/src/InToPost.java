
public class InToPost {
	public String intopost(String in){
		String output = "";
		String input = in;
		boolean bracketflag = false;
		int size = input.length();
		BoundedStack stack = new BoundedStack(size);
		for (int i=0;i<size;i++){
			Object ch = input.charAt(i);
    if(ch == (Object)'('){
    	stack.push(ch);
    	bracketflag = true;
    } 
    else if(ch == (Object)')') {
    	while(stack.peek() != (Object)'('){
    		output = output + stack.pop();
    	}
    	stack.pop();
    }
    else if(ch ==(Object)'+' || ch == (Object)'-' || ch == (Object)'*' || ch == (Object)'/' ){
			   if(stack.isEmpty()) {
				   stack.push(ch);
			   } else {
				   Object top = stack.peek();
				  if (ch == (Object)'+' || ch == (Object)'-'){
					if(top == (Object)'+' || top == (Object)'-' || top == (Object)'('){
						   stack.push(ch);
					   }else if(top == (Object)'*' || top == (Object)'/'){
						   output = output + stack.pop();
						   stack.push(ch);
					   } 
				  }
				  if (ch == (Object)'*' || ch == (Object)'/'){
					  if(top == (Object)'+' || top == (Object)'-' || top == (Object)'*' || top == (Object)'/' || top == (Object)'('){
						   stack.push(ch);
					  }/*else if(top == (Object)'*' || top == (Object)'/'){
						   output = output + stack.pop();
						   stack.push(ch);
					   } */
				  }
			   }
	}else {
		output = output + ch;
	}
  }     
		if(!bracketflag){
		while(!stack.isEmpty()){
				output = output + stack.pop();
			}
		}
		/*else {
			while(stack.peek()!=(Object)'('){
				output = output + stack.pop();
			}
		}*/
		return output;
}
	
	public static void main(String[] args){
		InToPost inp = new InToPost();
		String in = "(1+2)*(3+4)";
		System.out.println("Postfix of "+in+" is "+inp.intopost(in));
	}
}
