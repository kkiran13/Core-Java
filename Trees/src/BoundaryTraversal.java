/*We break the problem in 3 parts:
1. Print the left boundary in top-down manner.
2. Print all leaf nodes from left to right, which can again be sub-divided into two sub-parts:
…..2.1 Print all leaf nodes of left sub-tree from left to right.
…..2.2 Print all leaf nodes of right subtree from left to right.
3. Print the right boundary in bottom-up manner.*/
public class BoundaryTraversal {
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
}