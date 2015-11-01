
public class Treesize {
	public int size(Node<?> n){
		if(n == null){
			return 0;
		}else{
			return size(n.getLeft()) + 1 + size(n.getRight());
		}
	}
}
