import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;


public class uncoupled { //to find uncoupled number from a list. input is: 1,2,1,2,3
	 public static void main(String[] args) {
	        Scanner a = new Scanner(System.in);
	        System.out.println("Enter the elements separated by space");
	        String str = a.nextLine();
	        String[] strarr = str.split(" ");
	        int[] intarr = new int[str.length()];
	        
	        for(int i=0;i<strarr.length;i++){
	        	intarr[i] = Integer.parseInt(strarr[i]);
	        }
	        int result = 0;
	        
	        for(int i:intarr){
	        	result ^=i;  //XOR's all elements of array and result is uncoupled element
	        }
	        System.out.println(result);
	        
	    }
}
