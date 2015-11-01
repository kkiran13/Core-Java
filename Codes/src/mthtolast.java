import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class mthtolast { // returns the Mth element from the end of a list. Uses Linked list for the purpose
	public static void main(String[] args) throws Exception {
		 LinkedList list = new LinkedList();
		 System.out.println("Enter index");
		 //Scanner b = new Scanner(System.in);
		 //String m1 = b.next();
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
		 int ind = Integer.parseInt(line);
		 System.out.println("Enter the list of numbers separated by space");
		 //Scanner a = new Scanner(System.in);
		 String str=br.readLine();
	        
	        String[] strarr = str.split(" ");
	        
	        for(int i=0;i<strarr.length;i++){
	        	list.push(Integer.parseInt(strarr[i]));
	        }
	        
//	    System.out.println();
	    int len = list.size()-1;
	    if(ind<=len){
	    System.out.println(list.get(ind-1));
	    }
	    else{
	    	System.out.println("NIL");
	    }
	}
}
