import java.util.Scanner;


public class coinchange {
	public static void main(String[] args){
		Scanner n1 = new Scanner(System.in);
		Scanner m1 = new Scanner(System.in);
		String n2 = n1.nextLine();
		String m2 = m1.nextLine();
		String[] strarr1 = n2.split(" ");
		int n = Integer.parseInt(strarr1[0]);
		int m = Integer.parseInt(strarr1[1]);
		String[] strarr2 = m2.split(" ");
		if(n==0){
			System.out.println("{}");
		}else{
			
		}
	}
}
