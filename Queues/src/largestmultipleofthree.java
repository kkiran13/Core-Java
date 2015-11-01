import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Following is a solution based on the above observation.
1. Sort the array in increasing order.
2. Take three queues. 
One for storing elements which on dividing by 3 gives remainder as 0. (queue0)
The second queue stores digits which on dividing by 3 gives remainder as 1. (queue1) 
The third queue stores digits which on dividing by 3 gives remainder as 2. (queue2)
Call them as queue0, queue1 and queue2
3. Find the sum of all the digits.
4. Three cases arise:
……4.1 The sum of digits is divisible by 3. Dequeue all the digits from the three queues. 
Sort them in non-increasing order(decreasing). Output the array.
……4.2 The sum of digits produces remainder 1 when divided by 3.
Remove one item from queue1. If queue1 is empty, remove two items from queue2. 
If queue2 contains less than two items, the number is not possible.
……4.3 The sum of digits produces remainder 2 when divided by 3.
Remove one item from queue2. If queue2 is empty, remove two items from queue1. 
If queue1 contains less than two items, the number is not possible.
5. Finally empty all the queues into an auxiliary array. Sort the auxiliary array in 
decreasing order. Output the auxiliary array.*/

public class largestmultipleofthree {
	public void multthree(int[] array) throws Exception{
		LinkedQueue q0 = new LinkedQueue();
		LinkedQueue q1 = new LinkedQueue();
		LinkedQueue q2 = new LinkedQueue();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++){
			sum += array[i];
			if(array[i]%3==0){
				q0.enqueue(array[i]);	
			}else if(array[i]%3==1){
				q1.enqueue(array[i]);
			}else{
				q2.enqueue(array[i]);
			}
		}
		if(sum%3==0){
			while(!q0.isEmpty()){
				list.add((Integer) q0.dequeue());
			}
			while(!q1.isEmpty()){
				list.add((Integer) q1.dequeue());
			}
			while(!q2.isEmpty()){
				list.add((Integer) q2.dequeue());
			}
		}else if(sum%3 == 1){
			if(!q1.isEmpty()){
				q1.dequeue();
			}else{
				if(q2.size()>1){
					q2.dequeue();
					q2.dequeue();
				}else{
					throw new Exception("Not possible");
				}
			}
			while(!q0.isEmpty()){
				list.add((Integer) q0.dequeue());
			}
			while(!q1.isEmpty()){
				list.add((Integer) q1.dequeue());
			}
			while(!q2.isEmpty()){
				list.add((Integer) q2.dequeue());
			}
		}else{
			if(!q2.isEmpty()){
				q2.dequeue();
			}else{
				if(q1.size()>1){
					q1.dequeue();
					q1.dequeue();
				}else{
					throw new Exception("Not possible");
				}
			}
			while(!q0.isEmpty()){
				list.add((Integer) q0.dequeue());
			}
			while(!q1.isEmpty()){
				list.add((Integer) q1.dequeue());
			}
			while(!q2.isEmpty()){
				list.add((Integer) q2.dequeue());
			}
		}
		Collections.sort(list);
		for(int j=list.size()-1;j>=0;j--){
			System.out.print(list.get(j));
		}
	}
	
	public static void main(String[] args) throws Exception{
		largestmultipleofthree x = new largestmultipleofthree();
		int[] intarray = {8,1,7,6,0};
		//Sort array in increasing order and pass to method
		Arrays.sort(intarray);
		x.multthree(intarray);
	}
}
