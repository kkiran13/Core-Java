
public class matrix {
public static void replace(int[][] mat){
	int[] row = new int[mat.length];
	int[] col = new int[mat[0].length];
	
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[0].length;j++){
			if(mat[i][j] == 0){
				row[i] = 1;
				col[j] = 1;
			}
		}
	}
	
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[0].length;j++){
		if((row[i] == 1 || col[j] == 1)){
			mat[i][j] = 0;
		}
	}	
		}
}
	public static void main(String[] args){
		int[][] ma = {{1,1},{2,0}};
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) { 
			 System.out.print(" "+ma[i][j]);
			
			}
			 System.out.println();
			}
		replace(ma);
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) { 
			 System.out.print(" "+ma[i][j]);
			
			}
			 System.out.println();
			}
	}
}
