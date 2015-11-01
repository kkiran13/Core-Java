import java.util.Stack;
/*1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.*/

public class InOrderNoRecurse {
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
}
