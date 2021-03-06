public class question22 {

	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		System.out.println("Heads"+head);
		if (head == null || n < 1) {
			return null;
		}

		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
			if (p2 == null) {
				return null; // not found since list size < n
			}
			System.out.println("p2"+p2);
			p2 = p2.next;
		}
		if (p2 == null) {
			return null;
		}
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p1;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(5, 0, 10);
		System.out.println(head.printForward());
		int nth = 3;
		LinkedListNode n = nthToLast(head, nth);
		if (n != null) {
			System.out.println(nth + "th to last node is " + n.data);
		} else {
			System.out.println("null");
		}
	}

}
