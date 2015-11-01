import java.util.*;

public class iteratordemo {

   public static void main(String args[]) {
      // Create an array list
      ArrayList al = new ArrayList();
      // add elements to the array list
      al.add("A");
      al.add("B");
      al.add("C");
      al.add("D");
      al.add("E");
      al.add("F");
      System.out.println(al.get(1));
      System.out.println(al.get(al.size()-1));
      // Use iterator to display contents of al
      System.out.print("Original contents of al: ");
      Iterator itr = al.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();
      
	  // Modify objects being iterated
      ListIterator litr = al.listIterator();
      //System.out.println("last is "+litr.previous());

    	  
      while(litr.hasNext()) {
         Object element = litr.next();
         litr.set(element + "+");
      }
      System.out.print("Modified contents of al: ");
      itr = al.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();
      
      

      // Now, display the list backwards
      System.out.print("Modified list backwards: ");
      while(litr.hasPrevious()) {
         Object element = litr.previous();
         System.out.print(element + " ");
       }
       System.out.println();
    }
}