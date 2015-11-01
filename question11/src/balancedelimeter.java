import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
 
 
public class balancedelimeter {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);
        String str = terminalInput.nextLine();
        
        Map list = new HashMap();
        list.put('{','}');
        list.put('(',')');
        list.put('[',']');
        String result = "True";
        //System.out.println("True");
        
        Stack stack = new Stack();
        
        for (Character c:str.toCharArray()){
        	if (list.containsKey(c)){
            	stack.push(c);
            }
            else { 
                if ( (stack.isEmpty()) || (!Objects.equals(c, list.get(stack.pop()))) ) { //list.get("[") gets value mapped to key
                	result = "False";
                	//System.out.println("False");
                    break;
                }
            }
        }
        
        if (!stack.isEmpty()) result = "False"; //checks for a single char input like "["
        //System.out.println("False");
        System.out.println(result);
        
    }
    
}