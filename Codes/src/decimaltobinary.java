public class decimaltobinary {  //converts decimal to binary numbers
  
    public int DecToBin(int number){
    	String res = "";
    	int n = number;
    	while(n > 0){
    		res = (n%2)+res;
    		n = n/2;
    	}
    	return Integer.parseInt(res);
    }
     
    public static void main(String a[]){
		int in = 10;
		decimaltobinary db = new decimaltobinary();
		System.out.println("Input decimal is : "+in);
		System.out.println(db.DecToBin(in));
    }
    
}