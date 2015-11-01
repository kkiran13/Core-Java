public class q15 {
	public static String fillspace(String str){
		String[] strarr = str.split("(?!^)");
		String s1 = "%20";
		String res = "";
		for(int i=0;i<strarr.length;i++){
			if(strarr[i].equals(" ")){
				res += s1;
			}else {
			res += strarr[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		String s = "abc d e f";
		System.out.println(fillspace(s));
	}
	
}
