import java.util.HashSet;

public class palindromdigits {

public int palin (String s)
{
	if (s == null || s.length() == 0)
		return 0;
	HashSet<Character> hs = new HashSet<Character>();
	for (int i = 0; i < s.length(); i++)
{
		if (!hs.contains(s.charAt(i)))
			hs.add(s.charAt(i));
		else
			hs.remove(s.charAt(i));
}
    System.out.println(" char is: "+hs.toString());
	return hs.size() == 0 ? 0 : hs.size() - 1;
}

   	public static void main(String[] args){
	   palindromdigits x = new palindromdigits();
	   System.out.println(x.palin("malayal"));
   }
}