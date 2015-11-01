
public class DeleteTree {
	public void deletetree(Node<?> n){
		if(n == null) return;
		deletetree(n.getLeft());
		deletetree(n.getRight());
		System.out.println("Deleted Node: "+n.data);
		n.data = (Integer) null;	
	}
}
