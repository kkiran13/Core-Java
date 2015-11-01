import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithTwoStacks{
    private Stack<Integer> stack1;    // back of queue
    private Stack<Integer> stack2;    // front of queue

    // create an empty queue
    public QueueWithTwoStacks() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    // move all items from stack1 to stack2
    private void moveStack1ToStack2() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    // is the queue empty?
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


    // return the number of items in the queue.
    public int size() {
        return stack1.size() + stack2.size();     
    }

    // return the item least recently added to the queue.
    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.peek();
    }

    // add the item to the queue
    public void enqueue(int item) {
        stack1.push(item);
    }

    // remove and return the item on the queue least recently added
    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.pop();
    }

    // a test client
    public static void main(String[] args) {
        QueueWithTwoStacks q = new QueueWithTwoStacks();
        q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println("(" + q.size() + " left on queue)");
    }
}

