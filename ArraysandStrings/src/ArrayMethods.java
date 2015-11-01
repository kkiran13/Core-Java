public class ArrayMethods {
	public void ArrayPairSum(int[] arr,int sum){
		int l = 0;
		int len = arr.length;
		int r = len-1;
		boolean flag = false;
		while(l<r){
			if(arr[l]+arr[r]==sum){
				flag = true;
				System.out.println("Pair with Sum as "+sum+": "+arr[l]+" and "+arr[r]);
			}else if(arr[l]+arr[r] < sum){
				l++;
			}else{
				r--;
			}
		}
		if(!flag){
			System.out.println("No Pair exists with the given sum");
		}
	}
	/* (Using Moore’s Voting Algorithm)

This is a two step process.
1. Get an element occurring most of the time in the array. 
This phase will make sure that if there is a majority element then it will return that only.
2. Check if the element obtained from above step is majority element.*/
	public void MajorityCandidate(int[] arr){
			int maj_index = 0;
			int count = 1;
	        for(int i=1;i<arr.length;i++){
	        	if(arr[maj_index]==arr[i]){
	        		count++;	
	        	}else{
	        		count--;
	        		if(count == 0){
	        			maj_index = i;
	        			count = 1;
	        		}
	        	}
	        }
	       int num = arr[maj_index];
	       System.out.println(num);
	       int cnt = 0;
	       for(int j=0; j<arr.length;j++){
	    	   if(arr[j] == num){
	    		   cnt++;
	    	   }
	       }
	       if(cnt > arr.length/2){
	    	   System.out.println("Majority Candidate exists: "+num);
	       }else{
	    	   System.out.println("No Majority Candidate");
	       }
	}
	
	public int OddOccurenceNumber(int[] arr){
		int res = 0;
		for(int i=0;i<arr.length;i++){
			res ^= arr[i];
		}
		return res;
	}
	
	public int LargestSumContiguousSubarray(int[] arr){ // Kadane's Algorithm
		int max_ending_here = 0;
		int max_so_far = 0;
		for(int i=0;i<arr.length;i++){
			max_ending_here += arr[i];
			if(max_ending_here < 0){
				max_ending_here = 0;
			}else if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}
	
	public int max(int a,int b){
		return (a>b)?a:b;
	}
	
	public int LargestSumDynamicProgramming(int[] arr){ // Works when all numbers are negative
		int max_ending_here = arr[0];
		int max_so_far = arr[0];
		for(int i=1;i<arr.length;i++){
			max_ending_here = max(arr[i],max_ending_here+arr[i]);
			max_so_far = max(max_so_far,max_ending_here);
		}
		return max_so_far;
	}
	
	public int MissingNumber(int[] arr){
		int n = arr[arr.length-1]; //Last Number to get the range
		int sum1 = (n*(n+1))/2;
		int sum2 = 0;
		for(int i=0;i<arr.length;i++){
			sum2 += arr[i];
		}
		return sum1-sum2;
	}
	
	public int BinarySearch(int[] arr,int low, int high, int key){
		int mid = low+(high-low)/2;
		if (high<low){
			return -1;
		}
		if(key == arr[mid]){
			return mid;
		}else if(key < arr[mid]){
			return BinarySearch(arr, low, mid-1, key);
		}else{
			return BinarySearch(arr,mid+1,high,key);
		}
	}
	
	public int FindPivot(int[] arr){ //return index whose element is greater than element at next index
		int pivot = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr[i+1]){
			    pivot = i;
				break;
			}
		}
		return pivot;
	}
	/* I rotate the sorted array at some pivot unknown to you beforehand. 
	   So for instance, 1 2 3 4 5 might become 3 4 5 1 2.*/
	
	public int PivotedSearch(int[] arr,int low,int high,int key){
		int pivot = FindPivot(arr);
		int first = arr[0];
		if(key == arr[pivot]){
			return pivot;
		}else if(key == first){
			return 0;
		}
		else if(key>first){
			return BinarySearch(arr, low, pivot-1, key);
		}else{
			return BinarySearch(arr, pivot+1, high, key);
		}
	}
	
	public void ReverseArray(int[] arr){
		int l = 0;
		int h = arr.length-1;
		while(h > l){
		    int temp = arr[h];
		    arr[h] = arr[l];
		    arr[l] = temp;
		    l++;
		    h--;
		}
		System.out.print("Reversed Array is: ");
		Printarray(arr);
	}
	
	public void Printarray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public void RotateArray(int[] arr,int d){
		int[] temp = new int[d];
		int len = arr.length-1;
		for(int i=0;i<d;i++){
			temp[i] = arr[i];
		}
		for(int i=d;i<arr.length;i++){
			arr[i-d]=arr[i];
		}
		for(int k=d-1;k>=0;k--){
			arr[len] = temp[k];
			len--;
		}
		System.out.print("\nRotated Array is: ");
		Printarray(arr);
	}
	
	public void LeftRotate(int[] arr,int d){
		for(int i=0;i<d;i++){
			RotateleftByOne(arr);
		}
		System.out.print("\nRotate By Shift: ");
		Printarray(arr);
	}
	public void RotateleftByOne(int[] arr){
		int len = arr.length;
		int temp = arr[0];
		for(int i=0;i<len-1;i++){
			arr[i] = arr[i+1];
		}
		arr[len-1] = temp; 
	}
	
	public void ReverseRotate(int[] arr,int d){
		int len = arr.length-1;
		Reversearr(arr,0,d-1);
		Reversearr(arr, d, len);
		Reversearr(arr, 0, len);
		System.out.print("\nRotate by Reverse: ");
		Printarray(arr);
	}
	public void Reversearr(int[] arr,int start,int end){
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	//{5,  5, 10, 40, 50, 35};
	public int MaxSumPairNotAdjacent(int[] arr){ //O(n)
		int excl = 0;
		int incl = arr[0];
		int excl_new;
		for(int i=1;i<arr.length;i++){
			excl_new = max(incl,excl);
			incl = excl + arr[i];
			excl = excl_new;
		}
		return max(incl,excl);
	}

	//Leaders are elements whose value is greater than all elements to the right of it in the array
	public void ArrayLeader(int[] arr){ 
		int max = 0;
		System.out.print("\nLeaders are: ");
		for(int i=arr.length-1;i>=0;i--){ //Last element is always a leader
			if(arr[i]>max){
				System.out.print(arr[i]+" ");
				max = arr[i];
			}
		}
	}
	//count number of elements which are on right side of it and are smaller than it.
	public void InversionCount(int[] arr){
		int invcount = 0;
		System.out.print("\nInversion Pairs are:");
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					System.out.print("("+arr[i]+","+arr[j]+")");
					invcount++;
				}
			}
		}
		System.out.print(" and Inversion Count is: "+invcount);
	}
	
	public void MinSumPairClosestToZero(int[] arr){
		int min = arr[0]+arr[1]; //Just initialize to some value so that abs gives some value rather than 0
		int a = 0;
		int b = 0;
		int sum;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				sum = arr[i]+arr[j];
				if(Math.abs(sum) < Math.abs(min)){
					a = i;
					b = j;
					min = sum;
				}
			}
		}
		System.out.println("\nMinimum Sum Pair Closest to Zero is: "+arr[a]+" and "+arr[b]+". The Minimum sum value is: "+min);
	}
	
	public void FirstAndSecondSmallest(int[] arr){
		int first = arr[0];
		int second = arr[1];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<first){
				second = first;
				first = arr[i];
			}else if(arr[i] > first && arr[i]<second){
				second = arr[i];
			}
		}
		System.out.println("Smallest is: "+first+". Second smallest is: "+second);
	}
	
	public void SegregateZeroesAndOnes(int[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left < right){
			while(arr[left]==0 && left<right){
				left++;
			}
			while(arr[right]==1 && left<right){
				right--;
			}
			if(left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.print("Segregated Array is: ");
		Printarray(arr);
	}
	
	public void UnionArray(int[] arr1,int[] arr2){
		int len1 = arr1.length;
		int len2 = arr2.length;
		int i=0; int j=0;
		System.out.print("\nUnion is: ");
		while(i<len1 && j<len2){
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}else if(arr1[i] < arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
			}else if(arr1[i] > arr2[j]){
				System.out.print(arr2[j]+" ");
				j++;
			}
		}
		while(i<len1){
			System.out.print(arr1[i++]+" ");
		}
		while(j<len2){
			System.out.print(arr2[j++]+" ");
		}
	}
	
	public void IntersectionArray(int[] arr1,int[] arr2){
		int len1 = arr1.length;
		int len2 = arr2.length;
		int i=0; int j=0;
		System.out.print("\nIntersection is: ");
		while(i<len1 && j<len2){
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}else if(arr1[i] < arr2[j]){
				i++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}
		}
	}
	
	public void SegregateEvenAndOdd(int[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			while(arr[left]%2 == 0 && left<right){
				left++;
			}
			while(arr[right]%2 == 1 && left<right){
				right--;
			}
			if(left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;	
				left++;
				right--;
			}
		}
		Printarray(arr);
	}
	
	public int factorial(int n){
		return (n==0)? 1 : n*factorial(n-1);
	}
	
/*Traverse the array. Do following for every index i of A[].
{
check for sign of A[abs(A[i])] ;
if positive then
   make it negative by   A[abs(A[i])]=-A[abs(A[i])];
else  // i.e., A[abs(A[i])] is negative
   this   element (ith element of list) is a repetition
}*/
	
	public void TwoRepeatingElements(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])] > 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}else{
				System.out.print(Math.abs(arr[i])+" ");
			}
		}
	}
	
/*Traverse the array once. While traversing, keep track of count of all elements in the 
 * array using a temp array count[] of size n, when you see an element whose count is 
 * already set, print it as duplicate.*/
	
	public void TwoRepeat(int[] arr, int size){
		int[] countarr = new int[size];
		for(int i=0;i<size;i++){
			if(countarr[arr[i]] == 1){
				System.out.print(arr[i]+" ");
			}else{
				countarr[arr[i]]++;
			}
		}
	}
}