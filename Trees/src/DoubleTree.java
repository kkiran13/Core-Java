/*To create Double tree of the given tree, create a new duplicate for each node, 
 * and insert the duplicate as the left child of the original node.

So the tree…

  			1
          /   \
        2      3
      /  \
    4     5
  
is changed to…

               1
             /   \
           1      3
          /      /
        2       3
      /  \
     2    5
    /    /
   4   5
  /   
 4    
*/
public class DoubleTree {
	public void doubletr(Node<?> n){
		Node<?> oldleft;
		if(n==null){
			return;
		}
		doubletr(n.getLeft());
		doubletr(n.getRight());
		
		oldleft = n.getLeft();
		n.left = new Node(n.data);
		n.left.left = (Node)oldleft;
	}
}
