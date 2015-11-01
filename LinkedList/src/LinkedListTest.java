
public class LinkedListTest {
    
    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("Middle element of initial List is: "+list.Midelement());
        System.out.println("Nth element of initial List is: "+list.Nthelementfromend(2));
        System.out.println("Nth element of initial List is: "+list.Nthelementfromstart(3));
        System.out.println();
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        list.remove(3);
        System.out.println("List after element at 3rd position is deleted\n"+list);
        list.deletelist();
        System.out.println("List after deletion is: "+list+"empty");
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(list);
        int num = 1;
        System.out.println("Number of times "+num+" occurs in list is: "+list.countelement(num));
        list.deletelist();
        list.add("r");
        list.add("a");
        list.add("d");
        list.add("a");
        list.add("r");
        System.out.println(list);
        System.out.println("List Plaindrome?? "+list.listpalindrome());
        list.deletelist();
        list.add("r");
        list.add("a");
        list.add("d");
        //System.out.println("hi");
        //list.reverselist(list);
        System.out.println(list);
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add(10);
        list1.add(15);
        list1.add(30);
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(15);
        list2.add(30);
     }
}