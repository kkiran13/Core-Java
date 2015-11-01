
public class BSTTest {
	public static void main(String[] args){
	  	  BSTNode bn = new BSTNode();
	  	  TNode root = null;
	  	  root = bn.insert(root, 50);
	  	  root = bn.insert(root, 30);
	  	  root = bn.insert(root, 20);
	  	  root = bn.insert(root, 40);
	  	  root = bn.insert(root, 70);
	  	  root = bn.insert(root, 60);
	  	  root = bn.insert(root, 80);
	  	  if(bn.bstsearch(root, 30)){
	  		  System.out.println("Key Found");
	  	  }
	  	  else{
	  	   System.out.println("Key Not Found");
	  	  }
	  	  System.out.print("InOrder Traversal: ");
	  	  bn.inorder(root);
	  	  System.out.print("\nPreOrder Traversal: ");
	  	  bn.preorder(root);
	  	  System.out.print("\nPostOrder Traversal: ");
	  	  bn.postorder(root);
	  	  System.out.println("\nMinimum value node in BST is: "+bn.minvaluenode(root).data);
	  	  System.out.println("Maximum value node in BST is: "+bn.maxvaluenode(root).data);
	  	  //bn.delete(root, 40);
	  	  bn.inorder(root);
	  	  TNode pre = null;
	  	  TNode succ = null;
	  	  //bn.findpresucc(root, pre, succ, 40);
	  	  TNode a = new TNode(4);
	  	  a.left = new TNode(2);
	  	  TNode b = a.left;
	  	  a.right = new TNode(5);
	  	  TNode c = a.right;
	  	  a.left.left = new TNode(1);
	  	  TNode d = a.left.left;
	  	  a.left.right = new TNode(3);
	  	  TNode e = a.left.right;
	  	  bn.inorder(a);
	  	  System.out.println("\nIs BST???: "+bn.isBST(a));
	  	  System.out.println("IS BST Efficient: "+bn.isbstefficient(root));
	  	  System.out.println("Lowes Common Ancestor of 20 and 40 is: "+bn.lca(root, 20, 40).data);
	  	System.out.println("Lowes Common Ancestor of 20 and 40 without recurse is: "+bn.lcanorecurse(root, 20, 40).data);
	  		int[] intarr = {4,2,5,1,3};
	  		int start = 0;
	  		int end = intarr.length - 1;
	  		System.out.print("Sorted array is: ");
	  	bn.printSortedarray(intarr, start, end);
	  	System.out.println("\nInOrder Successor of "+d.data+" is: "+bn.InOrderSuccessor(a, d).data);
	  	System.out.println("\nInOrder Predecessor of "+c.data+" is: "+bn.InOrderPredecessor(a, c).data);
	  	int k = 2;
	  	System.out.print(k+"th smallest element in BST is: ");
	  	bn.kthsmallest(a,k);
	  	System.out.print("\nBST Keys in the range are: ");
	  	bn.bstrange(root, 20, 75);
	  	System.out.print("\nBST Keys in the range using Recursion are: ");
	  	bn.bstrangerecurse(root, 5, 75);
	  	System.out.println();
	  	int[] sortarr = {1,2,3,4,5,6,7};
	  	System.out.println();
	  	TNode newroot = bn.SortedArrayToBST(sortarr, 0, sortarr.length-1);
	  	bn.inorder(newroot);
	  	System.out.println("\nSize of largest BST is: "+bn.largestbst(a));
	  	int[] arr1 = {8, 3, 6, 1, 4, 7, 10, 14, 13};
	  	int arr2[] = {8, 10, 14, 3, 6, 4, 1, 7, 13};
	  	System.out.println("\n Identical BST's from arrays?? "+bn.identicalBSTcheckfromArrays(arr1, arr2, arr1.length, arr2.length));
	  	System.out.print("InOrder is: ");
	  	bn.inorder(root);
	  	bn.addSum(root, 0);
	  	System.out.print("\nAfter adding greater values to every Node, InOrder is: ");
	  	bn.inorder(root);
	  	int[] arr = {8, 3, 5, 7, 6};
	  	System.out.println("\nHas Only one Child?? "+bn.HasOnlyOneChild(arr));
	  	/*bn.inorder(a);
	  	a = bn.RemoveNodesOutOfRange(a, 2, 4);
	  	System.out.println();
	  	bn.inorder(a);*/
	  	TNode neww = null;
	  	neww = bn.MergeTreesUtil(a, root);
	  	System.out.print("InOrder Travesal of Merged Trees is: ");
	  	bn.inorder(neww);
	  	System.out.println("\nVertical Order of Tree: ");
	  	TNode n1 = new TNode(1);
	  	n1.left = new TNode(2);
	  	n1.right = new TNode(3);
	  	n1.left.left = new TNode(4);
	  	n1.left.right = new TNode(5);
	  	n1.right.left = new TNode(6);
	  	n1.right.right = new TNode(7);
	  	n1.right.left.right = new TNode(8);
	  	n1.right.right.right = new TNode(9);
	  	bn.PrintVertical(n1);
	  	TNodeMethods tm = new TNodeMethods();
	  	tm.doubletr(n1);
	  	bn.inorder(n1);
	 }
}
