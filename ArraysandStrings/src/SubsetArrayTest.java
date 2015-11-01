import java.util.Arrays;

//check if array2 is subset of array1
public class SubsetArrayTest {
	public boolean IsSubset(int[] arr1, int[] arr2, int m, int n){
		int i = 0, j = 0;
		if(m<n){
			return false;
		}
		//quicksort(arr1,0,m-1);
		//quicksort(arr2,0,n-1);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<m && j<n){
			if(arr1[i] == arr2[j]){
				i++; 
				j++;
			}else if(arr1[i]<arr2[j]){
				i++;
			}else if(arr1[i] > arr2[j]){
				return false;
			}
		}
		if(j < n){
			return false;
		}else{
			return true;
		}
	}
	
	public void quicksort(int[] arr,int si, int ei){
		int p;
		if(si < ei){
			p = partition(arr,si,ei);
			quicksort(arr,si,p-1);
			quicksort(arr,p+1,ei);
		}
	}
	public int partition(int[] arr,int si,int ei){
		int pivot = arr[ei];
		int i = si - 1;
		int j;
		for(j=si;j<=ei-1;j++){
			if(arr[j]<=pivot){
				i++;
				swap(arr[i],arr[j]);
			}
		}
		swap(arr[i+1],arr[ei]);
		return (i+1);
	}
	public void swap(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}
