
public class ReverseList {
	
	public static TNode ReverseRecursion(TNode head){
		if(head == null || head.next == null){
			return null;
		}
		
		TNode second = head.next;
		head.next = null;
		
		TNode rest = ReverseRecursion(second);
		second.next = head;
		
		return rest;
	}
	
	public static TNode ReverseIterate(TNode head){
		if(head == null || head.next == null){
			return null;
		}
		TNode p1 = head;
		TNode p2 = head.next;
		head.next = null;
		
		while(p1!=null && p2!=null){
			TNode temp = p2.next;
			p2.next = p1;
			p1 = p2;
			if(temp!=null){
				p2 = temp;
			}else{
				break;
			}
		}
		return p2;
	}
	public static void PrintList(TNode head){
		TNode current = head;
		
		while(current!=null){
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		TNode five = new TNode(5,null);
		TNode four = new TNode(4,five);
		TNode three = new TNode(3,four);
		TNode two = new TNode(2,three);
		TNode head = new TNode(1,two);
		System.out.println("Original List:");
		PrintList(head);
		ReverseRecursion(head);
		System.out.println("\nAfter first Reversal:");
		PrintList(five);
		ReverseIterate(five);
		System.out.println("\nAfter second reversal, we get back original:");
		PrintList(head);
		
	}
}
