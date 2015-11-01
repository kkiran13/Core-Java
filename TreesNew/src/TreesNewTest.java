
public class TreesNewTest {
	public static void main(String[] args)
	 {
	  Node<Integer> one = new Node<Integer>(1);
	  Node<Integer> two = new Node<Integer>(2);
	  Node<Integer> three = new Node<Integer>(3);
	  Node<Integer> four = new Node<Integer>(4);
	  Node<Integer> five = new Node<Integer>(5);
	  Node<Integer> six = new Node<Integer>(6);
	  Node<Integer> seven = new Node<Integer>(7);
	  Node<Integer> eight = new Node<Integer>(8);
	  Node<Integer> nine = new Node<Integer>(9);
	  one.setLeft(two);
	  one.setRight(three);
	  two.setLeft(four);
	  two.setRight(five);
	  three.setLeft(six);
	  four.setLeft(seven);
	  six.setLeft(eight);
	  six.setRight(nine);
	  TreesNewMethods tr = new TreesNewMethods();
	  System.out.println("Preorder");
	  tr.preorder(one);
	  System.out.println();
	  System.out.println("Inorder");
	  tr.inorder(one);
	  System.out.println();
	  System.out.println("Postorder");
	  tr.postorder(one);
	  System.out.println();
	  System.out.println("Levelorder");
	  tr.levelorder(one);
	  System.out.println();
	  System.out.println("Spiral Order Traversal");
	  tr.levelorderspiral(one);
	  System.out.println();
	  System.out.println();
	  System.out.println("Size of tree is: "+tr.size(one));
	  System.out.println("Height or Depth of tree is: "+tr.height(one));
	  //Create New Tree
	  Node<Integer> newone = new Node<Integer>(1);
	  Node<Integer> newtwo = new Node<Integer>(2);
	  Node<Integer> newthree = new Node<Integer>(3);
	  Node<Integer> newfour = new Node<Integer>(4);
	  Node<Integer> newfive = new Node<Integer>(5);
	  Node<Integer> newsix = new Node<Integer>(6);
	  Node<Integer> newseven = new Node<Integer>(7);
	  Node<Integer> neweight = new Node<Integer>(8);
	  Node<Integer> newnine = new Node<Integer>(9);
	  newone.setLeft(newtwo);
	  newone.setRight(newthree);
	  newtwo.setLeft(newfour);
	  newtwo.setRight(newfive);
	  newthree.setLeft(newsix);
	  newfour.setLeft(newseven);
	  newsix.setLeft(neweight);
	  newsix.setRight(newnine);
	  System.out.println("Trees identical?? Answer is: "+tr.sameTree(one, newone));
	  //DeleteTree dt = new DeleteTree();
	  //dt.deletetree(newone);
	  //System.out.println("Tree Deleted");
	  //DeleteLeaves dl = new DeleteLeaves();
	  Node<Integer> root = new Node<Integer>(1);
	  Node<Integer> a = new Node<Integer>(2);
	  Node<Integer> b = new Node<Integer>(3);
	  Node<Integer> c = new Node<Integer>(4);
	  Node<Integer> d = new Node<Integer>(5);
	  root.setLeft(a);
	  root.setRight(b);
	  a.setLeft(c);
	  a.setRight(d);
	  System.out.print("Before Mirror: ");
	  tr.levelorder(root);
	  tr.mirror(root);
	  System.out.println();
	  System.out.print("After Mirror: ");
	  tr.levelorder(root);
	  /*         Original                  Mirror
	   *              1                         1
	   *			/   \                      / \ 
	   *		   2     3                    3   2
	   *		  / \                            / \
	   *         4   5                          5   4
	   */ 
	  System.out.println();
	  System.out.print("Original: ");
	  tr.mirror(root);
	  tr.levelorder(root);
	  System.out.println();
	  System.out.println("Paths from root to leaves is below for above original tree");
	  int pathlen = 0;
	  int[] patharray = new int[10];
	  tr.printPathsRecur(root,patharray,pathlen);
	  System.out.println();
	  System.out.println("are the leaves. Number of Leaf Nodes: "+tr.leafcount(root));	
	  Node<Integer> a1 = new Node<Integer>(50);
	  Node<Integer> a2 = new Node<Integer>(7);
	  Node<Integer> a3 = new Node<Integer>(2);
	  Node<Integer> a4 = new Node<Integer>(3);
	  Node<Integer> a5 = new Node<Integer>(5);
	  Node<Integer> a6 = new Node<Integer>(1);
	  Node<Integer> a7 = new Node<Integer>(30);
	  Node<Integer> a8 = new Node<Integer>(38);
	  Node<Integer> a9 = new Node<Integer>(10);
	  a1.setLeft(a2);
	  a1.setRight(a3);
	  a2.setLeft(a4);
	  a2.setRight(a5);
	  a3.setLeft(a6);
	  a3.setRight(a7);
	  a7.setRight(a8);
	  a8.setRight(a9);
	  System.out.println("Children Sum Property?? "+tr.childrensum(a1));
	  System.out.println();
	  System.out.println("Before Child Sum Tree Conversion");
	  tr.levelorder(a1);
	  tr.childsumtree(a1);
	  System.out.println();
	  System.out.println("After Child Sum Tree Conversion");
	  tr.levelorder(a1);
	  tr.levelorder(a1);
	  System.out.println();
	  System.out.println("Diameter is: "+tr.diameter(a1));
	  System.out.println();
	  System.out.println("Tree Height Balanced?? "+tr.balance(a1));
	  System.out.println();
	  System.out.print("Stack without Recursion InOrder: ");
	  tr.StackInOrder(root);
	  System.out.println();
	  System.out.print("Morris Travel InOrder: ");
	  tr.MorrisTravel(root);
	  System.out.println();
	  System.out.println("PathSumCheck?? "+tr.pathsum(root, 8));
	  System.out.print("Before Double: ");
	  tr.levelorder(root);
	  tr.doubletr(root);
	  System.out.print("After Double: ");
	  tr.levelorder(root);
	  System.out.println();
	  System.out.println("Width of Tree is: "+tr.getMaxWidth(a1));
	  System.out.println("Is Foldable?? "+tr.isFoldable(root));
	  Node<Integer> b1 = new Node<Integer>(50);
	  Node<Integer> b2 = new Node<Integer>(30);
	  Node<Integer> b3 = new Node<Integer>(70);
	  Node<Integer> b4 = new Node<Integer>(20);
	  Node<Integer> b5 = new Node<Integer>(40);
	  Node<Integer> b6 = new Node<Integer>(60);
	  Node<Integer> b7 = new Node<Integer>(80);
	  b1.setLeft(b2);
	  b1.setRight(b3);
	  b2.setLeft(b4);
	  b2.setRight(b5);
	  b3.setLeft(b6);
	  b3.setRight(b7);
	  System.out.print("Boundary Traversal is: ");
	  tr.PrintBoundary(b1);
	  System.out.println();
	/*  		1
	  		   / \
	  		  2   3                   Boundary is 1 2 4 6 3
	  		 / \
	        4  	5
	             \
	              6
	              */
	  System.out.print("Ancestors of Target: ");
	  tr.PrintAncestor(b1, 60);
	  System.out.println("\n"+tr.isBST(one));
	  
	  System.out.println("Paths from root to leaves is below for above original tree");
	
	  tr.printPathsRecur(b1,patharray,pathlen);
	  System.out.println();
  }  
}

 
       