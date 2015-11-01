/*For every node, data value must be equal to sum of data values in left and right 
children. 
 * Consider data value as 0 for NULL children.*/

/*Traverse the given binary tree. For each node check (recursively) if the node and both
 *its children satisfy the Children Sum Property, if so then return true else return false.
 **/
public class ChildrenSumProperty {
	public boolean childrensum(Node<?> n){
		int leftdata = 0;
		int rightdata = 0;
		if(n==null || (n.getLeft() == null && n.getRight() == null)){
			return true;
		}else{
			if(n.getLeft() != null){
				leftdata = (Integer) n.getLeft().data;
			}
			if(n.getRight() != null){
				rightdata = (Integer) n.getRight().data;
			}
			if(((Integer)n.data==leftdata+rightdata) && childrensum(n.getLeft()) && childrensum(n.getRight())){
				return true;
			}else{
				return false;
			}
		}
	}
	public void childsumtree(Node<?> n){
		int leftval = 0;
		int rightval = 0;
		int diff = 0;
		if(n==null || (n.getLeft() == null && n.getRight() == null)){
			return;
		}else if (n.getLeft()!=null && n.getRight()!=null){
			childsumtree(n.getLeft());
			childsumtree(n.getRight());
			if(n.getLeft()!= null){
				leftval = n.getLeft().data;
			}if(n.getRight()!= null){
				rightval = n.getRight().data;
			}
			diff = (leftval+rightval)- n.data;
		}		
		if(diff > 0){
			n.data = n.data + diff;
		}
		if(diff < 0){
			increment(n,-diff);
		}
	}
	public void increment(Node<?> n,int diff){
		if(n.getLeft()!=null){
			n.getLeft().data = n.getLeft().data + diff;
			increment(n.getLeft(), diff);
		}
		else if(n.getRight()!=null){
			n.getRight().data = n.getRight().data + diff;
			increment(n.getRight(), diff);
		}
	}
}
