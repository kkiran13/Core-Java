
public class Nextgreaterelement {
	public void nxtgreater(int[] arr){
		for(int i=0;i<arr.length;i++){
			int next = -1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"-->"+next);
	  }
	}

	/*1) Push the first element to stack.
2) Pick rest of the elements one by one and follow following steps in loop.
….a) Mark the current element as next.
….b) If stack is not empty, then pop an element from stack and compare it with next.
….c) If next is greater than the popped element, then next is the next greater element for
 the popped element.
….d) Keep popping from the stack while the popped element is smaller than next. next 
becomes the next greater element for all such popped elements
….g) If next is smaller than the popped element, then push the popped element back.
3) After the loop in step 2 is over, pop all the elements from stack and print -1 as next 
element for them.*/
	
	public void PrintNGE(int[] arr){ //O(n)
		
		BoundedStack stack = new BoundedStack(arr.length);
		int prev, next;
		stack.push(arr[0]);
		
		for(int i=1;i<arr.length;i++){
			next = arr[i];
			if(!stack.isEmpty()){
				prev = (int) stack.pop();
				while(prev < next){
					System.out.println(prev+"-->"+next);
					if(stack.isEmpty()){
						break;
					}
					prev = (int) stack.pop();
				}
				
				if(prev > next){
					stack.push(prev);
				}	
			}
			stack.push(next);
		}
		
		while(!stack.isEmpty()){
			prev = (int) stack.pop();
			next = -1;
			System.out.println(prev+"-->"+next);System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[] arr = {4,5,2,25};
		Nextgreaterelement nxt = new Nextgreaterelement();
		nxt.nxtgreater(arr);
		System.out.println();
		nxt.PrintNGE(arr);
		System.out.println();
		int[] arr1 = {13,7,6,12};
		nxt.nxtgreater(arr1);
		
	}
}
