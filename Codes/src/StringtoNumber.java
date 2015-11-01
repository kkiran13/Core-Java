public class StringtoNumber {
 
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        //System.out.println(zeroAscii);
        for(char c:ch){
        	//System.out.println(c);
            int tmpAscii = (int)c;
            //System.out.println(tmpAscii);
            sum = (sum*10)+(tmpAscii-zeroAscii); //remember this step
        }
        return sum;
    }
     
    public static void main(String a[]){
         
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
    }
}