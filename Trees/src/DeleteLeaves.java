
public class DeleteLeaves {
	public boolean isLeaf(Node<?> n){
		if(n.getLeft() == null && n.getRight() == null){
			return true;
		}else{
			return false;
		}
	}
	public void deleteLeaves(Node<?> n){
		if(isLeaf(n.getLeft())){
			n.data = (Integer) null;
		}else{
			deleteLeaves(n.getLeft());
		}
		if(isLeaf(n.getRight())){
			n.data = (Integer)null;
		}else{
			deleteLeaves(n.getRight());
		}
	}
}
