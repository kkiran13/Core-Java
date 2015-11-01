
public class AnagramPairsInArray {
	
	public static boolean AreAnagrams(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] count = new int[256];
			for(int i=0;i<str1.length();i++){
				count[str1.charAt(i)]++;
				count[str2.charAt(i)]--;
			}
			
		for(int i=0;i<count.length;i++){
			if(count[i]!=0){
				return false;
			}
		}
		return true;
	}
	
	public static void findAllAnagrams(String[] arr, int len){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(AreAnagrams(arr[i],arr[j])){
					System.out.println(arr[i]+" is anagram of "+arr[j]);
				}
			}
		}
	}
	
	public static void main(String[] args){
	String[] arr = {"geeksquiz", "geeksforgeeks", "abcd", 
            "forgeeksgeeks", "zuiqkeegs"};
		findAllAnagrams(arr, arr.length);
	}
}
