/*Given array is already sorted, and it has duplicate elements. Write a program to 
 * remove duplicate elements and return new array without any duplicate elements. 
 * The array should contain only unique elements.*/
//eg: input = {2,3,6,6,8,9,10,10,10,12,12}, output- 2 3 6 8 9 10 12
public class remdupsfromsortedarray {
	public int[] remdups(int[] intarr){
		 int i=1;
		 int j=0;
		 if(intarr.length < 2){
	            return intarr;
			 //System.out.println(intarr[0]);
	        }
		 while(i < intarr.length){
			if(intarr[i] == intarr[j]){
				i++;
			}else{
				//System.out.println(++j);
				intarr[++j]=intarr[i++];
				//System.out.println(++j);
			}
		 }
		 int[] output = new int[j+1];
	        for(int k=0; k<output.length; k++){
		        output[k] = intarr[k];
	        	//System.out.print(k+" ,");
	        }
	        
		 return output;
	}

	public static void main(String[] args){
		remdupsfromsortedarray x = new remdupsfromsortedarray();
		int[] in = {2,3,6,6,8,9,10,10,10,12,12};
		//x.remdups(in);
		int[] output = x.remdups(in);
		for(int i:output){
            System.out.print(i+" ");
        }
	}
}
