import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TreeTraverse {
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
	 
	 public int maxvalue(Node<?> n){
		 Node<?> current = n;
		 while(current.getRight() != null){
			 current = current.getRight();
		 }
		 return current.data;
	 }
	 
	 public int minvalue(Node<?> n){
		 Node<?> current = n;
		 while(current.getLeft() != null){
			 current = current.getLeft();
		 }
		 return current.data;
	 }
	 
	 public boolean isBST(Node<?> n){
	    	if(n == null){
	    		return true;
	    	}
	    	if(n.getLeft() != null && maxvalue(n.getLeft()) > n.data){
	    		return false;
	    	}
	    	if(n.getRight() != null && minvalue(n.getRight()) < n.data){
	    		return false;
	    	}
	    	if(!isBST(n.getLeft()) || !isBST(n.getRight())){
	    		return false;
	    	}
	    	return true;
	 }
}
