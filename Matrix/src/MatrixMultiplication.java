
public class MatrixMultiplication {
	
	public static int[][] Mult(int[][] a,int[][] b){
		int rowlen1 = a.length;
		int rowlen2 = b.length;
		int collen1 = a[0].length;
		int collen2 = b[0].length;
		int res[][] = new int[rowlen1][collen2]; 
		if(rowlen1 != collen2){
			//int[][] res1 = {{0,0},{0,0}};
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
	public static void main(String[] args){
		int[][] a = {{1,2,},{3,4}};
		int[][] b = {{1,2},{3,4}};
		int[][] res = Mult(a,b);
		for(int i=0;i<res.length;i++){
			for(int j=0; j<res[0].length;j++){
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
