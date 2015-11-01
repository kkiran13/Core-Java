import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.print.attribute.Size2DSyntax;

public class BSTNode{
	
	public TNode insert(TNode n, int item){
		if(n == null){
			return new TNode(item);
		}
		if(item < n.data){
			n.left = insert(n.left,item);
		}else if(item > n.data){
			n.right = insert(n.right,item);
		}
		return n;
	}
	
    public boolean bstsearch(TNode n, int key){
    	if(n == null){
    		return false;
    	}
    	if(n.data == key){
    		return true;
    	}
    	if(key < n.data){
    		return bstsearch(n.left,key);
    	}else if(key > n.data) {
    		return bstsearch(n.right,key);
    	}
    	return false;
    }
    
    public void inorder(TNode n){
    	if(n != null){
    		inorder(n.left);
    		System.out.print(n.data+" ");
    		inorder(n.right);
    	}
    }
    
    public void preorder(TNode n){
    	if(n != null){
    		System.out.print(n.data+" ");
    		preorder(n.left);
    		preorder(n.right);
    	}
    }
    
    public void postorder(TNode n){
    	if(n != null){
    		postorder(n.left);
    		postorder(n.right);
    		System.out.print(n.data+" ");
    	}
    }
    
    public void LevelorderIter(TNode n){
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
    
    public TNode minvaluenode(TNode n){
    	TNode current = n;
    	while(current.left != null){
    		current = current.left;
    	}
    	return current;
    }
    
    public TNode maxvaluenode(TNode n){
    	TNode current = n;
    	while(current.right != null){
    		current = current.right;
    	}
    	return current;
    }
    
    public boolean isLeaf(TNode n){
    	if(n.left == null && n.right == null){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public TNode delete(TNode n, int key){
    	if(n == null){
    		return n;
    	}
    	if(key < n.data){
    		n.left = delete(n.left,key);
    	} else if(key > n.data){
    		n.right = delete(n.right,key);
    	}else {
    		if(n.left == null){
    			TNode temp = n.right;
    			return temp;
    		}
    		if(n.right == null){
    			TNode temp = n.left;
    			return temp;
    		}
    		TNode temp = minvaluenode(n.right);
    		n.data = temp.data;
    		n.right = delete(n.right, temp.data);
    	}
    	return n;
    }
    
    public int minvalueint(TNode n){
    	TNode current = n;
    	while(current.left != null){
    		current = current.left;
    	}
    	return current.data;
    }
    
    public int maxvalueint(TNode n){
    	TNode current = n;
    	while(current.right != null){
    		current = current.right;
    	}
    	return current.data;
    }
    
    public boolean isBST(TNode n){
    	if(n==null){
    		return true;
    	}
    	if(n.left!=null && maxvalueint(n.left) > n.data){
    		return false;
    	}
    	if(n.right!=null && minvalueint(n.right) < n.data){
    		return false;
    	}
    	if(!isBST(n.left) || !isBST(n.right)){
    		return false;
    	}
    	return true;
    }
    
    public boolean isbstefficient(TNode n){
    	int min = minvalueint(n);
    	int max = maxvalueint(n);
    	return isbstutil(n,min,max);
    }
    public boolean isbstutil(TNode n,int min, int max){
    	if(n == null){
    		return true;
    	}
    	if(n.data < min || n.data > max){
    		return false;
    	}
    	return isbstutil(n.left,min,n.data-1) && isbstutil(n.right,n.data+1,max);
    }
    
    public TNode lca(TNode n,int n1,int n2){ //Uses O(height) stack space for recursion
    	if(n==null){
    		return null;
    	}
    	// If both n1 and n2 are smaller than root, then LCA lies in left
    	if(n.data > n1 && n.data > n2){
    		return lca(n.left,n1,n2);
    	}
    	// If both n1 and n2 are greater than root, then LCA lies in right
    	if(n.data < n1 && n.data < n2){
    		return lca(n.right,n1,n2);
    	}
    	//If LCA is not found on either left or right, then its the Root node
    	return n;
    }
    
    public TNode lcanorecurse(TNode n,int n1,int n2){
    	if(n == null){
    		return null;
    	}
    	while(n!=null){
    		// If both n1 and n2 are smaller than root, then LCA lies in left
    		if(n.data > n1 && n.data > n2){
    			n = n.left;
    			// If both n1 and n2 are greater than root, then LCA lies in right
    		}else if(n.data < n1 && n.data < n2){
    			n = n.right;
    			//If LCA is not found on either left or right, then its the Root node
    		}else{
    			return n;
    		}
    	 }
    		return n;
    }
    
  /*Given an array that stores a complete Binary Search Tree, 
   * write a function that efficiently prints the given array in ascending order.*/
    public void printSortedarray(int[] array,int start,int end){
    	if(start>end){
    		//System.out.println("heyy start "+start+" end "+end);
    		return;
    	}
    	//System.out.println("start "+start+" end "+end);
    	printSortedarray(array,start*2+1,end);
    	System.out.print(array[start]+" ");
    	//System.out.println("start "+start+" end "+end);
    	printSortedarray(array,start*2+2,end);
    }
    
/*1) If right subtree of node is not NULL, then succ lies in right subtree. Do following.
Go to right subtree and return the node with minimum key value in right subtree.
2) If right subtree of node is NULL, then start from root and use search like technique. 
Do following: Travel down the tree, if a node’s data is greater than root’s data then go 
right side, otherwise go to left side.*/
    public TNode InOrderSuccessor(TNode root, TNode n){
    	if(n.right != null){
    		return minvaluenode(n.right);
    	}
    	TNode succ = null;
       while(root != null){
    	if(n.data < root.data){
    		succ = root;
    		root = root.left;
    	}else if(n.data > root.data){
    		root = root.right;
    	}else{
    		break;
    	}
      }
       return succ;
    }
    
    public TNode InOrderPredecessor(TNode root, TNode n){
    	if(n.left != null){
    		return maxvaluenode(n.left);
    	}
    	TNode pred = null;
       while(root != null){
    	   if(n.data < root.data){
       		root = root.left;
       	}
    	else if(n.data > root.data){
    		pred = root;
    		root = root.right;
    	}else{
    		break;
    	}
      }
       return pred;
    }
    
    
    public void kthsmallest(TNode n,int k){ //Do InOrder traversal and print kth node
    	int x = 0;
		Stack<TNode> st = new Stack<TNode>();
		while(!st.isEmpty() || n != null){
			if(n != null){
				st.push(n);
				n = n.left;
			}else{
				x++;
				if(x == k){
				System.out.print(st.peek().data+" ");
				}
				n = st.pop().right;
			}
		}
	}
    
    /*public void kthsmallest(TNode n, int k){
		if(n == null){
			return;
		}
		TNode current = n;
		Stack<TNode> st = new Stack<TNode>();
		boolean done = false;
		int num = 1;
		while(!done){
			if(current != null){
				st.push(current);
				current = current.left;
			}
			if(current == null){
				if(!st.isEmpty()){
					if(num == k){
					System.out.print(st.peek().data+" ");
					}
					current = st.pop().right;
					num++;
				}else{
					done = true;
				}
			}
		}
     }*/
    public void bstrange(TNode n, int n1, int n2){ 
		Stack<TNode> st = new Stack<TNode>();
		while(!st.isEmpty() || n != null){
			if(n != null){
				st.push(n);
				n = n.left;
			}else{
				if(st.peek().data >= n1 && st.peek().data <= n2){
				System.out.print(st.peek().data+" ");
				}
				n = st.pop().right;
			}
		}
	}
    
    /*public void bstrange(TNode n, int n1, int n2){
		if(n == null){
			return;
		}
		TNode current = n;
		Stack<TNode> st = new Stack<TNode>();
		boolean done = false;
		while(!done){
			if(current != null){
				st.push(current);
				current = current.left;
			}
			if(current == null){
				if(!st.isEmpty()){
					if(st.peek().data >= n1 && st.peek().data <= n2){
					System.out.print(st.peek().data+" ");
					}
					current = st.pop().right;
				}else{
					done = true;
				}
			}
		}
     }*/
    
    public void bstrangerecurse(TNode n,int n1,int n2){
    	if(n!=null){
    		bstrangerecurse(n.left,n1,n2);
    		if(n.data >= n1 && n.data <= n2){
    			System.out.print(n.data+" ");
    		}
    		bstrangerecurse(n.right,n1,n2);
    	}
    }
    /*public void bstrangerecurse(TNode n,int n1,int n2){
    	if(n==null){
    		return;
    	}
    	if(n1<n.data){
    		bstrangerecurse(n.left,n1,n2);
    	}
    	if(n1<=n.data && n2>=n.data){
    		System.out.print(n.data+" ");
    	}
    	if(n2>n.data){
    		bstrangerecurse(n.right, n1, n2);
    	}
    }*/
    
    public TNode SortedArrayToBST(int[] array,int start,int end){
    	if(start > end){
    		return null;
    	}
    	int middle = (start+end)/2;
    	TNode newroot = new TNode(array[middle]);
    	newroot.left = SortedArrayToBST(array,start,middle-1);
    	newroot.right = SortedArrayToBST(array,middle+1,end);
    	return newroot;
    }
    
    public int size(TNode n){
    	if(n == null){
    		return 0;
    	}else{
    		return  size(n.left) + 1 + size(n.right);
    	}
    }
    
    /*Start from root and do an inorder traversal of the tree. 
     * For each node N, check whether the subtree rooted with N is BST or not. 
     * If BST, then return size of the subtree rooted with N. 
     * Else, recur down the left and right subtrees and return the maximum of values returned by left and right subtrees.*/
    public int largestbst(TNode n){
    	if(isBST(n)){
    		return size(n);
    	}else{
    		return Math.max(largestbst(n.left),largestbst(n.right));
    	}
    }
    
    /*The idea is to check of if next smaller and greater elements are same in both arrays. 
     * Same properties are recursively checked for left and right subtrees. The idea looks 
     * simple, but implementation requires checking all conditions for all elements. 
     * Following is an interesting recursive implementation of the idea.*/
    public boolean identicalBSTcheckfromArrays(int[] arr1,int[] arr2, int size1, int size2){
       if(size1 == size2 && size1==0){
    	   return true;
       }
       if(size1 != size2){
    	   return false;
       }
       if(size1 == 1){
    	   if(arr1[0]==arr2[0]){
    		   return true;
    	   }else{
    		   return false;
    	   }
       }
       int[] l1 = new int[size1]; // 1st array..lower vals than arr1[0]
       int[] l2 = new int[size1]; // 2nd array..lower vals than arr2[0]
       
       int[] h1 = new int[size1]; // 1st array..greater vals than arr1[0]
       int[] h2 = new int[size1]; // 2nd array..greater vals than arr2[0]
       
       int cnt1=0;
       int cnt2=0;
       int cnt3=0;
       int cnt4=0;
       
       if(arr1[0] == arr2[0]){ //first elements of arrays have to be equal
    	   for(int i=1;i<size1;i++){
        	   if(arr1[i] < arr1[0]){
        		   l1[cnt1] = arr1[i];
        		   cnt1++;
        	   }else{   //if(arr1[i] > arr1[0])
        		   h1[cnt3]=arr1[i];
        		   cnt3++;
        	   }
    	   }
    	    for(int i=1;i<size2;i++){
        	   if(arr2[i] < arr2[0]){
        		   l2[cnt2] = arr2[i];
        		   cnt2++;
        	   }else{
        		   h2[cnt4]=arr2[i];
        		   cnt4++;
        	   }
           }
    	   boolean left = identicalBSTcheckfromArrays(l1,l2,cnt1,cnt2);
    	   boolean right = identicalBSTcheckfromArrays(h1,h2,cnt3,cnt4);
    	   return(left && right);
       }else{
    	   return false;
       }
   }
    
    public void AddGreaterValuesToNode(TNode n){
    	int sum = 0;
    	AddGreaterValuesToNodeUtil(n, sum);
    }
    
    public int AddGreaterValuesToNodeUtil(TNode n,int sum){
    	if(n.right!=null){
    		sum = AddGreaterValuesToNodeUtil(n.right,sum);
    	}
    	if(n != null){
    		n.data += sum;
    		sum = n.data;
    	}
    	if(n.left!=null){
    		sum = AddGreaterValuesToNodeUtil(n.left, sum);
    	}
   		return sum;
    }
    
/*Since all the descendants of a node must either be larger or smaller than the node. 
* We can do following for every node in a loop.
1. Find the next preorder successor (or descendant) of the node.
2. Find the last preorder successor (last element in pre[]) of the node.
3. If both successors are less than the current node, or both successors are greater 
than the current node, then continue. Else, return false.*/
    public boolean HasOnlyOneChild(int[] arr){
    	//int firstdiff;
    	//int lastdiff;
    	for(int i=0;i<arr.length-1;i++){
    		//Another Solution is commented
    		/*firstdiff = arr[i]-arr[i+1];
    		lastdiff = arr[i]-arr[arr.length-1];
    		if(firstdiff*lastdiff<0){
    			return false;
    		}*/
    		if(arr[i]>arr[i+1] && arr[i]>arr[arr.length-1] || arr[i]<arr[i+1] && arr[i]<arr[arr.length-1]){
    			continue;
    		}else {
    			return false;
    		}
    	}
    	return true;
    }
    
    /*public TNode RemoveNodesOutOfRange(TNode n,int n1,int n2){
    	if(n == null){
    		return null;
    	}
    	RemoveNodesOutOfRange(n.left,n1,n2);
    	RemoveNodesOutOfRange(n.right,n1,n2);
    	if(n.data < n1){
    		TNode rchild = n.right;
    		return rchild;
    	}
    	else if(n.data>n2){
    		TNode lchild = n.left;
    		return lchild;
    	}
    	return n;
    }*/
    
    public TNode MergeTrees(TNode tr1, TNode tr2){
		if(tr1 == null){
			return null;
		}
		TNode current1 = tr1;
		TNode current2 = tr2;
		Stack<TNode> st1 = new Stack<TNode>();
		Stack<TNode> st2 = new Stack<TNode>();
		boolean done1 = false;
		boolean done2 = false;
		int size1 = size(tr1);
		int size2 = size(tr2);
		int[] aux1 = new int[size1];
		int[] aux2 = new int[size2];
		int ind1 = 0;
		int ind2 = 0;
		while(!done1){
			if(current1 != null){
				st1.push(current1);
				current1 = current1.left;
			}
			if(current1 == null){
				if(!st1.isEmpty()){
					aux1[ind1] = st1.peek().data;
					ind1++;
					current1 = st1.pop().right;
				}else{
					done1 = true;
				}
			}
		}
		while(!done2){
			if(current2 != null){
				st2.push(current2);
				current2 = current2.left;
			}
			if(current2 == null){
				if(!st2.isEmpty()){
					aux2[ind2] = st2.peek().data;
					ind2++;
					current2 = st2.pop().right;
				}else{
					done2 = true;
				}
			}
		}
		return arraymerge(aux1,aux2);
	 }
    
    public TNode arraymerge(int[] arr1,int[] arr2){
    	int size = arr1.length + arr2.length;
    	int[] mergearr = new int[size];
    	int ind = 0;
    	for(int i=0;i<arr1.length;i++){
    		mergearr[ind]=arr1[i];
    		ind++;
    	}
    	for(int j=0;j<arr2.length;j++){
    		mergearr[ind++]=arr2[j];
    	}
        Arrays.sort(mergearr);
        int[] newarr = new int[mergearr.length];
        for(int l=0;l<mergearr.length;l++){
        	newarr[l] = (Integer)mergearr[l];
        }
        return SortedArrayToBST(newarr, 0, newarr.length-1);
    }
 
    public TNode MergeBST(TNode h1, TNode h2){
    	int[] aux1 = inorderarray(h1,size(h1));
    	int[] aux2 = inorderarray(h2,size(h2));
    	int[] resarr = new int[aux1.length + aux2.length];
    	int ind = 0;
    	for(int i=0;i<aux1.length;i++){
    		resarr[ind++] = aux1[i];
    	}
    	for(int i=0;i<aux2.length;i++){
    		resarr[ind++] = aux2[i];
    	}
    	Arrays.sort(resarr);
    	return SortedArrayToBST(resarr, 0, resarr.length-1);
    }
    
    public int[] inorderarray(TNode n, int size){
    	int[] resarr = new int[size];
    	int ind = 0;
    	Stack<TNode> st = new Stack<TNode>();
    	while(!st.isEmpty() || n!=null){
    		if(n != null){
    			st.push(n);
    			n = n.left;
    		}else{
    			resarr[ind++] = st.peek().data;
    			n = st.pop().right;
    		}
    	}
    	return resarr;
    }
}