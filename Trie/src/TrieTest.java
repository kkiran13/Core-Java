
public class TrieTest {
	 public static void main(String[] args) {
		  TrieContainer start = new TrieContainer();
		  Trie tr = new Trie();
		  tr.storeWords(start, "hello");
		  tr.storeWords(start, "hallo");
		  tr.storeWords(start, "hell");
		  tr.storeWords(start, "teg");
		  tr.storeWords(start, "tag");
		   
		  tr.printWordStrings(start,"");
		   
		  System.out.println("\n"+tr.isWordPresent(start, "hal"));
		 }
}
