
public class MaxProductSubArray {
	
	public static int maxProduct(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int maxSum = 1;
		int minSum = 1;
		int maxSoFar = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				maxSum = Math.max(maxSum * nums[i], nums[i]);
				minSum = Math.min(minSum * nums[i], nums[i]);
			} else {
				int temp = maxSum;
				maxSum = Math.max(minSum * nums[i], nums[i]);
				minSum = Math.min(temp * nums[i], nums[i]);
			}
			maxSoFar = Math.max(maxSoFar, maxSum);
		}
		return maxSoFar;
	}
	public static void main(String[] args){
		int[] arr = {-6, -3, -10, 0, 2};
		System.out.println(maxProduct(arr));
	}
}
