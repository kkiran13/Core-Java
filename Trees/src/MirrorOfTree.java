
public class MirrorOfTree {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void mirror(Node<?> n){
		if(n == null){
			return;
		}
		
		Node temp;
		
		mirror(n.getLeft());
		mirror(n.getRight());
		
		temp = n.left;
		n.left = (Node) n.right;
		n.right = temp;
	}
	
}
