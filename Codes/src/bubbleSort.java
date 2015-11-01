import java.util.Scanner;

public class bubbleSort {
	public void Bubblesort(int[] array){ //O(n^2)
        int k;
        int cnt = 0;
        for (int m = array.length; m >= 0; m--) {
            for (int i = 0; i < array.length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                	cnt++;
                    swap(array,i, k);
                }
            }
        }
        System.out.println();
        System.out.println(cnt);
        PrintArray(array);
	}
	
	public static void swap(int[] arr, int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void PrintArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		bubbleSort bs = new bubbleSort();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] sarr = s.split(" ");
		int[] arr = new int[sarr.length];
		for(int i=0;i<sarr.length;i++){
			arr[i] = Integer.parseInt(sarr[i]);
		}
		bs.Bubblesort(arr);
	}
}
