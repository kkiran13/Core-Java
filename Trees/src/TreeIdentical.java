
public class TreeIdentical {
	public boolean sameTree(Node<?> n1,Node<?> n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		else{
			//To check for identical structure and values in tree is below line
			return n1.data == n2.data && sameTree(n1.getLeft(),n2.getLeft()) && sameTree(n1.getRight(),n2.getRight());
			//to check for identical structure and not considering values is below line
			//return sameTree(n1.getLeft(),n2.getLeft()) && sameTree(n1.getRight(),n2.getRight());
		}
	}
}