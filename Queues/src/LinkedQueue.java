import java.util.NoSuchElementException;

public class LinkedQueue {
	
	  private Node head = null;
	  private Node tail = null;
	
    private class Node {
        public int data;
        public Node next;
        public Node(int item, Node next) {
            this.data = item;
            this.next = next;
        }
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void enqueue(int item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {
        	head = newNode;
        } else {
        	tail.next = newNode;
        }
        tail = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int item = head.data;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item;
    }

    public int front() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    
    public int rear() {
        if(head == null){
        	throw new NoSuchElementException();
        }else if(head.next == null){
        	return head.data;
        }else{
        	return tail.data;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while(current != null){
        	count++;
        	current = current.next;
        }
        return count;
    }
    
}