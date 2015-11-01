/*Write a program to identify common elements or numbers between two given arrays. 
 * You should not use any inbuilt methods are list to find common values*/

public class commonbetweenarrays {
	public void comarr(int[] arr1,int[] arr2){
		for(int i:arr1){
			for(int j:arr2){
				if(i==j){
					System.out.print(i+" ");
					break;
				}
			} 
		}
	}
	public static void main(String[] args){
		int[] n1 = {1,2,3,4};
		int[] n2 = {2,2,4};
		commonbetweenarrays c = new commonbetweenarrays();
		c.comarr(n1,n2);
	}
}
