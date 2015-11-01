import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class nthfibo {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		System.out.println("\nEnter the number");
		String line = br.readLine();
		System.out.println("Enter the number");
		int n = Integer.parseInt(line);
		int f = 1;
		int g = 0;
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Fibonacci series of "+n+" is:");
		System.out.println(1);
		for(int i=1;i<=n;i++){
			f = f+g;
			g = f-g;
			System.out.println(f);
			list.add(g);
		}
		System.out.println();
		System.out.println(n+"th Fibonacci number is:");
		System.out.println(list.get(n-1));
	}
	}
}
