public class question11 {
	public static boolean unique(String str){
		boolean[] x = new boolean[128];
		for(int i = 0; i<str.length(); i++){
			int y = str.charAt(i);
			System.out.println(x[y]);
			if(x[y]==true) return false;
			else
			x[y] = true;
			}
		return true;
	}

public static void main(String[] args){
	String[] words = {"advdb","bads"};
	int index = 0;
	try{for (String w:words){
		//System.out.println(index);
		System.out.println("word is "+words[index]);
		System.out.println(w + ": "+ unique(w));
		index = index + 1;
	}
	} catch (Exception e){};
	try{String abc = words[index];
	System.out.println("abc is "+abc);
	}catch(Exception e){};	
}
}
