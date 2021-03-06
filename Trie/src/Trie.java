
public class Trie {
  
 public void storeWords(TrieContainer start, String word){
  for (int j = 0; j < word.length(); j++) {
   char character = word.charAt(j);
   //In series, check the position of character, 
   //if it is already filled then check the series of filled Trie object.
   //if it is not filled then create new TrieContainer object and place it at correct position, and check 
   //if it is end of the word, then mark isEnd = true or else false;  
   if(start.series[character-97]!=null){
    if(word.length()-1 == j){ //if word is found till last character, then mark the end as true.
     start.series[character-97].isEnd = true;
    }
    start = start.series[character-97];
   }else{
	   System.out.println("else: "+character);
    TrieContainer trie = new TrieContainer();
    trie.isEnd = (word.length()-1 == j ? true:false);
    start.series[character-97] = trie;
    start = start.series[character-97];
   }
  }  
 }
  
 public boolean isWordPresent(TrieContainer start, String word){
  boolean isFound = true;
  for (int i = 0; i < word.length(); i++) {
   char character = word.charAt(i);
 
   //if at character position TrieContainer object is present then character is found and 
   //start looking for next character is word. 
   if(start.series[character-97]!=null){
    if(word.length()-1 != i){
     start = start.series[character-97];
    }else{
     if(!start.series[character-97].isEnd){
      isFound = false;
     }
    }
   }else{
    isFound = false;
    break;
   }
  }
  return isFound;
 }
 
 public void printWordStrings(TrieContainer start, String toPrint) {
  if(start==null){
   return;
  }
  if(start.isEnd){
   System.out.println(toPrint);
  }
 
  for (int i = 0; i < start.series.length; i++) {
   TrieContainer t = start.series[i];
   if(t!=null){
    printWordStrings(t, toPrint + (char)(97+i));
   }
  }
 }
} 
