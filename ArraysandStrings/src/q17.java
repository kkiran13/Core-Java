
public class q17{
	public static void setzeromatrix(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					column[j]=1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]==1 || column[j]==1){
					matrix[i][j]=0;
				}
			}
		}
		
	}
	public static void main(String[] args){
		int[][] matrix = {{1,2,3},{0,3,6}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);				
			}
			System.out.println();
		}
		System.out.println();
		setzeromatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);				
			}
			System.out.println();
		}
	}
}
