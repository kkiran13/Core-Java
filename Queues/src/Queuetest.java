
public class Queuetest {
	public static void main(String[] args){
		System.out.println("Array Queue Test");
		BoundedQueue queue = new BoundedQueue(3);
		queue.Enqueue(10);
		queue.Enqueue(20);
		queue.Enqueue(30);
		System.out.println("Rear is "+queue.Rear());
		System.out.println("Front is "+queue.Front());
		while(!queue.isEmpty()){
			System.out.println(queue.Dequeue());
			}
		System.out.println();
		
		System.out.println("Linked Queue Test");
		LinkedQueue Queue = new LinkedQueue();
		Queue.enqueue(10);
		Queue.enqueue(20);
		Queue.enqueue(30);
		System.out.println("Rear is "+Queue.rear());
		System.out.println("Front is "+Queue.front());
		System.out.println("Size is: "+Queue.size());
		while(!Queue.isEmpty()){
		System.out.println(Queue.dequeue());
		}
		System.out.println();
		
		
		System.out.println("Stack Queue Test");
		Stackqueue qu = new Stackqueue();
		qu.enqueue(10);
		qu.enqueue(20);
		qu.enqueue(30);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
	}
}
