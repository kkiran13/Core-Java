//Find the top 2 max values
//Also find bottom 2 min values
// check the products and see which is greater and print the pair

public class MaxProductPair {
	public static void MaxProdPair(int[] arr){
		int maxpos = 0;
		int secmaxpos = 0;
		int maxmin = 0;
		int secmaxmin = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > maxpos){
				secmaxpos = maxpos;
				maxpos = arr[i];
			}else if(arr[i] > secmaxpos){
				secmaxpos = arr[i];
			}else if(arr[i] < maxmin){
				secmaxmin = maxmin;
				maxmin = arr[i];
			}else if(arr[i] < secmaxmin){
				secmaxmin = arr[i];
			}
		}
		if((maxpos*secmaxpos) > (maxmin*secmaxmin)){
			System.out.println("("+maxpos+","+secmaxpos+") = "+maxpos*secmaxpos);
		}else if((maxpos*secmaxpos) < (maxmin*secmaxmin)){
			System.out.println("("+maxmin+","+secmaxmin+") = "+maxmin*secmaxmin);
		}else{
			System.out.println("("+maxpos+","+secmaxpos+") and "+"("+maxmin+","+secmaxmin+") = "+maxpos*secmaxpos);
		}
	}
	public static void main(String[] args){
		int[] arr = {-1,-3,-4,2,0,-5};
		//int[] arr = {-1,-8,-9,9,8};
		MaxProdPair(arr);
	}
	
}
