/* Tree is Height balanced when
 * i) Left Tree is balanced
 * ii) Right Tree is balanced
 * iii) abs(LeftTreeHeight-RightTreeHeight)<=1
 */
public class HeightBalance {
	public boolean balance(Node<?> n){
		if(n == null){
			return true;
		}
		int lh = height(n.getLeft());
		int rh = height(n.getRight());		
		System.out.println("Height Difference of Left and Right Subtrees is: "+Math.abs(lh-rh));
		
		if((Math.abs(lh-rh) <= 1) && balance(n.getLeft()) && balance(n.getRight())){
		 return true;	
		}
		
		 return false;	
	}
	public int height(Node<?> n){
		if(n==null){
			return 0;
		}
		return 1 + Math.max(height(n.getRight()), height(n.getLeft()));
	}
}
