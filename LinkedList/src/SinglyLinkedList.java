import java.util.Stack;

public class SinglyLinkedList {
	private Node head;
	private int listcount;
	
	public SinglyLinkedList(){
		head = new Node(null);
		listcount = 0;
	}
	/* This method adds a new node at the last of the Linked List.
     * 1. First we have created a tempory Node "tempNode".
     * 2. Then we are taking the reference of first node in a Node variable "current".
     * 3. We are iterating through the Linked List until we reach the last element.
     * 4. The last node always points to null. After reaching the last Node we are making
           it to point the temp node which we have created.
     */
	public void add(Object data){
		Node tempnode = new Node(data);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(tempnode);
		listcount++;
	}
	 /* This method adds a new node at the user provided position of the Linked List.
     * 1. First we have created a tempory Node "tempNode".
     * 2. Then we are taking the reference of first node in a Node variable "current".
     * 3. We are iterating through the Linked List until we reach the specified position 
          or the last element.
     * 4. If we reach the specified position then we add the temp node at that position 
          else we add it at the last.
     */
	public void add(Object data, int position){
		Node tempnode = new Node(data);
		Node current = head;
		for(int i=0; i<position && current.getNext()!=null;i++){
			current = current.getNext();
		}
		tempnode.setNext(current.getNext());
		current.setNext(tempnode);
	}
	/* This method removes the last node from the Linked List.
     * 1. If the list is empty then we will return.
     * 2. Then we are taking the reference of first node in a Node variable "current".
     * 3. We are iterating through the Linked List until we reach the second last node in 
          the list.
     * 4. Now "current" will contain the reference of second last node. We will point it 
          to null and decrease the "listCount" by 1.
     */
	public void remove(){
		if(listcount==0){
			return;
		}
		Node current = head;
		while(current.getNext().getNext()!=null){
			current = current.getNext();
		}
		current.setNext(null);
		listcount--;
	}
	
	public void remove(int n){ // delete a node at a particular position
	    Node cur = head;
	    int length = 0;
	    while(cur.getNext() != null){
	    	length++;
	    	cur = cur.getNext();
	    }
		Node current = head;
		if (n == 0){
			System.out.println("Not a valid index");	
		} else if (n <= length){
		for(int i=1;i<n;i++){
			current = current.getNext();
	    } 
		current.setNext(current.getNext().getNext());
		listcount--;
	   } 
		else{
			System.out.println("Index exceed list boundary. Hence cannot be deleted");
		} 
    }
	
	public void deletelist(){ //delete entire list
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
			current.setNext(null);
		}
		head.setNext(null);
	}
	
	public int countelement(int n){ //number of times a digit occurs in a list
		Node current = head;
		int count = 0;
		while(current.getNext() != null) {
		current = current.getNext();
		if(Integer.parseInt(current.getData().toString()) == n){
			count++;
			System.out.println(count);
			System.out.println(current.getData());
		}
		}
		return count;
	}
	
	public String toString(){
		Node current = head.getNext();
		String output = "";
		while(current != null){
			output += "["+current.getData().toString()+"]";
			current = current.getNext();
		}
		return output;
	}
	
	public Object Midelement(){
		Node slow = head;
		Node fast = head;
		int length = 0;
		while(fast.getNext() != null){
			length++;
			if(length%2 == 0){
				slow = slow.getNext();
			}
			fast = fast.getNext();
		}
		/* If the size of Linked List is one then we are returning the first element 
		of the Linked List as the middle element.*/
		if(length == 1){
			slow = slow.getNext();
		}
		System.out.println("Length of list is: "+length);
		return slow.getData();
    }
	
	public Object Nthelementfromend(int n){
		Node slow = head;
		Node fast = head;
		for(int i=0;i<n;i++){
			if(fast.getNext() != null){
				fast = fast.getNext();
			}else{
				return null;
			}
		}
		// Move both the pointers simultaneously until we reach the end of the list.
		while(fast.getNext()!=null){
			fast = fast.getNext();
			slow = slow.getNext();
		}
		slow = slow.getNext();
		return slow.getData();
    }
	
	public Object Nthelementfromstart(int n){
		Node current = head;
		for(int i=0;i<n;i++){
			if (current.getNext() != null){
			current = current.getNext();
			} else {
				return null;
			}
		}
		return current.getData();
	}
	
	public boolean listpalindrome(){
		Stack<Object> st = new Stack<Object>();
	    boolean flag = false;
	    Node current = head;
	    while(current.getNext() != null){
	    	st.push(current.getNext().getData());
	    	current = current.getNext();
	    }
	    Node cur = head;
	    while(cur.getNext()!=null){
	    	cur = cur.getNext();
	    	if(cur.getData().equals(st.pop())){
	    		flag = true;
	    	}else{
	    		flag = false;
	    	}
	    }
		return flag;
	}
	
	/*public void reverselist(SinglyLinkedList list){
		System.out.println("in");
		if (head == null || head.getNext() == null) {
            System.out.println("List too small to be reversed");
        }
		Node prev,current,next;
		prev = head;
		System.out.println(prev.getNext().getData());
		current = head.getNext();
		next = current.getNext();
		while(prev.getNext() != null){
			next.setNext(current);
			current.setNext(prev);
			prev.setNext(null);
			prev = current.getNext();
		}
		Node cur = head;
		while(cur.getNext() != null){
			System.out.println(cur.getData());
			cur = cur.getNext();
		}
	}*/
	
	public class Node {
		Object data;
		Node next;
		
		public Node(Object data){
			this.data = data;
			this.next = null;
		}
		public Object getData(){
			return data;
		}
		public Node getNext(){
			return next;
		}
		public void setNext(Node next){
			this.next = next;
		}
	}
}

/*public boolean linkedloop(){
HashMap<Integer,String> hmap = new HashMap<Integer, String>(); 
Node current = head;
String val = "one";
while(current.getNext() != null){
int key = Integer.parseInt(current.getNext().toString());
current = current.getNext();
if(hmap.containsKey(key)){
	return true;
}else {
	hmap.put(key, val);
}
}
return false;
}*/