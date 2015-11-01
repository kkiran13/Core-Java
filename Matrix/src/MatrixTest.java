
public class MatrixTest {
	public static void main(String[] args){
		int[][] mat = {   {10, 20, 30, 40},
                		  {15, 25, 35, 45},
                		  {27, 29, 37, 48},
                		  {32, 33, 39, 50},
              		  };
		
		System.out.println(mat[0][2]);
		MatrixMethods sr = new MatrixMethods();
		boolean res = sr.SearchInRowAndColSortedMatrix(mat,30);
		System.out.println("\nSearch a key in a sorted row matrix:");
		if(res){
			System.out.println("Key Found");
		}else{
			System.out.println("Key Not Found");
		}
		
		int[][] boolmat = {   {1, 0, 0, 0},
							  {0, 0, 0, 0},
							  {0, 1, 0, 0},
    		  			  };
		System.out.println("Converted Boolean Matrix with all 1s in any row or column having a one:");
		sr.BooleanMatrixConvert(boolmat);
		System.out.println();
		int[][] spiralmat = { {1,  2,  3,  4,  5,  6},
							  {7,  8,  9,  10, 11, 12},
							  {13, 14, 15, 16, 17, 18}
			  			    };
		System.out.println("\nSpiral Traversal of Matrix is:");
		sr.PrintMatrixSpiral(spiralmat);
		System.out.println();
		
		int[][] findonesmat = { {0,1,1,1,1},
				 			    {0,1,1,1,1},
				 			    {1,1,1,1,1}
				 			  };
		System.out.println("\nLargest Square with 1s in Matrix:");
		sr.FindMaxSquareOnesMatrix(findonesmat);
		System.out.println("\nFind Max Ones Row of Matrix:");
		sr.RowWithMaxOnes(findonesmat);
		int[][] prindiagmat = {{1,2,3,4},
							   {5,6,7,8},
				               {9,10,11,12},
				               {13,14,15,16},
				               {17,18,19,20}};
		System.out.println("\nDiagonal Matrix Printing:");
		sr.PrintDiagonal(prindiagmat);
	}
}
