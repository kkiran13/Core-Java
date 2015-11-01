/*Algorithm
1. Scan the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else,
…..3.1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty), push it.
…..3.2 Else, Pop the operator from the stack until the precedence of the scanned operator is less-equal to the precedence of the operator residing on the top of the stack. Push the scanned operator to the stack.
4. If the scanned character is an ‘(‘, push it to the stack.
5. If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
6. Repeat steps 2-6 until infix expression is scanned.
7. Pop and output from the stack until it is not empty.*/

public class postfixeval {
	public Object posteval(String in){
		int size = in.length();
		int res = 0;
		int n1 = 0;
		int n2 = 0;
		BoundedStack stack = new BoundedStack(size);
		for(int i=0;i<size;i++){
			char ch = in.charAt(i);
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				int len = stack.size();
				if(len>1){
				n1 = Integer.parseInt(stack.pop().toString());
				n2 = Integer.parseInt(stack.pop().toString());
				}else{
					n1 = Integer.parseInt(stack.pop().toString());	
				}
				switch(ch){
				case '+': res = n1+n2; 
				break;
				case '-': res = n2-n1;
				break;
				case '*': res = n1*n2;
				break;
				case '/': res = n1/n2;
				break;
				}
				stack.push((Object)res);
				
			} else {
				stack.push(ch);
			}
		}
		return stack.pop();
	}
	public static void main(String[] args){
		postfixeval pfval = new postfixeval();
		String in = "123*4++";
		String in1 = "“231*+9-";
		System.out.println("Result of "+in+" is: "+pfval.posteval(in));
		System.out.println("Result of "+in1+" is: "+pfval.posteval(in1));
	}
}
