import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int len = Integer.parseInt(br.readLine());
			int[][] mat = new int[len][len];
			for(int i=0;i<len;i++){
				String[] strarr = br.readLine().split(" ");
				for(int j=0;j<len;j++){
					mat[i][j] = Integer.parseInt(strarr[j]);
				}
			}
		   int res1 = 0;
		   for(int i=0;i<len;i++){
			   res1 += mat[i][i];
		   }
		   
		   int res2 = 0;
		   int rownum = 0;
		   for(int i=len-1;i>=0;i--){
			   res2 += mat[rownum][i];
			   rownum++;
		   }
		   
		   System.out.println(Math.abs(res2-res1));
	   }
	}
