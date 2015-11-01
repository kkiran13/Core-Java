class LinkedLis {

    Node head = null;

    public void append(int val) {
        Node lastNode = getLastNode();
        if (lastNode == null) {    //if list empty, then set a head to the list
            head = new Node(val);
        } else {   // set a node next to last node
            lastNode.next = new Node(val);
        }
    }
    
    private Node getLastNode() {   //get node
        if (head == null) {   //check if list empty
            return null;
        }
        Node tmpNode = head;    
        while (tmpNode.next != null) {   //return last node of the list
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }
    
    public void print() {
        System.out.println("");
        if(head == null){  //if list empty
            System.out.print("EMPTY");
            return;
        }
        Node tmpNode = head;  // print all nodes all elements are printed
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
    }

    public void delete(int val) {
        if(head == null){   // if list is empty return nothing
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null && currNode.num != val) {  // when currnode matches input val , then enters if loop
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(prevNode == null){
            head = head.next;
            return;
        }
        if (currNode == null) {
            System.out.println("A node with that value does not exist");
            return;
        }
        prevNode.next = currNode.next;
    }


       public static void main(String[] args) {
        LinkedLis myList = new LinkedLis();
        myList.print();
        myList.append(35);
        myList.append(33);
        myList.print();
        myList.delete(33);
        myList.delete(30);
        myList.append(36);
        myList.print();
    }
}

