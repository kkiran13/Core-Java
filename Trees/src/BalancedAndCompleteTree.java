import java.util.LinkedList;
import java.util.Queue;

/*  A complete binary tree is a binary tree in which every level, except possibly the last,
 *  is completely filled, and all nodes are as far left as possible. See following 
 *  examples.
 *  The following trees are examples of Complete Binary Trees
    1
  /   \
 2     3
  
       1
    /    \
   2       3
  /
 4

       1
    /    \
   2      3
  /  \    /
 4    5  6
 
 The following trees are examples of Non-Complete Binary Trees
    1
      \
       3
  
       1
    /    \
   2       3
    \     /  \   
     4   5    6

       1
    /    \
   2      3
         /  \
        4    5
        
*/
public class BalancedAndCompleteTree {
	public static void main(String[] args){
		TNode one = new TNode(1);
		one.left = new TNode(2);
		one.right = new TNode(3);
		//one.left.left = new TNode(4);
		one.left.right = new TNode(30);
		//one.right.left = new TNode(35);
		//one.right.right = new TNode(40);
		BalancedAndCompleteTree bt = new BalancedAndCompleteTree();
		System.out.println("Balance Check: "+bt.Balanced(one));
		System.out.println("Complete Check: "+bt.CompleteTree(one));
	}
	
	public boolean Balanced(TNode n){ //A tree where no leaf is much farther away from the root than any other leaf.
		if(n == null){
			return true;
		}
		TNodeMethods tm = new TNodeMethods();
		
		int lh = height(n.left);
		int rh = height(n.right);
		if(Math.abs(lh-rh) <= 1 && Balanced(n.left) && Balanced(n.right)){
			return true;
		}
		return false;
	}
	
	public int height(TNode n){
		if(n == null){
			return 0;
		}
		return 1 + Math.max(height(n.left), height(n.right));
	}
	
	
/*The approach is to do a level order traversal starting from root. In the traversal, 
 * once a node is found which is NOT a Full Node, all the following nodes must be leaf
 * nodes.
 * Also, one more thing needs to be checked to handle the below case: 
 * If a node has empty left child, then the right child must be empty.
 */
	public boolean CompleteTree(TNode n){
		if(n == null){
			return true;
		}
		boolean fullnodecheck = false;
		Queue<TNode> q = new LinkedList<TNode>();
		q.add(n);
		while(!q.isEmpty()){
			TNode temp = q.peek();
			q.poll();
			if(fullnodecheck){
				if(!isLeaf(temp)){
					return false;
				}
			}
			
			if(!FullNode(temp)){
				fullnodecheck = true;
				if(!RightEmptyIfLeftEmpty(temp)){ //so that nodes are as left as possible
					return false;
				}
			}
			
			if(temp.left != null){
				q.add(temp.left);
			}
			
			if(temp.right != null){
				q.add(temp.right);
			}
			
		}
		
		return true;
	}
	
	public boolean FullNode(TNode n){ //check for full node i.e right and left node are full
		if(n.left != null && n.right != null){
			return true;
		}
		return false;
	}
	
	public boolean isLeaf(TNode n){
		if(n.left == null && n.right == null){
			return true;
		}
		return false;
	}
	
	public boolean RightEmptyIfLeftEmpty(TNode n){ //if left child empty and right child not empty, then false
		if(n.left == null && n.right != null){
			return false;
		}
		return true;
	}
}