import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TNodeMethods {
	public void preorder(Node<?> n)
	 {
	  if (n != null)
	  {
	   System.out.print(n.data + " ");
	   preorder(n.getLeft());
	   preorder(n.getRight());
	  }
	 }
	 public void inorder(Node<?> n)
	 {
	  if (n != null)
	  {
	   inorder(n.getLeft());
	   System.out.print(n.data + " ");
	   inorder(n.getRight());
	  }
	 }
	 public void postorder(Node<?> n)
	 {
	  if (n != null)
	  {
	   postorder(n.getLeft());
	   postorder(n.getRight());
	   System.out.print(n.data + " ");
	  }
	 }
	 public void levelorder(Node<?> n)
	 {
	  Queue<Node<?>> nodequeue = new LinkedList<Node<?>>();
	  if (n != null)
	   nodequeue.add(n);
	  while (!nodequeue.isEmpty())
	  {
	   Node<?> next = nodequeue.remove();
	   System.out.print(next.data + " ");
	   if (next.getLeft() != null)
	   {
	    nodequeue.add(next.getLeft());
	   }
	   if (next.getRight() != null)
	   {
	    nodequeue.add(next.getRight());
	   }
	  }
	 }
	 
	 @SuppressWarnings("rawtypes")
	public void levelorderspiral(Node<?> n)
	 {
	  if(n==null){
		  return;
	  }
	  Stack<Node> s1 = new Stack<Node>(); //print nodes left to right -- even levels
	  Stack<Node> s2 = new Stack<Node>(); //print nodes right to left -- odd levels
	  s1.push(n);
	  while(!s1.isEmpty() || !s2.isEmpty()){
		  while(!s1.isEmpty()){
			  Node tem = s1.peek();
			  System.out.print(s1.pop().data+" ");
			  if(tem.getRight() != null){
				  s2.push(tem.getRight());
			  }
			  if(tem.getLeft() != null){
				  s2.push(tem.getLeft());
			  }
		  }
		  while(!s2.isEmpty()){
			  Node tem = s2.peek();
			  System.out.print(s2.pop().data+" ");
			  if(tem.getLeft() != null){
				  s1.push(tem.getLeft());
			  }
			  if(tem.getRight() != null){
				  s1.push(tem.getRight());
			  }
		  }
	  }
	 }
	 	public boolean isBST(Node<?> n){
	    	Node<?> prev = null;
	    	if(n != null){
	    		if(!isBST(n.getLeft())){
	    			return false;
	    		}
	    		if(prev != null && n.data <= prev.data){
	    			return false;
	    		}
	    		prev = n;
	    		return isBST(n.getRight());
	    	}
	    	return true;
	    }
	 	
	 	public int size(Node<?> n){
			if(n == null){
				return 0;
			}else{
				return size(n.getLeft())+1+size(n.getRight());
			}
		}
	 	
	 	public boolean sameTree(Node<?> n1,Node<?> n2){
			if(n1 == null && n2 == null){
				return true;
			}
			if(n1 == null || n2 == null){
				return false;
			}
			else{
				//To check for identical structure and values in tree is below line
				return n1.data == n2.data && sameTree(n1.getLeft(),n2.getLeft()) && sameTree(n1.getRight(),n2.getRight());
				//to check for identical structure and not considering values is below line
				//return sameTree(n1.getLeft(),n2.getLeft()) && sameTree(n1.getRight(),n2.getRight());
			}
		}
	 	
	 	public int height(Node<?> n){
			if(n == null){
				return 0;
			}else{
				return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
			}
		}
		public int getMaxWidth(Node<?> n){
			int maxwidth = 0;
			int width;
			for(int i=1;i<height(n);i++){
				width = getWidth(n,i);
				if(width > maxwidth){
				  maxwidth = width;	
				}
			}
			return maxwidth;
		}
		public int getWidth(Node<?> n,int level){
			if(n == null){
				return 0;
			}if(level == 1){
				return 1;
			}else if(level > 1){
				return getWidth(n.getLeft(), level-1) + getWidth(n.getRight(),level-1);
			}
			return level;
		}
		
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
		
		public boolean isLeaf(Node<?> n){
			if(n.getLeft() == null && n.getRight() == null){
				return true;
			}else{
				return false;
			}
		}
		public void printPathsRecur(Node<?> n,int[] patharray,int pathlen){
			if(n != null){
				patharray[pathlen] = (Integer) n.data;
				pathlen++;
			}
			if(isLeaf(n)){
				printarray(patharray, pathlen);
			}else{
				printPathsRecur(n.getLeft(),patharray,pathlen);
				printPathsRecur(n.getRight(),patharray,pathlen);
				}
		}
		public void printarray(int[] patharray,int pathlen){
			for(int i=0;i<pathlen;i++){
				if(patharray[i] != 0){
				System.out.print(patharray[i]+" ");
				}
			}
			System.out.println();
		}
		
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
		
		public int leafcount(Node<?> n){
			if(n == null){
				return 0;
			}else if(n.getLeft()==null && n.getRight()==null){
				System.out.print(n.data+" ");
				return 1;
			}else{
				return leafcount(n.getLeft())+leafcount(n.getRight());
			}
		}
		
		public void StackInOrder(Node<?> n){
			if(n == null){
				return;
			}
			Node<?> current = n;
			Stack<Node<?>> st = new Stack<Node<?>>();
			boolean done = false;
			while(!done){
				if(current != null){
					st.push(current);
					current = current.getLeft();
				}
				if(current == null){
					if(!st.isEmpty()){
						System.out.print(st.peek().data+" ");
						current = st.pop().getRight();
					}else{
						done = true;
					}
				}
			}
		}
		/*1. Initialize current as root 
	2. While current is not NULL
	   If current does not have left child
	      a) Print current’s data
	      b) Go to the right, i.e., current = current->right
	   Else
	   	  a) Take predecessor node as current->left
	   	  b) If predecessor->Right is not null and predecessor->Right is not current then
	   	     predecessor = predecessor->Right
	   	  b) If predecessor->Right is null,
	         Make current as right child of the rightmost node in current's left subtree
	         Go to this left child, i.e., current = current->left*/
		public void MorrisTravel(Node<?> n){
			if(n == null){
				return;
			}
			Node<?> current = n;
			while(current != null){
				if(current.getLeft()==null){
					System.out.print(current.data+" ");
					current = current.getRight();
				}else{
					Node<?> pre = current.getLeft();
					while(pre.getRight()!=null && pre.getRight()!=current){
						pre = pre.getRight();
					}
					if(pre.getRight()==null){
						pre.right = (Node)current;
						current = current.getLeft();
					}else{
						pre.right = null;
						System.out.print(current.data+" ");
						current = current.getRight();
					}
				} //end first else
			} //end top while
		}
		
		public boolean balance(Node<?> n){
			if(n == null){
				return true;
			}
			int lh = height(n.getLeft());
			int rh = height(n.getRight());		
			System.out.println("Height Difference of Left and Right Subtrees is: "+Math.abs(lh-rh));
			if((Math.abs(lh-rh) <= 1) && balance(n.getLeft()) && balance(n.getRight())){
			 return true;	
			}else{
			 return false;	
			}
		}
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
		
		public int diameter(Node<?> n){
			if(n == null){
				return 0;
			}
			int lh = height(n.getLeft());
			int rh = height(n.getRight());
			int ldiameter = diameter(n.getLeft());
			int rdiameter = diameter(n.getRight());
			return Math.max(lh+rh+1,Math.max(ldiameter,rdiameter));
		}
		
		public void deletetree(Node<?> n){
			if(n == null) return;
			deletetree(n.getLeft());
			deletetree(n.getRight());
			System.out.println("Deleted Node: "+n.data);
			n.data = (Integer) null;	
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
		
		public boolean childrensum(Node<?> n){
			int leftdata = 0;
			int rightdata = 0;
			if(n==null || (n.getLeft() == null && n.getRight() == null)){
				return true;
			}else{
				if(n.getLeft() != null){
					leftdata = (Integer) n.getLeft().data;
				}if(n.getRight() != null){
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
		
		public void PrintLeaves(Node<?> n){
			if(n != null){
				PrintLeaves(n.getLeft());
				if(n.getLeft() == null && n.getRight() == null){
					System.out.print(n.data+" ");
				}
				PrintLeaves(n.getRight());
			}
		}
		public void PrintLeft(Node<?> n){
			if(n != null){
				if(n.getLeft()!=null){
					System.out.print(n.data+" ");
					PrintLeft(n.getLeft());
				}else if(n.getRight()!=null){
					System.out.print(n.data+" ");
					PrintLeft(n.getRight());
				}
			}
		}
		public void PrintRight(Node<?> n){
			if(n != null){
				if(n.getRight()!=null){
					PrintRight(n.getRight());
					System.out.print(n.data+" ");
				}else if(n.getLeft()!=null){
					PrintRight(n.getLeft());
					System.out.print(n.data+" ");
				}
			}
		}
		public void PrintBoundary(Node<?> n){
			if(n != null){
				System.out.print(n.data+" ");
				PrintLeft(n.getLeft());
				PrintLeaves(n.getLeft());
				PrintLeaves(n.getRight());
				PrintRight(n.getRight());
			}
		}
		
		public boolean PrintAncestor(Node<?> n, int target){
			if(n == null){
				return false;
			}
			if(n.data == target){
				return true;
			}
			if(PrintAncestor(n.getLeft(),target)||PrintAncestor(n.getRight(), target)){
				System.out.print(n.data+" ");
				return true;
			}else {
			return false;
			}
		}
}
