import java.util.NoSuchElementException;

public class BoundedQueue {
	private Object[] array;
	private int size=0;
	private int head = 0;
	private int tail = 0;
	
	public BoundedQueue(int capacity){
		array = new Object[capacity];
	}
	public void Enqueue(Object item){
		if(size==array.length){
			throw new IllegalStateException("Canot add to full Queue");
		}
		array[tail] = item;
		tail = (tail + 1) % array.length;  //Important line
		size++;
	}
	public Object Dequeue(){
		if(size==0){
			throw new NoSuchElementException("Cannot dequeue from empty queue");
		}
	   Object result = array[head];
	   array[head] = null;
	   head = (head + 1) % array.length;
	   size--;
	   return result;
	}
	public Object Front(){
		if(size==0){
			throw new NoSuchElementException("Cannot get Front from empty queue");
		}
		return array[0];
	}
	public Object Rear(){
		if(size==0){
			throw new NoSuchElementException("Cannot get Rear from empty queue");
		}
		return array[size-1];
	}
	public Boolean isEmpty(){
		return size == 0;
	}
	public int size(){
		return size;
	}
}
