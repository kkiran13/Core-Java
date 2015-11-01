import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class PoisonnousPlants {
	
	public static int Days(int[] arr){
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			arl.add(arr[i]);
		}
		boolean flag = true;
		int count  = 0;
		while(flag){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(arl.get(0));
			int x = 0;
			for(int i=1;i<arl.size();i++){
				if(arl.get(i) < arl.get(i-1)){
					temp.add(arl.get(i));
				}else{
				  x = 1;
				}
			}
			if(x==0){
				flag = false;
			}
			if(arl.size() == temp.size()){
				break;
			}
			 arl = temp;
			 count++;
		}
		return count;
	}
	
	public static boolean AscendingCheck(ArrayList<Integer> arl){
		for(int i=1;i<arl.size();i++){
			System.out.println(arl.get(i)+" "+arl.get(i-1));
			if(arl.get(i)>arl.get(i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("Enter Input: First line is size of array and next line is elements of array separated by space");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] ar = bf.readLine().split(" ");
		int[] arr = new int[ar.length];
		for(int i=0;i<ar.length;i++){
			arr[i] = Integer.parseInt(ar[i]);
		}
		//int[] arr = {6,5,8,4,7,10,9};  // ans is 2
		//int[] arr = {10,3,9,7,4,6,5};  // ans is 3
		System.out.println(Days(arr));
	}
}
