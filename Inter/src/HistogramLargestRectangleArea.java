import java.util.Stack;


public class HistogramLargestRectangleArea {
	public static int largestRectArea(int[] height) {
		int max = 0;
		if (height.length == 0 || height == null) {
			return 0;
		}
		int i = 0;
		while (i < height.length) {
			int h = height[i];
			max = Math.max(h * 1, max);
			int j = i - 1;
			while (j >= 0) {
				if (height[j] < h) {
					h = height[j];
					max = Math.max(height[j] * (i - j + 1), max);
				} else {
					max = Math.max(h * (i - j + 1), max);
				}
				j--;
			}
			i++;
		}
		return max;
	}
	
	public static int largestRectangleAreaStack(int[] height) { //O(n)
		if (height == null || height.length == 0) {
			return 0;
		}
	 
		Stack<Integer> stack = new Stack<Integer>();
	 
		int max = 0;
		int i = 0;
	 
		while (i < height.length) {
			//push index to stack when the current height is larger than the previous one
			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
			//calculate max value when the current height is less than the previous one
				int p = stack.pop();
				int h = height[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
	 
		}
	 
		while (!stack.isEmpty()) {
			int p = stack.pop();
			int h = height[p];
			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * w, max);
		}
	 
		return max;
	}
	
	public static void main(String[] args){
		int[] arr = {2,1,5,6,2,3};
		System.out.println(largestRectArea(arr));
		System.out.println(largestRectangleAreaStack(arr));
	}
}
