public class question15 {
public void replaseSpaces(String str) {
    str = str.replaceAll(" ","%20");
    System.out.println(str);
}

public static void main(String[] args) {
	question15 tst = new question15();
   String str = "the dog  ";
   tst.replaseSpaces(str);  
}
}