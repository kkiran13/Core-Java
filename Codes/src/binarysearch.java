import java.util.Scanner;

public class binarysearch {
 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        binarysearch mbs = new binarysearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Enter Key to search");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        System.out.println("Key position: "+mbs.binarySearch(arr, in));
    }
}
