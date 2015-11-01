/*We can find the next largest lexicographic string for a given string S using the 
 * following step.
Iterating over every character, we will get the last value i (starting from the first 
character) that satisfies the given condition
S[i] < S[i + 1]
Now, we will get the last value j such that
S[i] < S[j]
We now interchange S[i] and S[j]. And for every character from i+1 till the end, we 
sort the characters. i.e.,
sort(S[i+1]..S[len(S) - 1])*/

import java.io.IOException;
import java.util.Scanner;

public class BiggerIsGreater {
	
	public static String Bigger(String str){
		 char[] letters = str.toCharArray();
		  int k=-1,l=-1;
		  for(int i=letters.length-2;i>=0;i--){
		   if(letters[i]<letters[i+1]){
		    k=i;
		    break;
		   }
		  }
		  if(k==-1)
		   return "no answer";
		  
		  for(int i=letters.length-1;i>k;i--){
		   if(letters[i]>letters[k]){
		    l=i;
		    break;
		   }
		  }
		  char temp = letters[k];
		  letters[k] = letters[l];
		  letters[l] = temp;
		  char[] newWord = new char[letters.length];
		  for(int i=0;i<k+1;i++){
		   newWord[i]=letters[i];
		  }
		  int j=1;
		  for(int i=letters.length-1;i>k;i--){
		   newWord[k+j]=letters[i];
		   j++;
		  }
		  return new String(newWord);
		 }
	
	public static char[] Greater(String str){
		char[] chararr = str.toCharArray();
		int p=-1;
		for(int i=chararr.length-2;i>=0;i--){
			if(chararr[i]<chararr[i+1]){
				p = i;
			}
		}
		if(p==-1){
			System.out.println("no answer");
			System.exit(0);
		}
		for(int j=chararr.length-1;j>p;j--){
			if(chararr[j] > chararr[p]){
				swap(chararr,p,j);
			}
		}
		Reverse(chararr, p+1, chararr.length-1);
		return chararr;
	}
	
	public static void swap(char[] chararr,int i, int j){
		char temp = chararr[i];
		chararr[i] = chararr[j];
		chararr[j] = temp;
	}
	
	public static void Reverse(char[] chararr,int i, int j){
		while(i<=j){
			char temp = chararr[i];
			chararr[i] = chararr[j];
			chararr[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			while(n>0){
				//System.out.println(Bigger(scan.next()));
				char[] res = Greater(scan.next());
				for(int i=0;i<res.length;i++){
					System.out.print(res[i]+"");
				}
				n--;
			}	
	}
	
}
