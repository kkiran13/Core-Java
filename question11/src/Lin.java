
public class Lin {
Node head = null;
int[] arr = new int[128];

public void append(int val) {
	Node lastnode = getlast();
	if (lastnode == null){
		head = new Node(val);
	}
	else {
		lastnode.next = new Node(val);
	}
}

public Node getlast(){
	if (head == null){
		return null;
	}
	Node tem = head;
		while (tem.next != null){
			tem = tem.next;
		}
	return tem;
}

public void print(){
	System.out.println("");
	if (head == null){
		System.out.println("EMPTY LIST");
		//return;
	}
	Node tmp = head;
	while(tmp != null){
		System.out.println(tmp.num+"->");
		tmp = tmp.next;
	}
}

public void nth(int n){
	
}

public static void main(String[] args){
	Lin li = new Lin();
	li.print();
	li.append(2);
	li.print();
}
}
