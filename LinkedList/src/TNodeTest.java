
public class TNodeTest {
	public static void main(String[] args){
	TNode e = new TNode(30,null);
	TNode d = new TNode(15,e);
	TNode head1 = new TNode(10,d);
	TNode c = new TNode(9,d);
	TNode b = new TNode(6,c);
	TNode head2 = new TNode(3,b);
	
	/*(head1) 10->15->30->
	  (head2) 3->6->9->15->30->*/
	
	
	TNodeMethods tm = new TNodeMethods();
	
	tm.PrintList(head1);
	tm.PrintList(head2);
	
	int intersect_point = tm.getIntersection(head1, head2);
	
	tm.CheckIntersectionExits(head2, head1);
	System.out.println("Intersection Point is: "+intersect_point);
	
	TNode zz = new TNode(6,null);
	TNode yy = new TNode(5,zz);
	TNode xx = new TNode(4,yy);
	TNode ww = new TNode(3,xx);
	TNode vv = new TNode(2,ww);
	TNode head3 = new TNode(1,vv);
	
	TNode z = new TNode(6,null);
	TNode y = new TNode(5,z);
	TNode x = new TNode(4,y);
	TNode head4 = new TNode(2,x);
	
	tm.PrintList(head3);
	tm.PrintList(head4);
	
	tm.SortedIntersect(head3, head4);
	
	TNode a4 = new TNode(1,null);
	TNode a3 = new TNode(2,a4);
	TNode a2 = new TNode(3,a3);
	TNode a1 = new TNode(2,a2);
	TNode a0 = new TNode(1,a1);
	System.out.print("Before Removal of Duplicates: ");
	tm.PrintList(a0);
	
	System.out.println("Nth to Last Node: "+tm.NthToLast(a0, 5));
	
	tm.RemoverDupsWithoutBuffer(a0);
	System.out.print("After Removal of Duplicates: ");
	tm.PrintList(a0);
	
	TNode b4 = new TNode(1,null);
	TNode b3 = new TNode(2,b4);
	TNode b2 = new TNode(3,b3);
	TNode b1 = new TNode(2,b2);
	TNode b0 = new TNode(1,b1);
	System.out.print("Before Deletion of 3rd node: ");
	tm.PrintList(b0);
	tm.deleteNode(b2);
	System.out.print("After Deletion of 3rd node: ");
	tm.PrintList(b0);
	
	TNode c3 = new TNode(2,null);
	TNode c2 = new TNode(7,c3);
	TNode c1 = new TNode(2,c2);
	TNode d3 = new TNode(3,null);
	TNode d2 = new TNode(4,d3);
	TNode d1 = new TNode(1,d2);
	System.out.println("Input Lists for addition: ");
	tm.PrintList(d1);
	tm.PrintList(c1);
	TNode res = tm.SumLists(c1, d1);
	System.out.println("Added Result List:");
    tm.PrintList(res);
    
    TNode l4 = new TNode(5,null);
	TNode l3 = new TNode(4,l4);
	TNode l2 = new TNode(3,l3);
	TNode l1 = new TNode(2,l2);
	TNode l0 = new TNode(1,l1);
	l4.next = l3;
	if(tm.DetectLoop(l0)){
		System.out.println("Loop Exists");
	}else{
		System.out.println("No Loop");
	}
	tm.PrintList(l0);
	System.out.println();
	TNode q4 = new TNode(1,null);
	TNode q3 = new TNode(2,q4);
	TNode q2 = new TNode(3,q3);
	TNode q1 = new TNode(2,q2);
	TNode q0 = new TNode(1,q1);
	tm.PrintList(q0);
	System.out.println("Mid Element is "+tm.MidElement(q0));
	
	
		TNode ll4 = new TNode(5,null);
		TNode ll3 = new TNode(4,ll4);
		TNode ll2 = new TNode(3,ll3);
		TNode ll1 = new TNode(2,ll2);
		TNode ll0 = new TNode(1,ll1);
		ll4.next = ll3;
	System.out.println("Start of loop is:"+tm.findStartOfLoop(ll0).data);
	
	TNode n5 = new TNode(5,null);
	TNode n4 = new TNode(4,n5);
	TNode n3 = new TNode(3,n4);
	TNode n2 = new TNode(4,n3);
	TNode n1 = new TNode(5,n2);
	System.out.println("List Palindrome check?? "+tm.ListPalindrome(n1));
	}
	
}
