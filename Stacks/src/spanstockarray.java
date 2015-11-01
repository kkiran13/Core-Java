// Find span for which stock process is increasing
public class spanstockarray {
	public void span(int[] arr){
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=i;j>=0;j--){
				if(arr[j] <= arr[i]){
					count += 1;
				}else{
					break;
				}
			}
		 System.out.println(arr[i]+"-->"+(count));
		}
	}
	
	public static void main(String[] args){
		spanstockarray sp = new spanstockarray();
		int[] arr =  {10, 4, 5, 90, 120, 80};
		sp.span(arr);
	}
}
