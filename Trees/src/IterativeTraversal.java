import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class IterativeTraversal {
	public static void InorderRecurse(TNode n){
		if(n != null){
			InorderRecurse(n.left);
			System.out.print(n.data+" ");
			InorderRecurse(n.right);
		}
	}
	
	public static void PreorderRecurse(TNode n){
		if(n != null){
			System.out.print(n.data+" ");
			PreorderRecurse(n.left);
			PreorderRecurse(n.right);
		}
	}
	
	public static void PostorderRecurse(TNode n){
		if(n != null){
			PostorderRecurse(n.left);
			PostorderRecurse(n.right);
			System.out.print(n.data+" ");
		}
	}
	
	public static void LevelorderIter(TNode n){
		Queue<TNode> q = new LinkedList<TNode>();
		if(n == null){
			return;
		}
		q.add(n);
		while(!q.isEmpty()){
			TNode temp = q.peek();
			System.out.print(q.poll().data+" ");
			if(temp.left != null){
				q.add(temp.left);
			}
			if(temp.right != null){
				q.add(temp.right);
			}
		}
	}
	
	public static void SpiralOrder(TNode n){
		if( n== null){
			return;
		}
		Stack<TNode> s1 = new Stack<TNode>();
		Stack<TNode> s2 = new Stack<TNode>();
		s1.push(n);
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				TNode tem = s1.peek();
				System.out.print(s1.pop().data+" ");
				if(tem.right != null){
					s2.push(tem.right);
				}
				if(tem.left != null){
					s2.push(tem.left);
				}
			}
			while(!s2.isEmpty()){
				TNode temp = s2.peek();
				System.out.print(s2.pop().data+" ");
				if(temp.left != null){
					s1.push(temp.left);
				}
				if(temp.right != null){
					s1.push(temp.right);
				}
			}
		}
	}
	
	public static void InorderIter(TNode n){
		Stack<TNode> st = new Stack<TNode>();
		while(!st.isEmpty() || n != null){
			if(n != null){
				st.push(n);
				n = n.left;
			}else{
				System.out.print(st.peek().data+" ");
				n = st.pop().right;
			}
		}
	}
	
	public static void PreorderIter(TNode n){
		Stack<TNode> st = new Stack<TNode>();
		while(!st.isEmpty() || n != null){
			if(n != null){
				System.out.print(n.data+" ");
					if(n.right != null){
						st.push(n.right);
					}
				n = n.left;
			}else{
				n = st.pop();
			}
		}
	}
	
	public static void PostorderIter(TNode n){
		Stack<TNode> st = new Stack<TNode>();
		TNode lastvisitednode = null;
		TNode peeknode = null;
		while(!st.isEmpty() || n != null){
			if(n != null){
				st.push(n);
				n = n.left;
			}else{
				peeknode = st.peek();
				if(peeknode.right != null && lastvisitednode != peeknode.right){
					n = peeknode.right;
				}else{
					System.out.print(peeknode.data+" ");
					lastvisitednode = st.pop();
				}
			}
		}
	}
	
	/*					 5
	 * 				   /   \
	 * 			      3     7
	 *               / \   / \
	 *              1   4 6   9
	 * */ 
	
	public static void main(String[] args){
		TNode one = new TNode(5);
		one.left = new TNode(3);
		one.right = new TNode(7);
		one.left.left = new TNode(1);
		one.left.right = new TNode(4);
		one.right.left = new TNode(6);
		one.right.right = new TNode(9);
		System.out.print("Inorder:");
		InorderRecurse(one);
		System.out.print("\nInorder Iterative:");
		InorderIter(one);
		System.out.print("\n\nPreorder:");
		PreorderRecurse(one);
		System.out.print("\nPreorder Iterative:");
		PreorderIter(one);
		System.out.print("\n\nPostorder:");
		PostorderRecurse(one);
		System.out.print("\nPostorder Iterative:");
		PostorderIter(one);
		System.out.print("\n\nLevelorder:");
		LevelorderIter(one);
		System.out.print("\n\nSpiral order:");
		SpiralOrder(one);
	}
}
