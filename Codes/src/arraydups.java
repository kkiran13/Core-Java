import java.io.BufferedReader;
import java.io.InputStreamReader;

/*The below example shows how to avoid duplicate elements from an array and display only 
 * distinct elements. Please use only arrays to process it. - See more at: 
 * http://www.java2novice.com/java-interview-programs/distinct-elements/#sthash.zzQNNQxO.dpuf*/

public class arraydups{
	public void dups(int[] intarr){
		
		int len = intarr.length;
		for(int i=0;i<len;i++){
			boolean flag = false;
			loop: for(int j=0;j<i;j++){ //checks if equals, so sets flag to true meaning this number is already parsed in the array
				//System.out.println();
				//System.out.println("i is: "+i+" and j is: "+j);
				if(intarr[i]==intarr[j]){
					flag = true;
					break loop;
				}
			}
		if(flag){
			System.out.print(intarr[i]+" ");
		}
	}
  }
	
	public static void main(String[] args) throws Exception{
		arraydups avd = new arraydups();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array elements separated by space");
		String[] inarr = br.readLine().split(" ");
		int[] intarray = new int[inarr.length];
		for(int i=0;i<intarray.length;i++){
			intarray[i]=Integer.parseInt(inarr[i]);
		}
	    avd.dups(intarray);
	}
	
}
