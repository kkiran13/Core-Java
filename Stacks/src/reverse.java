
public class reverse {
	public String reversemethod(String in){
		String reversestring = "";
		BoundedStack stack = new BoundedStack(in.length());
		for(int i=0;i<in.length();i++){
			char ch = in.charAt(i);
			stack.push(ch);
		}
		while(!stack.isEmpty()){
			reversestring = reversestring + stack.pop();
		}
		return reversestring;
	}
	public static void main(String[] args){
		reverse rev = new reverse();
		String in = "abcde";
		System.out.println("Reverse of "+in+" is "+rev.reversemethod(in));
	}
}
