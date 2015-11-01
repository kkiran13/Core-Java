import java.util.Scanner;


public class MultNew {
	
	public static int[][] Mult(int[][] a,int[][] b){
		int rowlen1 = a.length;
		int rowlen2 = b.length;
		int collen1 = a[0].length;
		int collen2 = b[0].length;
		int res[][] = new int[rowlen1][collen2]; 
		if(collen1 != rowlen2){
			System.out.println("Dimensions do not match for Matrix Multiplication");
			return null;
		}
		for(int i=0;i<rowlen1;i++){
			for(int j=0;j<collen2;j++){
				int sum = 0;
				for(int k=0;k<collen1;k++){
					sum = sum + a[i][k]*b[k][j];
					res[i][j] = sum;
				}
			}
		}
		return res;
	}
	
	/*| 1 2 3 | |  7  8 |
	  | 4 5 6 | |  9 10 |
                | 11 12 |
     */
	
	public static void main(String[] args){
		int[][] a = {{-11,6,23},{9,-17,11}};
		int[][] b = {{ -1,-21,13,20 },{10,6,-8,-9},{3,13,14,24}};
		int[][] c = {{-19,11,-4,11},{ 23,14,-13,15},{6,20,-22,16},{6,23,-22,18},{-11,-10,21,19}};
		int[][] res1 = Mult(a,b);
		int[][] res = Mult(res1,c);
		for(int i=0;i<res.length;i++){
			for(int j=0; j<res[0].length;j++){
				System.out.print("|");
				if(res[i][j] > 0){
					String s = String.valueOf(res[i][j]);
					if(s.length() == 1){
						System.out.print("    "+res[i][j]+" ");
					}else if(s.length() == 2){
						System.out.print(" "+res[i][j]+"  ");
					}else 
						System.out.print(res[i][j]+" ");
					}
				}
			System.out.print(" |\n");
		}		
	}
/*|  140  566 131 278 |
  | -146 -148 407 597 |
  
|    7  406 -266  539  511 |
| -254 -216 -608   50   78 |
| -212 -454 -314 -328 -286 |
  */
}