
public class stockspanstack {  //O(n)
	
	public void span(int[] arr){
		int[] res = new int[arr.length];
		BoundedStack st = new BoundedStack(arr.length);
		st.push(0);
		res[0] = 1; // span of 1st stock is always 0
		
		for(int i=1;i<arr.length;i++){
			while(!st.isEmpty() && arr[i] >= arr[(int)st.peek()]){
				st.pop();
			}
			res[i] = (st.isEmpty())?(i+1):(i-(int)st.peek());
			st.push(i);
		}
		
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	
	public static void main(String[] args){
		stockspanstack sp = new stockspanstack();
		int[] arr =  {10, 4, 5, 90, 120, 80};
		sp.span(arr);
	}
}
