/* // Checks if tree can be folded or not
 * IsFoldable(root)
1) If tree is empty then return true
2) Else check if left and right subtrees are structure wise mirrors of
    each other. Use utility function IsFoldableUtil(root->left,
    root->right) for this.
// Checks if n1 and n2 are mirror of each other.
IsFoldableUtil(n1, n2)
1) If both trees are empty then return true.
2) If one of them is empty and other is not then return false.
3) Return true if following conditions are met
   a) n1->left is mirror of n2->right
   b) n1->right is mirror of n2->left*/
public class FoldableBT {
	public boolean isFoldable(Node<?> n){
		if(n==null){
			return true;
		}
		return isFoldableUtil(n.getLeft(),n.getRight());
	}
	public boolean isFoldableUtil(Node<?> lft, Node<?> rt){
		if(lft == null && rt == null){
			return true;
		}
		if(lft == null || rt == null){
			return false;
		}
		return isFoldableUtil(lft.getLeft(),rt.getRight()) 
				&& isFoldableUtil(lft.getRight(),rt.getLeft());
	}
}
/*A tree can be folded if left and right subtrees of the tree are structure wise 
 * mirror image of each other.
An empty tree is considered as foldable.
(a) can be folded.
(a)
       10
     /    \
    7      15
     \    /
      9  11
      
(c) cannot be folded.
(c)
        10
       /  \
      7   15
     /    /
    5   11
    */

