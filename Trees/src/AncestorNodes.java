
public class AncestorNodes {
	public boolean PrintAncestor(Node<?> n, int target){
		if(n == null){
			return false;
		}
		if(n.data == target){
			return true;
		}
		if(PrintAncestor(n.getLeft(),target)||PrintAncestor(n.getRight(), target)){
			System.out.print(n.data+" ");
			return true;
		}else {
		return false;
		}
	}
}
