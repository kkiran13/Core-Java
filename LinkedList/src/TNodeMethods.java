import java.util.Stack;


public class TNodeMethods {
	public int getCount(TNode head){
		TNode current = head;
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void PrintList(TNode head){
		TNode current = head;
		while(current != null){
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println();
	}
	
/*Intersection Point in Linked Lists Algorithm:
 * 1) Get count of the nodes in first list, let count be c1.
2) Get count of the nodes in second list, let count be c2.
3) Get the difference of counts d = abs(c1 – c2)
4) Now traverse the bigger list from the first node till d nodes so that from here onwards
 both the lists have equal no of nodes.
5) Then we can traverse both the lists in parallel till we come across a common node. 
(Note that getting a common node is done by comparing the address of the nodes)*/
	
	public int getIntersection(TNode head1, TNode head2){
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;
		if(c1 > c2){
			d = c1 - c2;
			return getInterUtil(d,head1,head2);
		}else{
			d = c2 - c1;
			return getInterUtil(d,head2,head1);
		}
	}
	
	public int getInterUtil(int d,TNode head1, TNode head2){
		int i = 0;
		TNode cur1 = head1;
		TNode cur2 = head2;
		while(i < d){
			if(cur1 == null){
				return -1;
			}
			cur1 = cur1.next;
			i++;
		}
		while(cur1 != null && cur2 != null){
			if(cur1 == cur2){
				return cur1.data;
			}
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		return -1;
	}
	
	/* To check if an Intersection exists
	 * 1) Traverse the list 1, store the last node address
2) Traverse the list 2, store the last node address.
3) If nodes stored in 1 and 2 are same then they are intersecting.*/
	public void CheckIntersectionExits(TNode head1, TNode head2){
		TNode cur1 = head1;
	    TNode cur2 = head2;
	    while(cur1.next!=null){
	    	cur1 = cur1.next;
	    }
	    while(cur2.next!=null){
	    	cur2 = cur2.next;
	    }
	    if(cur1 == cur2){
	    	System.out.println("Intersection Point Exists");
	    }else{
	    	System.out.println("No Intersection Point Exists");
	    }
	}
	
	public void SortedIntersect(TNode head1, TNode head2){
		TNode cur1 = head1;
		TNode cur2 = head2;
        Stack<Integer> st = new Stack<Integer>();
		while(cur1 != null && cur2 != null){
			if(cur1.data == cur2.data){
				st.push(cur1.data);
				cur1 = cur1.next;
				cur2 = cur2.next;
			}else if(cur1.data < cur2.data){
				cur1 = cur1.next;
			}else{
				cur2 = cur2.next;
			}
		}
		TNode prev = null;
		if(!st.isEmpty()){
		prev = new TNode(st.pop(),null);
		while(!st.isEmpty()){
			TNode a = new TNode(st.pop(),prev);
			prev = a;
		}
		}
		System.out.print("Sorted Intersect is: ");
		PrintList(prev);
	}
	
	public void RemoveDups(TNode head){
		TNode cur = head;
		boolean[] chararray = new boolean[256];
		TNode prev = null;
		while(cur != null){
			if(chararray[cur.data]){
				prev.next = cur.next; //make prev point to next of duplicate node
			}else{
				chararray[cur.data] = true;
				prev = cur;
			}
			cur = cur.next;
		}
	}
	
	public void RemoverDupsWithoutBuffer(TNode head){
		if(head == null){
			return;
		}
		TNode prev = head;
		TNode current = head.next;
		while(current != null){
			TNode runner = head;
			while(runner != current){
				if(runner.data == current.data){
					TNode tmp = current.next;
					prev.next = tmp;
					current = tmp;
					break;
				}
				runner = runner.next;	
			}
			if(runner == current){
				prev = current;
			current = current.next;
			}
		}
	}
	
	public boolean deleteNode(TNode n){
		if(n==null || n.next == null){
			return false;
		}
		TNode nxt = n.next;
		n.data = nxt.data;
		n.next = nxt.next;
		return true;
	}
	
	public TNode SumLists(TNode head1,TNode head2){
        TNode reshead = null;
        TNode temp = null;
        TNode prev = null;
        int carry = 0;
        int sum = 0;
        while(head1!=null && head2!=null){
            sum = carry + (head1!=null?head1.data:0) + (head2!=null?head2.data:0);
        	carry = sum>=10?1:0;
        	sum = sum%10;
        	temp = new TNode(sum,null);
        	if(reshead == null){
        		reshead = temp;
        	}else{
        		prev.next = temp;
        	}
        	prev = temp;
        	if(head1!=null){
        		head1 = head1.next;
        	}
        	if(head2!=null){
        		head2 = head2.next;
        	}
        }
        if(carry>0){
        	temp.next = new TNode(carry,null);
        }
        return reshead;
    }
	
	public int NthToLast(TNode head, int n){
		TNode slow = head;
		TNode fast = head;
		for(int i=0;i<n;i++){
			if(fast == null){
				return -1;
			}
			fast = fast.next;
		}
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}
	/*This method is also dependent on Floyd’s Cycle detection algorithm.
1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
2) Count the number of nodes in loop. Let the count be k.
3) Fix one pointer to the head and another to kth node from head.
4) Move both pointers at the same pace, they will meet at loop starting node.
5) Get pointer to the last node of loop and make next of it as NULL.*/
	public boolean DetectLoop(TNode h1){
		TNode slow = h1;
		TNode fast = h1;
		while(slow!= null && fast!= null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast){
				RemoveLoop(slow, h1);
				return true;
			}
		}
		return false;
	}
	
	public void RemoveLoop(TNode n,TNode head){
		int k=0;
		TNode p1 = n;
		TNode p2 = n;
		while(p1.next != p2){ //count number of nodes in list
			k++;
			p1 = p1.next;
		}
		
		p2 = head;
		for(int i=0;i<k;i++){  //go till kth node and make next of it as null
			p2 = p2.next;
		}
		
		while(p2 != p1){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		p2 = p2.next;
		while(p2.next != p1){
			p2 = p2.next;
		}
		
		p2.next = null;
	}
	
	public int MidElement(TNode head){
		TNode slow = head;
		TNode fast = head;
		int length = 0;
		while(fast.next != null){
			length++;
			if(length %2 ==0){
				slow = slow.next;
			}
			fast = fast.next;
		}
		if(length == 1){
			return slow.data;
		}
		return slow.data;
	}
	
	public static TNode findStartOfLoop(TNode head) {
		TNode n1 = head;
		TNode n2 = head; 

	    // find meeting point using Tortoise and Hare algorithm
	    // this is just Floyd's cycle detection algorithm
	    while (n2.next != null) { 
	        n1 = n1.next; 
	        n2 = n2.next.next; 
	        if (n1 == n2) {
	            break; 
	        }
	    }

	    // Error check - there is no meeting point, and therefore no loop
	    if (n2.next == null) {
	        return null;
	    }

	    /* Move n1 to Head. Keep n2 at Meeting Point.  Each are k steps
	    /* from the Loop Start. If they move at the same pace, they must
	     * meet at Loop Start. */
	    n1 = head; 
	    while (n1 != n2) { 
	        n1 = n1.next; 
	        n2 = n2.next; 
	    }
	    // Now n2 points to the start of the loop.
	    return n2;
	}
	
	public boolean ListPalindrome(TNode head){
		TNode current = head;
		Stack<Integer> st = new Stack<Integer>();
		while(current != null){
			st.push(current.data);
			current = current.next;
		}
		TNode cur = head;
		while(cur != null){
			if(st.pop() != cur.data){
				return false;
			}
			cur = cur.next;
		}
		return true;
	}
	
}
