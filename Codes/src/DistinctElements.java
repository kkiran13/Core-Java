/*The below example shows how to avoid duplicate elements from an array and display only 
 * distinct elements. Please use only arrays to process it. - See more at: 
 * http://www.java2novice.com/java-interview-programs/distinct-elements/#sthash.zzQNNQxO.dpuf*/

public class DistinctElements {
	public void dist(int[] intarr){
		
		int len = intarr.length;
		for(int i=0;i<len;i++){
			boolean flag = false;
			for(int j=0;j<i;j++){ //checks if equals, so sets flag to true meaning this number is already parsed in the array
				if(intarr[i]==intarr[j]){
					flag = true;
					break;
				}
			}
		if(!flag){
			System.out.print(intarr[i]+" ");
		}
	}
  }
	
	public static void main(String[] args){
		DistinctElements avd = new DistinctElements();
		int[] in = {2,3,6,6,8,9,10,10,10,12,12};
	    avd.dist(in);
	}
	
}
