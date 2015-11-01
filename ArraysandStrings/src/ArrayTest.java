import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args){
		
		int[] arr1 = {1,4,2,4};
		int[] arr2 = {1,4,2};
		SubsetArrayTest st = new SubsetArrayTest();
		boolean res = st.IsSubset(arr1, arr2, arr1.length, arr2.length);
		if(res){
			System.out.println("Array2 is subset of Array1");
		}else{
			System.out.println("Array2 is NOT a subset of Array1");
		}
		
		ArrayMethods am = new ArrayMethods();
		
		int[] intarr = {1, 4, 45, 6, 10, -8};
		Arrays.sort(intarr);
		int sum = 16;
		am.ArrayPairSum(intarr, sum);
		
		int[] arr = {2, 2, 3, 5, 2, 6,2};
		am.MajorityCandidate(arr);
		
		int[] oddarr = {1, 2, 3, 2, 3, 1, 3};
		System.out.println("Number Occuring Odd Times is: "+am.OddOccurenceNumber(oddarr));
		
		int[] sumarr = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Largest Sum Contiguous Subarray: "+am.LargestSumContiguousSubarray(sumarr));
		System.out.println("Largest Sum Contiguous Subarray (DP method): "+am.LargestSumDynamicProgramming(sumarr));
		
		int[] missarr = {1,2,3,4,6,7,8};
		System.out.println("Missing Number is: "+am.MissingNumber(missarr));
		System.out.println("Binary search Index is: "+am.BinarySearch(missarr, 0, missarr.length-1, 7));
		
		int[] pivarr = {3,4,5,1,2};
		System.out.println("Pivot Search: "+am.PivotedSearch(pivarr, 0, pivarr.length-1, 2));
		
		int[] revarr = {1,2,3,4,5,6};
		am.ReverseArray(revarr);
		
		int[] rotarr = {1,2,3,4,5,6,7};
		am.RotateArray(rotarr, 3);
		
		int[] leftshitarr = {1,2,3,4,5,6,7};
		am.LeftRotate(leftshitarr, 2);
		
		int[] revrotarr = {1,2,3,4,5,6,7};
		am.ReverseRotate(revrotarr, 2);
		
		int[] maxpair = {5,  5, 10, 40, 50, 35};
		System.out.print("\nMax Pair Not Adjacent is: "+am.MaxSumPairNotAdjacent(maxpair));
		
		int[] leadarr = {16, 17, 4, 3, 5, 2};
		am.ArrayLeader(leadarr);
		
		int[] invcountarr = {2, 4, 1, 3, 5 };
		am.InversionCount(invcountarr);
		
		int[] minpairarr = {1, 60, -10, 70, -80, 85};
		am.MinSumPairClosestToZero(minpairarr);
		
		int[] smallarr = {10,6,71,14,2};
		am.FirstAndSecondSmallest(smallarr);
		
		int[] segarr = {1,0,1,1,0};
		am.SegregateZeroesAndOnes(segarr);
		
		int[] a1 = {1, 2, 3, 5, 6};
		int[] a2 = {2, 3, 4};
		am.UnionArray(a1, a2);
		am.IntersectionArray(a1, a2);
		
		int[] searr = {12, 34, 45, 9, 8, 90, 3};
		System.out.println();
		am.SegregateEvenAndOdd(searr);
		
		/*You are given an array of n+2 elements. All elements of the array are in 
		 *range 1 to n. And all elements occur once except two numbers which occur twice.
		 *Find the two repeating numbers.
For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
The above array has n + 2 = 7 elements with all elements occurring once except 2 and 4 
which occur twice. So the output should be 4 2.*/
		System.out.println();
		int[] reparr = {4, 2, 4, 5, 2, 3, 1};
		am.TwoRepeatingElements(reparr);
		int[] reparr1 = {4, 2, 4, 5, 2, 3, 1};
		System.out.println();
		am.TwoRepeat(reparr1,reparr1.length);
	}
}
