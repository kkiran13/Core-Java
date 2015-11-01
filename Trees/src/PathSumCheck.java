/*Given a binary tree and a number, return true if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals the given number. 
 * Return false if no such path can be found.*/

public class PathSumCheck {
	public boolean pathsum(Node<?> n,int sum){
		if(n == null){
			System.out.println("Sum is: "+0);
			return true;
		}else{
		boolean res = false;
		int subsum = sum - n.data;
		if(subsum == 0 && n.getLeft()==null && n.getRight()==null){
			return true;
		}
		if(n.getLeft()!=null){
			res = res || pathsum(n.getLeft(),subsum);
		}
		if(n.getRight()!=null){
			res = res || pathsum(n.getRight(), subsum);
		}
		return res;
	  }	
	}
}
