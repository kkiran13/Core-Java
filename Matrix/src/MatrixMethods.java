
public class MatrixMethods {
	public boolean SearchInRowAndColSortedMatrix(int[][] matrix, int key){
		int rowlen = matrix.length;
		int collen = matrix[0].length;
		int i=0; int j=collen-1;
	    while(i<rowlen && j>=0){
	    	if(key == matrix[i][j]){
	    		System.out.println("Found at: "+i+" row and "+j+" column");
	    		return true;
	    	}else if(key < matrix[i][j]){
	    		j--;
	    	}else{
	    		i++;
	    	}
	    }
	    return false;
		
	}
	
	public void BooleanMatrixConvert(int[][] matrix){
		int rowlen = matrix.length;
		int collen = matrix[0].length;
		int[] row = new int[rowlen];
		int[] col = new int[collen];
		for(int i=0;i<rowlen;i++){
			row[i] = 0;
		}
		for(int i=0;i<collen;i++){
			col[i] = 0;
		}
		for(int i=0;i<rowlen;i++){
			for(int j=0;j<collen;j++){
				if(matrix[i][j]==1){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<rowlen;i++){
			for(int j=0;j<collen;j++){
				if(row[i] == 1 || col[j] == 1){
					matrix[i][j]=1;
				}
		}
	  }
	  PrintMatrix(matrix);
	}
	
	public void PrintMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//Not Printing bottom left element
	public void PrintMatrixSpiral(int[][] matrix){
		int x = matrix.length;
		int y = matrix[0].length;
		int currminrow = 0,currmaxrow = x-1;
		int currmincol = 0,currmaxcol = y-1;
		int i;
		int count=x*y;
		while(count>0)
		{

		for(i=currminrow;i<=currmaxcol;i++)
		{
		count --;
		System.out.print(matrix[currminrow][i]+" ");
		}
		
		for(i=currminrow+1;i<=currmaxrow;i++)
		{
		count --;
		System.out.print(matrix[i][currmaxcol]+ " ");
		}
		
		for(i=currmaxcol-1;i>=currmincol;i--)
		{
		count --;
		System.out.print(matrix[currmaxrow][i]+ " ");
		}
		
		for(i=currmaxrow-1;i>currminrow;i--)
		{
		count --;
		System.out.print(matrix[i][currmincol]+ " ");
		}
		currminrow++;
		currmincol++;
		currmaxcol--;
		currmaxrow--;

		}
	}
	
    
 /*1) Construct a sum matrix S[R][C] for the given M[R][C].
   a)	Copy first row and first columns as it is from M[][] to S[][]
   b)	For other entries, use following expressions to construct S[][]
       If M[i][j] is 1 then
          S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1
       Else /*If M[i][j] is 0
          S[i][j] = 0
   2) Find the maximum entry in S[R][C]
	 3) Using the value and coordinates of maximum entry in S[i], print 
 	 	sub-matrix of M[][]*/
	
	public void FindMaxSquareOnesMatrix(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] result = new int[m][n];
        int max = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0){
                    result[i][j] = matrix[i][j];
                }else {
                    if(matrix[i][j] == 0){
                        result[i][j] = 0;
                    }else{
     result[i][j] = Math.min(result[i-1][j-1],Math.min(result[i-1][j],result[i][j-1]))+1;
                    }
                }
                        if(max<result[i][j]){
                            max = result[i][j];
                        }
            }
        }
        System.out.println("Max Square is of Order: "+max+"*"+max);

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print("1 ");
            }
            System.out.println("");
        }
    }
	
	public void RowWithMaxOnes(int[][] matrix){
		int rowlen = matrix.length;
		int collen = matrix[0].length;
		int max = 0;
		int row = 0;
		for(int i=0;i<rowlen;i++){
			int count = 0;
			for(int j=0; j<collen;j++){
				if(matrix[i][j]==1){
					count++;
				}
			}
			if(count > max){
				max = count;
				row = i;
			}
		}
		System.out.println("Row with Max 1s is: "+row+" with count of 1s "+max);
	}
	
	public void PrintDiagonal(int[][] matrix){
		int rowlen = matrix.length;
		int collen = matrix[0].length;
		for(int i=0;i<rowlen;i++){
			int k = i;int l = 0;
			while(k>=0 && l<collen){
				System.out.print(matrix[k][l]+" ");
				k--;l++;
			}
			System.out.print("\n");
		}
		for(int i=0;i<collen;i++){
			int k = rowlen-1;int l = i;
			while(k>=0 && l<collen){
				System.out.print(matrix[k][l]+" ");
				k--;l++;
			}
			System.out.print("\n");
		}
	}
}
